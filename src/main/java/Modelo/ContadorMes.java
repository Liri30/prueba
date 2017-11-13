package Modelo;

import java.util.List;

public class ContadorMes {
    private String Mes;
    private float potenciaMes;

    public ContadorMes(String mes, float potenciaMes) {
        Mes = mes;
        this.potenciaMes = potenciaMes;
    }

    public ContadorMes(){

    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String mes) {
        Mes = mes;
    }

    public float getPotenciaMes() {
        return potenciaMes;
    }

    public void setPotenciaMes(float potenciaMes) {
        this.potenciaMes = potenciaMes;
    }
}
