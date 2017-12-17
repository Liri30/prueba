package ManejoWeb;

import Controladores.BuscarPrecio;
import Controladores.ContadorControlador;
import Controladores.LoginAsk;
import Modelo.Contador;
import Modelo.ContadorMes;
import Modelo.Factura;
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

        /**Conifuguracion General para el manejo de templates con freemarker*/
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);
        configuration.setClassForTemplateLoading(ManejadorTemplates.class, "/templates");
        FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine(configuration);

        ContadorControlador datos = new ContadorControlador();
        FuncionesEPA contMes = new FuncionesEPA();

        staticFiles.location("");





/**********/
Login(freeMarkerEngine);
Index(freeMarkerEngine);
Configuracion(freeMarkerEngine);
PaginaGeneral(freeMarkerEngine);
Consulta(freeMarkerEngine);


/***Get de prueba para introducir datos en tabla*/
        get("/Home", (request, response) -> {
            Map<String,Object> attributes = new HashMap<>();
//            HashMap<String, Integer> Yan = new HashMap<String,Integer>();
//
//            Yan.put(contadorMes.getMes,contador.getPotencia)
            List<Contador> ListData = datos.Mostrar();
            attributes.put("listaData", ListData);
            return new ModelAndView(attributes,"/Home.ftl");
        },freeMarkerEngine);







        /******************************Get from GPRS. Recibo datos***********************************/
        Spark.get("/gprs/:pot/:linea", (request, response) -> {
            BuscarPrecio precio = new BuscarPrecio();
            boolean sw = precio.Value();
            enviarConGMail correo = new enviarConGMail();
            LoginAsk ask = new LoginAsk();
            String asunto = "Alerta de EPA";
            float potMes = datos.MesActual();


           float pot = Float.parseFloat(request.params(":pot"));
            int linea = Integer.parseInt(request.params(":linea"));

            /**enviar mensaje si se acerca a 200*/
            if (potMes > 133 && potMes <200  && !sw){
                String cuerpo = "Su consumo en el hogar es de: "+potMes+"KWh. Por lo que se esta acercando a su proximo borde de precio.";

                correo.enviarConGMail(ask.destino(), asunto,cuerpo);
                precio.UpdateValue(true);
            }
            if (potMes>200 && potMes < 240 && sw){
                String cuerpo2 = "Su consumo en el hogar es de: "+potMes+"KWh. Por lo que ya ha cruzado su primer borde de precio";
                correo.enviarConGMail(ask.destino(), asunto,cuerpo2);
                precio.UpdateValue(false);
            }
            if (potMes > 240 &&  potMes < 300 && !sw){
                String cuerpo2 = "Su consumo en el hogar es de: "+potMes+"KWh. Por lo que se esta acercando a su proximo borde de precio";
                correo.enviarConGMail(ask.destino(), asunto,cuerpo2);
                precio.UpdateValue(true);

            }
            if (potMes > 300 && potMes < 350 && sw){
                String cuerpo2 = "Su consumo en el hogar es de: "+potMes+"KWh. Por lo que ya ha cruzado su proximo borde de precio";
                correo.enviarConGMail(ask.destino(), asunto,cuerpo2);
                precio.UpdateValue(false);
            }
            if (potMes > 470 && potMes < 700 && !sw){
                String cuerpo2 = "Su consumo en el hogar es de: "+potMes+"KWh. Por lo que se espera que llegue a 700KWh en el mes. Por favor regule su consumo.";
                correo.enviarConGMail(ask.destino(), asunto,cuerpo2);
                precio.UpdateValue(true);
            }
            if (potMes > 700 && sw){
                String cuerpo2 = "Ha sobrepasado los 700 KWh con un consumo actal de: "+potMes+"KWh.";
                correo.enviarConGMail(ask.destino(), asunto,cuerpo2);
                precio.UpdateValue(false);
            }

            Calendar cal = Calendar.getInstance();
            Date date = new Date(cal.getTimeInMillis());
            Contador countGprs = new Contador(date,pot,linea);
            datos.insert(countGprs);//inserta en la base de datos
            System.out.println(countGprs.getFecha());
            return "OK";

        });


        /*************Formulario que captura el rango de fecha para ver la potencia*******************/
