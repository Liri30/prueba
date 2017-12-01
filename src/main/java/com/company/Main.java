package com.company;

import Controladores.ContadorControlador;
import ManejoWeb.ManejadorTemplates;
import ManejoWeb.enviarConGMail;
import Modelo.Contador;

import static spark.Spark.staticFiles;

public class Main {

    public static void main(String[] args) {
        //staticFiles.location("");

        new ManejadorTemplates().manejoTemplates();

        enviarConGMail email = new enviarConGMail();

        email.enviarConGMail("manuelliriano.ml@gmail.com", "testing java mail", "Hola mundo!!");

//        ContadorControlador insertar = new ContadorControlador();
//
//
//        for (Contador cont:insertar.Mostrar()
//             ) {
//            System.out.println(cont.getPotencia());
//
//        }
    }


}
