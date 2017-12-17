package com.company;

import Controladores.ContadorControlador;
import ManejoWeb.FuncionesEPA;
import ManejoWeb.ManejadorTemplates;
import ManejoWeb.RangoPot;
import ManejoWeb.enviarConGMail;
import Modelo.Contador;
import Modelo.Factura;
import Modelo.Precio;

//import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.List;
import java.util.Date;
import java.util.List;

import static spark.Spark.staticFiles;

public class Main {

    public static void main(String[] args) throws ParseException {
        //staticFiles.location("");

        new ManejadorTemplates().manejoTemplates();

      //  RangoPot rangoPotencia = new RangoPot();

       // enviarConGMail email = new enviarConGMail();

        ContadorControlador listaPrecio = new ContadorControlador();

       // email.enviarConGMail("manuelliriano.ml@gmail.com", "testing java mail", "Hola mundo!!");
//        FuncionesEPA funcionesEPAResult = new FuncionesEPA();
//
//        String fechaIniString = "2017-10-01";
//        String fechaFinString = "2017-10-30";
//
//        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//        Date fechaInicio = null;
//        Date fechaFin = null;
//
//        try {
//            fechaInicio = formato.parse(fechaIniString);
//            fechaFin = formato.parse(fechaFinString);
//        }
//        catch (ParseException ex)
//        {
//            System.out.println(ex);
//        }




//
//        FuncionesEPA funcionesEPA = new FuncionesEPA();
//        List<Contador> rangoDeFecha = listaPrecio.RangoPotenciaFecha(fechaInicio, fechaFin);
//
//
//        Float v1 = null, v2 = null,v3 = null,v4 = null;
//        for(Precio precio: listaPrecio.listaPrecios())
//        {
////            if((precio.getRango()).equals("Menor200")){
////                v1=precio.getCosto();
////            }
////            if (precio.getRango().equals("Mayor200Menor300")){
////                v2=precio.getCosto();
////            }
////            if (precio.getRango().equals("Mayor300Menor700")){
////                v3 = precio.getCosto();
////            }
////            if (precio.getRango().equals("Mayor700")){
////                v4=precio.getCosto();
////            }
////            Float result = new Float();
//            float result = 0;
//            Factura factura = new Factura();
//            factura = funcionesEPA.potRango(rangoDeFecha);
//
//
//            if (factura.getPotencia() < 200 && precio.getRango().equals("Menor200")){
//                result = factura.getPotencia()* precio.getCosto();
//                continue;
//            }
//            if (factura.getPotencia()>=200 && factura.getPotencia()<300 && precio.getRango().equals("Mayor200Menor300")){
//                result=factura.getPotencia()*precio.getCosto();
//                continue;
//            }
//
//
////                Factura fac = new Factura();
////                fac = funcionesEPAResult.potRango(rangoDeFecha);
////                Float result = precio.getCosto() * fac.getPotencia();
////                System.out.println(result);
////
//
//        }
//        Float result = new Float();
//        Factura factura = new Factura();
//        factura = funcionesEPA.potRango();
//        if (factura.getPotencia() < 200){
//            result = factura.getPotencia()*v1;
//        }
//        if (factura.getPotencia()>=200 && factura.getPotencia()<300){
//            result=factura.getPotencia()*v2;
//        }

//        ContadorControlador insertar = new ContadorControlador();
//
//
//        for (Contador cont:insertar.Mostrar()
//             ) {
//            System.out.println(cont.getPotencia());
//
//        }
        //puedes ponder eso en una funcion o algo asi

//        for(Contador potencia : rangoPotencia.potenciaCorte("30"))
//        {
//            System.out.println(potencia.getFecha());
//        }
//
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");



/****Insertar valores en los meses del anyo***/
//        ContadorControlador funcion = new ContadorControlador();
//
//        for (int i=0; i<=31;i++){
//
//            Contador contador = new Contador();
//            String mult = "3.2";
//            String mult2 = "3.1";
//
//            Float f = Float.parseFloat(mult);
//            Float g = Float.parseFloat(mult2);
//            Float r = f*g;
//            java.util.Date fecha1 = sdf1.parse("2017-11-"+i);
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
