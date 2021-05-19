package test;

import domain.*;

public class TestClaseObject {

      public static void main(String[] args) {
            Empleado empleado1 = new Empleado("Juan", 5000);
            Empleado empleado2 = new Empleado("Juan", 5000);

            //Comparando por referencia
            if (empleado1 == empleado2) {
                  System.out.println("Tienen la misma referencia en memoria");
            } else {
                  System.out.println("Tienen distinta referencia en memoria");
            }

            //Comparando por contenido
            if (empleado1.equals(empleado2)) {
                  System.out.println("Los objetos son iguales en contenido");
            } else {
                  System.out.println("Los objetos son distintintos en contenido");
            }
             
            //Comporando por valor entero
            if (empleado1.hashCode() == empleado2.hashCode()) {
                  System.out.println("el valor hascode es igual");
            } else {
                  System.out.println("el valor hascode es distinto");
            }

      }
}

//Todas las clases en Java heredan de la Clase Object, Object es padre de todas las clases
//Los metodos principales de la clase Object son: toString(), equals(), hashCode().
// * equals(): permite comparar el contenido de dos objetos para saber si son iguales
// * hasCode(): permite comprar el contido de los objetos pero lo hara a traves de un tipo entero, ese valor generado se le va a asignar a ca objeto genrado a aprti 
// de los valores de los atributos de las variables

/*IMPORTANTE: se recomienda implementar tanto el metodo hashCode como equals cuando en las clases*/
//new: significa que estamos solicitando generar una nueva referencia  en memoria para un nuevo objeto

/*Es importante definir los metodos toString(), hashCode() y equals() en las clases para que haya mejor performnce cuando
se aplica alguna de ellas*/
