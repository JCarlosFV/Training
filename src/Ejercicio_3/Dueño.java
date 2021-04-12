package Ejercicio_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dueño {
    private String Tarjeta_credito;

    public Dueño(String tarjeta_credito) {
        this.setTarjeta_credito(tarjeta_credito);
    }

    public String getTarjeta_credito() {
        return Tarjeta_credito;
    }

    public void setTarjeta_credito(String tarjeta_credito) {

        Pattern pat = Pattern.compile("^[*]{8,10}\\d{2,6}$");
        Matcher mat = pat.matcher(tarjeta_credito);
        if (mat.find()) {
            System.out.println("Tarjeta de Credito enmascarada correctamente");
            this.Tarjeta_credito = tarjeta_credito;
        } else {
            System.out.println("El numero " + tarjeta_credito + " No esta correcto");
            tarjeta_credito = "Incorrecto";
        }
        this.Tarjeta_credito = tarjeta_credito;

    }
}
