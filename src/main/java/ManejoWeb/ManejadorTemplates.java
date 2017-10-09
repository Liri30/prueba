package ManejoWeb;

import Modelo.UsuarioLogin;
import freemarker.template.Configuration;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;

import static spark.Spark.before;
import static spark.route.HttpMethod.before;
import static spark.route.HttpMethod.post;

public class ManejadorTemplates {

    public void manejoTemplates(){
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);
        configuration.setClassForTemplateLoading(ManejadorTemplates.class, "/templates");
        FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine(configuration);


       before("/home" , ((request, response) ->{
           UsuarioLogin usuario = request.session().attribute("usuario");

       } ))


    }
}
