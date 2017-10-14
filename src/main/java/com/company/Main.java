package com.company;

import Controladores.ContadorControlador;
import ManejoWeb.ManejadorTemplates;
import Modelo.Contador;

import static spark.Spark.staticFiles;

public class Main {

    public static void main(String[] args) {
        //staticFiles.location("");

        new ManejadorTemplates().manejoTemplates();

        ContadorControlador insertar = new ContadorControlador();


        for (Contador cont:insertar.Mostrar()
             ) {
            System.out.println(cont.getPotencia());

        }
    }


}