//        get("/Estadistic", (request, response) -> {
//            Map<String, Object> var = new HashMap<>();
//
//            Calendar calendar = Calendar.getInstance();
//            Date valorMaxForm = new Date(calendar.getTimeInMillis());
//
//            List<Contador> datosRango = datos.TwoMonthAgo();
//            var.put("fechaMax", valorMaxForm);
//            var.put("listaRango",datosRango);
//            return new ModelAndView(var, "Estadistic.ftl");
//        }, freeMarkerEngine);
//
//
//        get("/consulta-estadistica", (request, response) -> {
//            Map<String, Object> var = new HashMap<>();
//            return new ModelAndView(var, "consulta.ftl");
//
//        }, freeMarkerEngine);
//
//        post("/consulta-estadistica", (Request request, Response response) -> {
//
//            System.out.println("entre a estadistica");
//
//            Map<String, Object> var = new HashMap<>();
//
//            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
//            java.util.Date fecha1 = sdf1.parse(request.queryParams("fechaInicio"));
//            java.util.Date fecha2= sdf1.parse(request.queryParams("fechafin"));
//
//
//            Date dateIni = new Date(fecha1.getTime());
//            Date dateFin = new Date(fecha2.getTime());
//            //System.out.println(fecha1+"\n"+fecha2+"\n"+sdf1.toString());
//            System.out.println(dateIni + " " + dateFin);
//
////
////            List<Contador> datosRango = datos.RangoPotenciaFecha(dateIni,dateFin);
////            List<ContadorMes> contando = contMes.PotMes(datosRango);
////            var.put("listaRango",contando);
//
////            for (ContadorMes c: contando
////                 ) {
////
////                System.out.println(c.getMes()+"\n"+ c.getPotenciaMes());
////
////            }
////            //System.out.println(contando.get(1));
////            System.out.println(contando.size());
//
//
//
//            return new ModelAndView(var,"consulta.ftl");
//
//        },freeMarkerEngine);
//
//        post("/Estadistica", (Request request, Response response) -> {
//
//            System.out.println("entre a estadistica");
//
//            Map<String, Object> var = new HashMap<>();
//
//            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
//            java.util.Date fecha1 = sdf1.parse(request.queryParams("fechaInicio"));
//            java.util.Date fecha2= sdf1.parse(request.queryParams("fechafin"));
//
//
//            Date dateIni = new Date(fecha1.getTime());
//            Date dateFin = new Date(fecha2.getTime());
//            //System.out.println(fecha1+"\n"+fecha2+"\n"+sdf1.toString());
//            System.out.println(dateIni + " " + dateFin);
//
//
//            List<Contador> datosRango = datos.RangoPotenciaFecha(dateIni,dateFin);
//            List<ContadorMes> contando = contMes.PotMes(datosRango);
//            var.put("listaRango",contando);
//
////          4  for (ContadorMes c: contando
////                 ) {
////
////                System.out.println(c.getMes()+"\n"+ c.getPotenciaMes());
////
////            }
////            //System.out.println(contando.get(1));
////            System.out.println(contando.size());
//
//
//
//            return new ModelAndView(var,"Estadistic.ftl");
//
//        },freeMarkerEngine);





        post("/verificar-log", (request, response) -> {
            String email = request.queryParams("usuario");
            String pss = request.queryParams("contrasena");
            System.out.println(pss);
           //Session sesion = request.session(true);


                       // Session session = request.session(true);
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

            boolean conf = question.checkLogin(email,pss);
            //if conf == true
            if (conf){

                Session sesion = request.session(true);
                sesion.attribute("sesion",email);

               // request.session(true);
                //response.cookie("auntenticate",String.valueOf(session1),3600);
               // request.cookie(String.valueOf(session1));
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


//            System.out.println(email);
//            System.out.println(password);


            boolean check = question.askPass(password);


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
            ContadorControlador UpdatePrecio = new ContadorControlador();

            Float pr1 = Float.parseFloat(request.queryParams("pr1"));
            Float pr2 = Float.parseFloat(request.queryParams("pr2"));
            Float pr3 = Float.parseFloat(request.queryParams("pr3"));
            Float pr4 = Float.parseFloat(request.queryParams("pr4"));

            UpdatePrecio.menor200(pr1);
            UpdatePrecio.Mayor200Menor300(pr2);
            UpdatePrecio.Mayor300Menor700(pr3);
            UpdatePrecio.Mayor700(pr4);


            return true;
        });

/*****************************Salir de la API********************************************/
        get("/salir", (request, response) -> {

            request.session().removeAttribute("sesion");

            return true;
        });




        /******************Cambiar contrasena******************/
        post("/update-password", (request, response) -> {
            LoginAsk ask = new LoginAsk();
            String pssActual = request.queryParams("passActual");
            String passNueva = request.queryParams("passNueva");
            String passNueva2 = request.queryParams("passNueva2");

            boolean pass = ask.askPass(pssActual);
            if (pass && passNueva.equals(passNueva2)){
                ask.UpdatePassword(passNueva);
                return true;
            }else{
                return false;
            }

        });





        /***************************Pagina de factura**********************************/



        get("/factura", (request, response) -> {
            Map<String, Object> var = new HashMap<>();
            System.out.println("get");
            return new ModelAndView(var, "facturas.ftl");
        }, freeMarkerEngine);


        post("/factura", (request, response) -> {
            try {

                System.out.println("post");

                String dateInStart = request.queryParams("startDate");
                String dateInEnd = request.queryParams("endDate");
                BuscarPrecio precio = new BuscarPrecio();

                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date fecha1 = sdf1.parse(dateInStart);
                java.util.Date fecha2= sdf1.parse(dateInEnd);
                Date dateIni = new Date(fecha1.getTime());
                Date dateFin = new Date(fecha2.getTime());

                // System.out.println(dateIni + " " + dateFin);

                ContadorControlador dateList = new ContadorControlador();

                List<Contador> dateListInformation = dateList.intervalDate(dateIni, dateFin);
                /**Calcular factura a pagar*/
                float potenciaAcu = 0, result = 0;
                Factura valores = new Factura();

                for (Contador r: dateListInformation) {
                    potenciaAcu += r.getPotencia();

                }


//                FuncionesEPA potenciaResutl = new FuncionesEPA();
//                Factura valuelFactura = new Factura();

                if (potenciaAcu<200){
                    result = potenciaAcu*precio.Menor200();

                }
                if (potenciaAcu>=200 && potenciaAcu <300){
                    result = potenciaAcu*precio.Mayor200Menor300();
                }
                if (potenciaAcu >=300 && potenciaAcu <700){
                    result = potenciaAcu*precio.Mayor300Menor700();
                }
                if (potenciaAcu >= 700){
                    result = potenciaAcu*precio.Mayor700();
                }


//                valuelFactura = potenciaResutl.potRango(dateListInformation);
//                System.out.println(valuelFactura);

                /** Factura = potencia*precio*/

//                return Arrays.toString() ;
                return result;

            }
            catch (Exception e){
                return "error!";           }
        });














}

