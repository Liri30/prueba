package com.company;

import Controladores.ContadorControlador;
import ManejoWeb.*;
import Modelo.*;

//import java.sql.Date;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.List;
import java.time.*;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static spark.Spark.staticFiles;

public class Main {

    public static void main(String[] args) throws ParseException {
        //staticFiles.location("");

        new ManejadorTemplates().manejoTemplates();
        FuncionesEPA funcionesEPA = new FuncionesEPA();





        // current offset time
//        OffsetTime ot1 = OffsetTime.now();
//        System.out.println("Current  offset  time: " + ot1);
//
//        // a zone offset +01:30
//        ZoneOffset offset = ZoneOffset.ofHoursMinutes(1, 30);
//
//        OffsetTime offsetTime = OffsetTime.of(16, 40, 28, 0, offset);
//        System.out.println(offsetTime);


//        System.out.printf("Hace seis meses fue %s%n", LocalDateTime.now().isAfter(ChronoLocalDateTime.from())


        /**Mensaje con grafica de prueba*/

//        MailChart archivo = new MailChart();
//        //Llama a la clase para enviar correo
//        enviarMailFoto mailFoto = new enviarMailFoto();
//        archivo.GenerarChart();
//        mailFoto.enviar("manuelliriano.ml@gmail.com","EpaCore", "Saludos Sr. Manuel,",
//                "Este es un mensajde prueba, favor ver si esta bonito");




//        for(Grafica g: funcionesEPA.Semana()){
//            System.out.println(g.getDia()+"    "+g.getPot());
//
//        }






//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
//
///****Insertar valores en los meses del anyo***/
//        ContadorControlador funcion = new ContadorControlador();
//
//        for (int i=15; i<=31;i++){
//
//            Contador contador = new Contador();
//            String mult = "1.4";
//            String mult2 = "3.1";
//
//            Float f = Float.parseFloat(mult);
//            Float g = Float.parseFloat(mult2);
//            Float r = f*g;
//            java.util.Date fecha1 = sdf1.parse("2017-12-"+i);
//           // java.util.Date fecha2= sdf1.parse(request.queryParams("fechafin"));
//            java.sql.Date dateIni = new java.sql.Date(fecha1.getTime());
//           // java.sql.Date dateFin = new java.sql.Date(fecha2.getTime());
//            contador.setLinea(1);
//            contador.setFecha(dateIni);
//            contador.setPotencia(r);
//
//            funcion.insert(contador);
//            System.out.println(dateIni.toString());
//
//
//        }




    }

}
