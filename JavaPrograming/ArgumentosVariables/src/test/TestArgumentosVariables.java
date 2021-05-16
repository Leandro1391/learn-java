package test;

public class TestArgumentosVariables {

      public static void main(String[] args) {
            imprimirNumeros(3, 4, 5);
            imprimirNumeros(1, 2);
            variosParametros("Giovanni", 8, 9, 10);
      }

      //Si tenemos varios argumentos en la firma del metodo, el argumentos variables siempre debe estar al final
      private static void variosParametros(String nombre, int... numeros) {
            System.out.println("nombre = " + nombre);
            imprimirNumeros(numeros);
      }

      //args var: no tenemos que especificar la cantidad de argumentaos a enviar en el metodo, int... variable
      //no sabemos la cantidad de argumentos en este metodo
      public static void imprimirNumeros(int... numeros) {
            for (int i = 0; i < numeros.length; i++) {
                  System.out.println("elemento: " + numeros[i]);
            }
      }
      //En tiempo de ejecucion se crea un array de enteros para contener los args variables.
}
