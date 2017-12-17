package Modelo;

public class Precio {
    private float costo;
    private String rango;


    public Precio(){

    }


    public Precio(float costo, String rango) {
        this.costo = costo;
        this.rango = rango;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
}
