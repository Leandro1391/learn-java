package test;

import domain.Persona;

public class TestForEach {

      public static void main(String[] args) {
            int edades[] = {5, 6, 8, 9};
            for (int edad : edades) {
                  System.out.println("edad = " + edad);
            }
            
            //Las variables de tipo hijo no puede guardar referencia del padre, en cambio, de tipo padre puede guardar referencia tanto de eĺ y sus hijos en la referencia de memoria
            Persona personas[] = {new Persona("Giovanni"), new Persona("Julia"), new Persona("Salvatore")};
            for (Persona persona : personas) {
                  System.out.println("persona = " + persona);
            }
      }
}
