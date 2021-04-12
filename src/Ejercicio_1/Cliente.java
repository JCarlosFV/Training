package Ejercicio_1;


import java.util.Date;

public class Cliente extends BaseDatos{
    private String id;
    private String nombre;
    private String direccion;
    private Date fecNacimiento;

    public Cliente(String id, String nombre, String direccion, Date fecNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fecNacimiento = fecNacimiento;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecNacimiento() {
        return fecNacimiento;
    }

    public void setFecNacimiento(Date fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }

}
