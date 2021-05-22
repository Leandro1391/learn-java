package test;

import domain.Persona;

public class TestJavaBeans {
      
      public static void main(String[] args) {
            
            // Es necesario declara con el constructor sin argumentos y setear los atributos con el metodo set
            Persona persona = new Persona();
            persona.setNombre("Giovanni");
            persona.setApellido("Di Genova");
            
            System.out.println("persona = " + persona);
            
            System.out.println("Persona nombre: " + persona.getNombre());
            System.out.println("Persona nombre: " + persona.getApellido());
            
      }
}
