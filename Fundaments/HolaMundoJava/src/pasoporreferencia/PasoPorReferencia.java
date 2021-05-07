/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporreferencia;

import clases.Persona;

/**
 *
 * @author leandro
 */
//Cuando trabajamos por paso por referencia es importante entender en este caso que la clase Persona 
//es un tipo object porque se herede en forma indirecta de Object
public class PasoPorReferencia {

      public static void main(String[] args) {

            // persona1 almacena la referencia de un objeto
//            Persona persona1 = new Persona();
            Persona  persona1 = null; //en tiempo en ejecución va devolver un error porque como no tiene un referencia no puede acceder a los atributos d ela clase Persona, en tiempo de compilación no muestra nada
//            persona1.nombre = "Juan";
//            System.out.println("persona1 nombre: " + persona1.nombre);
            persona1 = changeReferenceValue(persona1);
//            changeValueReference(persona1);
            if (persona1 != null)
            System.out.println("persona1 cambio de nombre: " + persona1.nombre);
      }

      //En este metodo va recibir la referencia del objeto persona1
//      public static void changeValueReference(Persona persona) {
//            persona.nombre = "Karla";
//      }

      // El return se agrega el final del metodo porque ahí termina la linea de ejecución en el mismo y regresa a la linea donde se invoco
//      public static Persona changeValueReference(Persona persona) {
//            persona.nombre = "Karla";
//            return persona;
//      }
      
      // se puede agegar varias veces return solamente con una estructura condicional
      public static Persona changeReferenceValue(Persona persona) {
            if (persona == null){
                  System.out.println("Valor de persona invalido : null");
                  return null;
            }
            persona.nombre = "Karla";
            return persona;
      }
      
      //java.lang.NullPointerException
}
