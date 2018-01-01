package Configuracion;

import java.util.HashMap;
import spark.Filter;

import spark.Request;

import spark.Response;

import spark.Spark;

import static spark.Spark.before;
import static spark.Spark.options;

public final class  Cors {


    private static final HashMap<String, String> corsHeaders = new HashMap<String, String>();



    static {

        corsHeaders.put("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,OPTIONS");

        corsHeaders.put("Access-Control-Allow-Origin", "*");

        corsHeaders.put("Access-Control-Allow-Headers", "Content-Type,Authorization,X-Requested-With,Content-Length,Accept,Origin,");

        corsHeaders.put("Access-Control-Allow-Credentials", "true");

    }



    public final static void apply() {

        Filter filter = new Filter() {

            @Override

            public void handle(Request request, Response response) throws Exception {

                corsHeaders.forEach((key, value) -> {

                    response.header(key, value);

                });

            }

        };

        Spark.before("/hola",filter);

    }




//    private static void enableCORS(final String origin, final String methods, final String headers) {
//
//        options("/hola", (request, response) -> {
//
//            String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
//            if (accessControlRequestHeaders != null) {
//                response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
//            }
//
//            String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
//            if (accessControlRequestMethod != null) {
//                response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
//            }
//
//            return "OK";
//        });
//
//        before((request, response) -> {
//            response.header("Access-Control-Allow-Origin", origin);
//            response.header("Access-Control-Request-Method", methods);
//            response.header("Access-Control-Allow-Headers", headers);
//            // Note: this may or may not be necessary in your particular application
//            response.type("application/json");
//        });
//    }
}
