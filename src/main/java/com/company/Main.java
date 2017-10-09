package com.company;

import Controladores.ContadorControlador;
import Modelo.Contador;

import static spark.Spark.staticFiles;

public class Main {

    public static void main(String[] args) {
        staticFiles.location("");


        ContadorControlador insertar = new ContadorControlador();


        for (Contador cont:insertar.Mostrar()
             ) {
            System.out.println(cont.getPotencia());

        }
    }


}
