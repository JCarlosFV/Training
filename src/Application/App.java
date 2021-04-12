package Application;

import Ejercicio_1.Cliente;
import Ejercicio_2.StringManagment;
import Ejercicio_3.Dueño;

import java.util.Date;

public class App {
    public static void main(String[] args){
        /*------------ EJERCICIO 1 ------------
         En este caso hice una clase BaseDatos de donde Cliente y Producto heredarian los metodos y lista en la cual se almacenaria cada
         registro donde iban los parametros de Usuaro, nombre, contrasenia y url creado por el cliente o el producto, la ultima parte sobre como queria ver los metodos
         no entendi muy bien, por lo que yo se los comento como los hice*/

        System.out.println("*************** EJERCICIO 1 ***************"+"\n");

        Cliente c1 = new Cliente("1906JC","Juan Carlos","Col.Luis Andres",new Date("19/06/2001"));

        /*METODO CREAR
        En esta parte lo que hice fue que el usuario le enviara los parametros para crear un Registro en el caso de producto tambien puede crear una base datos.*/
        c1.crearUsuario("Jcarlos","201882","MiBase","MIBASE.com");
        c1.crearUsuario("Miinn","232415c","DataBase","DataBase.com");

        c1.MostraRegistros();

        /*METODO OBTENER
        Con este lo que decidi es que el usuario escribiera una palabra clave que luego en el constructor lo que se haria es comparar con cada uno de los parametros
        y si encuentra una coincidencia retornara el registro al que pertenece.*/
        c1.Obtener("Jcarlos");

        /*METODO ACTUALIZAR
        Se pide que ingresen en valor que se desea actualizar y al igual que con el metodo obtener se compara hasta encontrar una coincidencia solo que esta vez
        no retornara un registro, sino que solo se devolvera un mensaje donde se dice que se actualizo el valor por el nuevo.*/
        c1.Actualizar("MIBASE.com","regex.com");

        /*METODO ELIMINAR
        Aca se debera ingresar la posicion del registro que deseamos eliminar, por unos problemas no pude hacer que iniciera en 1, por lo que la primera posicion sera 0.*/
        c1.Eliminar(1);
        c1.MostraRegistros();


        /*------------ EJERCICIO 2 -------------
         En este ejercicio tube unos incovenientes cuando quise hacer mas automatico el codigo y simplificado pero no pude, por lo que me llevo a crear
         mucho codigo, me disculpo porque tuve que agregar un set donde se especifica el orden de las reglas, el codigo lo tengo instanciado
         a 3 unicas reglas que son 1.Nombre 2.Identidad 3.Telefono puede jugar con ellas con lo que es el orden segun sean agregadas y el tamaño de estas
         estan validadas y sere sincero ingeniero por mas que intente no encontre manera de calcular la posicion inicial y final, en eso si le fallo.*/

        System.out.println("\n"+"*************** EJERCICIO 2 ***************"+"\n");

        StringManagment str1 = new StringManagment();
        str1.NuevaRegla("Identidad");
        str1.NuevaRegla("Nombre");
        str1.NuevaRegla("Telefono");
        str1.setOrden("213");
        str1.setTrama("0816200100289 Juan Carlos 97145532");
        str1.ImprimirReglas();
        System.out.println("trama = "+ str1.getTrama());
        str1.get_Parte("Identidad");
        str1.get_Parte("Nombre");






        /*------------ EJERCICIO 3 ------------
        Lo realice de tal manera que se mostraran los ultimos de (2 a 6) numeros,
        los primeros numeros se piden enmascarados con el caracter "*" respetando el tamaño maximo de 16 y un minimo de 10*/

        System.out.println("\n"+"*************** EJERCICIO 3 ***************"+"\n");

        Dueño p1 = new Dueño("*********324");
        System.out.println(p1.getTarjeta_credito());

        Dueño p2 = new Dueño("**4234236324");
        System.out.println(p2.getTarjeta_credito());
    }
}
