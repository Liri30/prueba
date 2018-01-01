package Modelo;

public class Grafica {

    private String dia;
    private Float pot;

    public Grafica(){

    }


    public Grafica(String dia, Float pot) {
        this.dia = dia;
        this.pot = pot;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Float getPot() {
        return pot;
    }

    public void setPot(Float pot) {
        this.pot = pot;
    }
}
