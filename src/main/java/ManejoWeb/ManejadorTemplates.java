package ManejoWeb;

import Controladores.LoginAsk;
import Modelo.Contador;
import Modelo.UsuarioLogin;
import freemarker.template.Configuration;

import org.spark_project.jetty.server.Authentication;
import spark.ModelAndView;
import spark.Session;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;


import javax.servlet.http.Cookie;
import java.sql.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
import static spark.route.HttpMethod.before;
import static spark.route.HttpMethod.post;

public class ManejadorTemplates {

    static LoginAsk question = new LoginAsk();

    public void manejoTemplates(){
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);
        configuration.setClassForTemplateLoading(ManejadorTemplates.class, "/templates");
        FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine(configuration);


        staticFiles.location("");

/*
        //Dar permisos para navegar
      before((request, response) -> {
          boolean aunthenticated = false;
          System.out.println(response);

          if (!aunthenticated){
              halt(401,"No tiene permisos para entrar aqui");
          }
      });
        */


      get("/", (request, response) -> {
          Map<String,Object>attributes = new HashMap<>();
          attributes.put("Bienvenido","Bienvenido a EPA");
          return new ModelAndView(attributes,"Login.ftl");
      },freeMarkerEngine);


        post("/login/", (request, response) -> {

            Session session = request.session(true);
            String username = request.queryParams("usuario");
            String password = request.queryParams("contrasena");

            boolean confirmar = question.checkLogin(username, password);

            if (confirmar == true) {
                //voy aqui palomo
                session.attribute("usuario", username);
            } else {
                halt(401, "Credenciales incorrectas, intente de nuevo");
            }

            Map<String, Object> attributes = new HashMap<>();
            attributes.put("var", "Bienvenido a EPA");
            // Authentication.User user =  request.session().attribute("usuario");
            //attributes.put("usuario",user);
            return new ModelAndView(attributes, "index.ftl");


        }, freeMarkerEngine);


        //Get from GPRS
        Spark.get("/gprs/:pot/:linea", (request, response) -> {
           float pot = Float.parseFloat(request.params(":pot"));
            int linea = Integer.parseInt(request.params(":linea"));
           // java.util.Date date = new java.util.Date();
            //Date fecha= new Date(date.getDate());

            Calendar cal = Calendar.getInstance();
            Date date = new Date(cal.getTimeInMillis());

            Contador countGprs = new Contador(date,pot,linea);

            /**falta hacer el insert a la base de datos y probar con GPRS*/


            System.out.println(countGprs.getFecha());
            return "Datos recibidos del GPRS han sido insertados en la base de datos";

        });

      //Crear index para procesar formulario del ajax | jquery




}



}





