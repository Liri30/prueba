package Modelo;

import java.sql.Date;

public class Contador {

    private int id;
    private java.sql.Date fecha;
    private float potencia;
    private int linea;


    /**Contructors*/
    public Contador(int id, Date fecha, float potencia, int linea) {
        this.id = id;
        this.fecha = fecha;
        this.potencia = potencia;
        this.linea = linea;
    }


    public Contador(){

    }

    /**  Getters and setters*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
