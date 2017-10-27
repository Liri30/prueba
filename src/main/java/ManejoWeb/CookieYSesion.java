package ManejoWeb;

import spark.Request;
import spark.Spark;

import javax.servlet.http.Cookie;



import static spark.Spark.*;

public class CookieYSesion {

    public void crearCookie(){
        Cookie cookie = new Cookie("Auth", "usuario");

    }

    /**
    public void buscarCookie(){

        Cookie[] cookies ;

        String userId = null;
        for(Cookie cookie : cookies){
            if("uid".equals(cookie.getName())){
                userId = cookie.getValue();
            }
    }*/

}