public static void PaginaGeneral(FreeMarkerEngine freeMarkerEngine){

    before("/", (request, response) -> {
        String ses = request.session().attribute("sesion");

        if (ses !=null){
           response.redirect("/index/");
        }
    });




    /*********************************Parqueo General :P*********************************************/
    get("/", (request, response) -> {

        Map<String, Object> attributes = new HashMap<>();
        attributes.put("var", "Bienvenido a EPA");
        // Authentication.User user =  request.session().attribute("usuario");
        //attributes.put("usuario",user);
        return new ModelAndView(attributes, "inicio.ftl");

    }, freeMarkerEngine);
}


public static void Login(FreeMarkerEngine freeMarkerEngine){

    /**Login de la aplicacion*/

    get("/login", (request, response) -> {
        Map<String,Object>attributes = new HashMap<>();
        attributes.put("Bienvenido","Bienvenido a EPA");
        return new ModelAndView(attributes,"Login.ftl");

    },freeMarkerEngine);

}

public static void Index(FreeMarkerEngine freeMarkerEngine){
    /*********************Entro luego de hacer login********************************/
    //Dar permisos para navegar
   before("/index/", (request, response) -> {
       String ses = request.session().attribute("sesion");

       if (ses ==null){
           halt(401,"No tiene permisos para estar aqui, favor verifique sus credenciales haciendo <a href="+"/login"+">Login</a>");

       }
   });

    get("/index/", (request, response) -> {
        Map<String, Object> var = new HashMap<>();

        //String sesion = (String) request.session().attribute("sesion");

        //if (sesion.equals("admin@epa.com")){
            return new ModelAndView(var, "indexC.ftl");


    },freeMarkerEngine);


}

public static void Configuracion(FreeMarkerEngine freeMarkerEngine){
    before("/configuracion", (request, response) -> {
        String ses = request.session().attribute("sesion");

        if (ses ==null){
            halt(401,"No tiene permisos para estar aqui, favor verifique sus credenciales haciendo <a href="+"/login"+">Login</a>");

        }
    });


    get("/configuracion" , (request, response) -> {

        Map<String, Object> var = new HashMap<>();

        return new ModelAndView(var,"configuracion.ftl");
    },freeMarkerEngine);




}

public static void Consulta(FreeMarkerEngine freeMarkerEngine){
    /**Funcion para conseguir las potencian en un intervalo de fecha*/
    get("/consulta-estadistica", (request, response) -> {
        Map<String, Object> var = new HashMap<>();
        System.out.println("get");
        return new ModelAndView(var, "consulta.ftl");


    }, freeMarkerEngine);


    post("/consulta-estadistica", (request, response) -> {
        try {

            System.out.println("post");

            String dateInStart = request.queryParams("startDate");
            String dateInEnd = request.queryParams("endDate");

            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date fecha1 = sdf1.parse(dateInStart);
            java.util.Date fecha2= sdf1.parse(dateInEnd);
            Date dateIni = new Date(fecha1.getTime());
            Date dateFin = new Date(fecha2.getTime());

           // System.out.println(dateIni + " " + dateFin);

            ContadorControlador dateList = new ContadorControlador();

            List<Contador> dateListInformation = dateList.intervalDate(dateIni, dateFin);

            FuncionesEPA result = new FuncionesEPA();

            List<ContadorMes> contadorPorMes = result.PotMes(dateListInformation);
            String[] arrayFechaPorMes = new String[contadorPorMes.size()*2];

            int j = 0;
            for (ContadorMes item: contadorPorMes) {
//                System.out.println(item.getPotenciaMes());
//                System.out.println(item.getMes());

                arrayFechaPorMes[j] = item.getMes().toString();
                //System.out.println(arrayFechaPorMes[j]);
                j++;
                arrayFechaPorMes[j] = String.valueOf(item.getPotenciaMes());
               // System.out.println(arrayFechaPorMes[j]);
                j++;

            }


            return Arrays.toString(arrayFechaPorMes) ;

        }
        catch (Exception e){
            return "error!";           }
    });

}






}























