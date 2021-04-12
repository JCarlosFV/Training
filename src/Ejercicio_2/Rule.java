package Ejercicio_2;

public class Rule {
    private String nombre;
    private int posicionInicio;
    private int posicionFinal;
    private String descripcion;

    public Rule() {
        this.nombre = null;
        this.posicionInicio = 0;
        this.posicionFinal = 0;
        this.descripcion = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicionInicio() {
        return posicionInicio;
    }

    public void setPosicionInicio(int posicionInicio) {
        this.posicionInicio = posicionInicio;
    }

    public int getPosicionFinal() {
        return posicionFinal;
    }

    public void setPosicionFinal(int posicionFinal) {
        this.posicionFinal = posicionFinal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
