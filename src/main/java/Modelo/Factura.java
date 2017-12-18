package Modelo;

import java.sql.Date;

public class Factura {
    private float potencia;
   private float precio;
   private Date FechaIni;
   private Date Fachafin;
   private float total;

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Factura(){

   }


    public Factura(float potencia, float precio,float total, Date fechaIni, Date fachafin) {
        this.potencia = potencia;
        this.precio = precio;
        this.total = total;
        FechaIni = fechaIni;
        Fachafin = fachafin;
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

    public Date getFechaIni() {
        return FechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        FechaIni = fechaIni;
    }

    public Date getFachafin() {
        return Fachafin;
    }

    public void setFachafin(Date fachafin) {
        Fachafin = fachafin;
    }
}
