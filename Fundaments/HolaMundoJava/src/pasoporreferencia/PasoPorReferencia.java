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
            Persona persona1 = new Persona();
            persona1.nombre = "Juan";
            System.out.println("persona1 nombre: " + persona1.nombre);
            persona1 = changeValueReference(persona1);
            System.out.println("persona1 cambio de nombre: " + persona1.nombre);
      }
      
      //En este metodo va recibir la referencia del objeto persona1
//      public static void changeValue(Persona persona) {
//            persona.nombre = "Karla";
//      }
      public static Persona changeValueReference(Persona persona) {
            persona.nombre = "Karla";
            return persona;
      }
      
}
