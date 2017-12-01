package ManejoWeb;

import Controladores.ContadorControlador;
import Controladores.LoginAsk;
import Modelo.Contador;
import Modelo.ContadorMes;
import Modelo.UsuarioLogin;
import freemarker.template.Configuration;

import org.apache.commons.beanutils.converters.DateConverter;
import org.spark_project.jetty.server.Authentication;
import spark.*;
import spark.template.freemarker.FreeMarkerEngine;


import javax.servlet.http.Cookie;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static spark.Spark.*;
import static spark.route.HttpMethod.before;
import static spark.route.HttpMethod.post;

public class ManejadorTemplates {

    static LoginAsk question = new LoginAsk();

    public void manejoTemplates(){
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);
        configuration.setClassForTemplateLoading(ManejadorTemplates.class, "/templates");
        FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine(configuration);

        ContadorControlador datos = new ContadorControlador();
        FuncionesEPA contMes = new FuncionesEPA();

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
        get("/Home", (request, response) -> {
            Map<String,Object> attributes = new HashMap<>();



            List<Contador> ListData = datos.Mostrar();

            //ListData.add(data);
            //attributes.put("Bienvenido","Bienvenido a EPA");
            //attributes.put("persons",ListData);
            attributes.put("listaData", ListData);
            return new ModelAndView(attributes,"/Home.ftl");
        },freeMarkerEngine);


      get("/", (request, response) -> {
          Map<String,Object>attributes = new HashMap<>();
          attributes.put("Bienvenido","Bienvenido a EPA");
          return new ModelAndView(attributes,"Login.ftl");

      },freeMarkerEngine);


        get("/index/", (request, response) -> {


            System.out.println("Yan la melma!");

//            Session session = request.session(true);
//            String username = request.queryParams("usuario");
//            String password = request.queryParams("contrasena");

           // boolean confirmar = question.checkLogin(username, password);


//            if (confirmar == true) {
//                //voy aqui palomo
//                session.attribute("usuario", username);
//                response.cookie("Log","24",3600);
//            } else {
//                halt(401, "Credenciales incorrectas, intente de nuevo");
//            }

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
            datos.insert(countGprs);//inserta en la base de datos


            System.out.println(countGprs.getFecha());
            return "OK";

        });


        //Formulario que captura el rango de fecha para ver la potencia
        get("/Estadistic", (request, response) -> {
            Map<String, Object> var = new HashMap<>();

            Calendar calendar = Calendar.getInstance();
            Date valorMaxForm = new Date(calendar.getTimeInMillis());

            List<Contador> datosRango = datos.TwoMonthAgo();

            var.put("fechaMax", valorMaxForm);
            var.put("listaRango",datosRango);

            return new ModelAndView(var, "Estadistic.ftl");


        }, freeMarkerEngine);



        post("/Estadistica", (Request request, Response response) -> {

            Map<String, Object> var = new HashMap<>();

            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date fecha1 = sdf1.parse(request.queryParams("fechaInicio"));
            java.util.Date fecha2= sdf1.parse(request.queryParams("fechafin"));


            Date dateIni = new Date(fecha1.getTime());
            Date dateFin = new Date(fecha2.getTime());
            //System.out.println(fecha1+"\n"+fecha2+"\n"+sdf1.toString());


            List<Contador> datosRango = datos.RangoPotenciaFecha(dateIni,dateFin);
            List<ContadorMes> contando = contMes.PotMes(datosRango);
            var.put("listaRango",contando);

//          4  for (ContadorMes c: contando
//                 ) {
//
//                System.out.println(c.getMes()+"\n"+ c.getPotenciaMes());
//
//            }
//            //System.out.println(contando.get(1));
//            System.out.println(contando.size());



            return new ModelAndView(var,"Estadistic.ftl");

        },freeMarkerEngine);




        get("/configuracion" , (request, response) -> {

            Map<String, Object> var = new HashMap<>();

            return new ModelAndView(var,"configuracion.ftl");
        },freeMarkerEngine);


        post("/verificar-log", (request, response) -> {
            String email = request.queryParams("usuario");
            String pss = request.queryParams("contrasena");
            System.out.println(pss);
            Session session = request.session(true);

            boolean conf = question.checkLogin(email,pss);
            //if conf == true
            if (conf){

                //session.attribute("usuario",email);
                //response.cookie("usuario", "usuario", 3600);

                 return true;
            }
            else{
                return false;
            }
        });

        post("/post-test", (request, response) ->
        {

            String email = request.queryParams("correoActual");
            String password = request.queryParams("pass");


            System.out.println(email);
            System.out.println(password);


            boolean check = question.askPass(password);

            //lo unico que se agrego despues que te fuiste!!!!
            if(check)
            {
                question.insertMail(email);
                return "true";
            }else{
                return "false";
            }

        });

        /**Continuar trabajando con este post en casa, insertar los precios a la base de datos por id*/
        post("/configurar-precio", (request, response) -> {
            float pr1 = Float.parseFloat(request.queryParams("pr1"));
            float pr2 = Float.parseFloat(request.queryParams("pr2"));
            float pr3 = Float.parseFloat(request.queryParams("pr3"));
            float pr4 = Float.parseFloat(request.queryParams("pr4"));


            return true;
        });






}



}





