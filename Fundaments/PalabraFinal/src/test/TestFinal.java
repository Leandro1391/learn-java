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
      }
}
