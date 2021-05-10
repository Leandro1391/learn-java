package test;

import domian.Persona;

public class TestFinal {
      public static void main(String[] args) {
            final int miVariable = 10;
            System.out.println("miVariable = " + miVariable);
            // si declaramo una variable como final no podemos  cambiar su valor después, será constante en toda la ejecucion
//            miVariable = 5;
            
            //No se puede modificar el valor ya asignado en un atributo contsntane
//            Persona.MI_CONSTANTE = 5;
            System.out.println("Persona.MI_CONSTANTE = " + Persona.MI_CONSTANTE);
            
            
            final Persona persona1 = new Persona();
            
            //No podemos volver asignar un referencia en memoria al objeto persona1 porque fue declarado como final
//            persona1 = new Persona();
            persona1.setNombre("Juan");
            System.out.println("Persona1 nombre: " + persona1.getNombre());
            persona1.setNombre("Carlos");
            System.out.println("Persona1 nombre: " + persona1.getNombre());
            //no se puede asginar una nueva referencia a la variable persona1 o no se puede cambiar la referencia pero sí podemos modificar el contenido a la que apunta como el atributo nombre
      }
}
