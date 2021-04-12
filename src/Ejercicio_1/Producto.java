package Ejercicio_1;

import java.util.Date;

public class Producto extends BaseDatos{
    private String id;
    private String nombre;
    private int cantidad;
    private Date fechaCreacion;
    private Date fechaVencimiento;

    public Producto(String id, String nombre, int cantidad, Date fechaCreacion, Date fechaVencimiento) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fechaCreacion = fechaCreacion;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

}
