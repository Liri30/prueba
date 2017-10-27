package Modelo;

import java.sql.Date;

public class Contador {


    private java.sql.Date fecha;
    private float potencia;
    private int linea;


    /**Contructors*/
    public Contador(java.sql.Date fecha, float potencia, int linea) {

        this.fecha = fecha;
        this.potencia = potencia;
        this.linea = linea;
    }


    public Contador(){

    }

    /**  Getters and setters*/



    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }
}
