package Modelo;

import java.sql.Date;

public class Factura {
    private float potencia;
    private float precio;
    private String fecha;

    public Factura(){

    }

    public Factura(float potencia, float precio, String fecha) {
        this.potencia = potencia;
        this.precio = precio;
        this.fecha = fecha;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
