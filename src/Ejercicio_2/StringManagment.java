package Ejercicio_2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManagment extends Rule{
    private String trama;
    private List<Rule> Rules;
    public String orden;

    public StringManagment() {
        this.Rules = new ArrayList<>();
    }

    public String getTrama() {
        return trama;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        Pattern pat = Pattern.compile("^[1-3]{3}$");
        Matcher mat = pat.matcher(orden);
        if (mat.find()) {
            this.orden = orden;
        } else {
            System.out.println("Ingrese el Orden Correcto");
        }
        this.orden = orden;
    }

    public void setTrama(String trama) {
        Pattern pat = null;
        if(this.getOrden() == "123"){
            pat = Pattern.compile("^[A-Za-z]{3,13}\s[A-Za-z]{3,13}\s\\d{13}\s\\d{8}$");
        }else if(this.getOrden() == "132"){
            pat = Pattern.compile("^[A-Za-z]{3,13}\s[A-Za-z]{3,13}\s\\d{8}\s\\d{13}$");
        }else if (this.getOrden() == "213"){
             pat = Pattern.compile("^\\d{13}\s[A-Za-z]{3,13}\s[A-Za-z]{3,13}\s\\d{8}$");
        }else if (this.getOrden() == "231"){
            pat = Pattern.compile("^\\d{13}\s\\d{8}\s[A-Za-z]{3,13}\s[A-Za-z]{3,13}$");
        }else if(this.getOrden() == "312"){
            pat = Pattern.compile("^\\d{8}\s[A-Za-z]{3,13}\s[A-Za-z]{3,13}\s\\d{13}$");
        }else if(this.getOrden() == "321"){
            pat = Pattern.compile("^\\d{8}\s\\d{13}\s[A-Za-z]{3,13}\s[A-Za-z]{3,13}$");
        }
        Matcher mat = pat.matcher(trama);

        if (mat.find()){
            this.trama = trama;
        } else {
            System.out.println("Error: Trama Invalida" + "\n");
            trama = "";
        }
        this.trama = trama;

    }

    public List<Rule> getRules() {
        return Rules;
    }

    public void setRules(List<Rule> rules) {
        Rules = rules;
    }

    public void NuevaRegla (String regla){

        if(regla == "Nombre"){
            Rule Nombre = new Rule();
            Nombre.setNombre("Cliente Nombre");
            Nombre.setPosicionInicio(14);
            Nombre.setPosicionFinal(25);
            Nombre.setDescripcion("Nombre del cliente");
            this.Rules.add(Nombre);

        }else if(regla == "Identidad"){
            Rule Identidad = new Rule();
            Identidad.setNombre("Identidad");
            Identidad.setPosicionInicio(0);
            Identidad.setPosicionFinal(13);
            Identidad.setDescripcion("Identidad del cliente");
            this.Rules.add(Identidad);

        }else if(regla == "Telefono"){
            Rule Telefono = new Rule();
            Telefono.setNombre("Telefono");
            Telefono.setPosicionInicio(26);
            Telefono.setPosicionFinal(33);
            Telefono.setDescripcion("Telefono del cliente");
            this.Rules.add(Telefono);
        }
    }


    public void get_Parte(String parte){
        String []Trama = getTrama().split(" ");
        if(parte == "Nombre") {
            if (this.getOrden() == "123") {
                System.out.println("Nombre: "+Trama[0]+" "+Trama[1]);
            } else if (this.getOrden() == "132") {
                System.out.println("Nombre: "+Trama[0]+" "+Trama[1]);
            } else if (this.getOrden() == "213") {
                System.out.println("Nombre: "+Trama[1]+" "+Trama[2]);
            } else if (this.getOrden() == "231") {
                System.out.println("Nombre: "+Trama[2]+" "+Trama[3]);
            } else if (this.getOrden() == "312") {
                System.out.println("Nombre: "+Trama[1]+" "+Trama[2]);
            } else if (this.getOrden() == "321") {
                System.out.println("Nombre: "+Trama[2]+" "+Trama[3]);
            }
        } else if (parte == "Identidad"){
            if (this.getOrden() == "123") {
                System.out.println("Identidad: "+Trama[2]);
            } else if (this.getOrden() == "132") {
                System.out.println("Identidad: "+Trama[3]);
            } else if (this.getOrden() == "213") {
                System.out.println("Identidad: "+Trama[0]);
            } else if (this.getOrden() == "231") {
                System.out.println("Identidad: "+Trama[0]);
            } else if (this.getOrden() == "312") {
                System.out.println("Identidad: "+Trama[3]);
            } else if (this.getOrden() == "321") {
                System.out.println("Identidad: "+Trama[1]);
            }
        } else if (parte == "Telefono"){
            if (this.getOrden() == "123") {
                System.out.println("Telefono: "+Trama[3]);
            } else if (this.getOrden() == "132") {
                System.out.println("Telefono: "+Trama[2]);
            } else if (this.getOrden() == "213") {
                System.out.println("Telefono: "+Trama[3]);
            } else if (this.getOrden() == "231") {
                System.out.println("Telefono: "+Trama[1]);
            } else if (this.getOrden() == "312") {
                System.out.println("Telefono: "+Trama[0]);
            } else if (this.getOrden() == "321") {
                System.out.println("Telefono: "+Trama[0]);
            }
        }else {
            System.out.println("No existe dato con el siguiente valor: " + parte);
        }
    }

    public void ImprimirReglas(){
        for (Rule c: this.Rules) {
            System.out.println("Nombre: " + c.getNombre()+"\n"+ "PosicionInicio: "+c.getPosicionInicio()+"\n"+"PosicionFinal: "+c.getPosicionFinal()+"\n"+"Descripcion: "+c.getDescripcion()+"\n");
        }
    }

}
