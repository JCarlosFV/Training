package Ejercicio_1;

import java.util.ArrayList;
import java.util.List;
public class BaseDatos {

    private String usuarioBaseDatos;
    private String contraseniaBaseDatos;
    private String nombreBaseDatos;
    private String urlBaseDatos;
    private List<BaseDatos> BaseDatos;

    public BaseDatos() {
        this.usuarioBaseDatos = " ";
        this.contraseniaBaseDatos = " ";
        this.nombreBaseDatos = " ";
        this.urlBaseDatos = " ";
        this.BaseDatos = new ArrayList<BaseDatos>();
    }

    public String getUsuarioBaseDatos() {
        return usuarioBaseDatos;
    }

    public void setUsuarioBaseDatos(String usuarioBaseDatos) {
        this.usuarioBaseDatos = usuarioBaseDatos;
    }

    public String getContraseniaBaseDatos() {
        return contraseniaBaseDatos;
    }

    public void setContraseniaBaseDatos(String contraseniaBaseDatos) {
        this.contraseniaBaseDatos = contraseniaBaseDatos;
    }

    public String getNombreBaseDatos() {
        return nombreBaseDatos;
    }

    public void setNombreBaseDatos(String nombreBaseDatos) {
        this.nombreBaseDatos = nombreBaseDatos;
    }

    public String getUrlBaseDatos() {
        return urlBaseDatos;
    }

    public void setUrlBaseDatos(String urlBaseDatos) {
        this.urlBaseDatos = urlBaseDatos;
    }

    public void crearUsuario (String usuarioBaseDatos, String contraseniaBaseDatos, String nombreBaseDatos, String urlBaseDatos){

        BaseDatos Usuario = new BaseDatos();
        Usuario.setUsuarioBaseDatos(usuarioBaseDatos);
        Usuario.setContraseniaBaseDatos(contraseniaBaseDatos);
        Usuario.setNombreBaseDatos(nombreBaseDatos);
        Usuario.setUrlBaseDatos(urlBaseDatos);

        this.BaseDatos.add(Usuario);
    }

    public void Obtener (String Obt){
        System.out.println();
        for (BaseDatos c: this.BaseDatos) {
            if (c.getUsuarioBaseDatos()==Obt||c.getContraseniaBaseDatos()==Obt||c.getNombreBaseDatos()==Obt||c.getUrlBaseDatos()==Obt){
                System.out.println("Datos de la Obtencion");
                System.out.println("Usuario: "+c.getUsuarioBaseDatos()+" contrasenia: "+c.getContraseniaBaseDatos()+" Nombre: "+c.getNombreBaseDatos()+" Url: "+c.getUrlBaseDatos());
            }
        }
    }

    public void Actualizar (String Valor, String NuevoValor){
        System.out.println();
        for (BaseDatos c: this.BaseDatos) {
            if (c.getUsuarioBaseDatos()==Valor){
                c.setUsuarioBaseDatos(NuevoValor);
                System.out.println("Parametro modificado exitosamente");
            }
            else if(c.getContraseniaBaseDatos()==Valor){
                c.setContraseniaBaseDatos(NuevoValor);
                System.out.println("Parametro modificado exitosamente");
            }
            else if(c.getNombreBaseDatos()==Valor){
                c.setNombreBaseDatos(NuevoValor);
                System.out.println("Parametro modificado exitosamente");
            }
            else if(c.getUrlBaseDatos()==Valor){
                c.setUrlBaseDatos(NuevoValor);
                System.out.println("Parametro modificado exitosamente");
            }
        }
    }

    public void Eliminar (int RegistroPosicion){
        System.out.println();
        if (RegistroPosicion < this.BaseDatos.size()){
            this.BaseDatos.remove(RegistroPosicion);
            System.out.println("Registro Eliminado exitosamente");
        }
    }


    public void MostraRegistros(){
        System.out.println("------------- Registros -------------");
        for (BaseDatos c: this.BaseDatos) {
            System.out.println("Usuario: "+c.getUsuarioBaseDatos()+" contrasenia: "+c.getContraseniaBaseDatos()+" Nombre: "+c.getNombreBaseDatos()+" Url: "+c.getUrlBaseDatos());
        }
    }

}
