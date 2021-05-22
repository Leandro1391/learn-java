package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {

      //Para llamar directamente el metodo de la division pro es static
      public static int division(int numerador, int denominador)
              throws OperacionExcepcion {
            if (denominador == 0) {
                  throw new OperacionExcepcion("Division entre cero");
            }
            return numerador / denominado;
      }
}

/*Throws: Posiblemente arroje una exception*/
