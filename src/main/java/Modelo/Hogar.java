package Modelo;

public class Hogar {

    private int linea;
    private String equipo;
    private String estado;

/**Constructor*/

    public Hogar(int linea, String equipo, String estado) {
        this.linea = linea;
        this.equipo = equipo;
        this.estado = estado;
    }

    public Hogar(){

    }

    /**Getters and setters*/
    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
