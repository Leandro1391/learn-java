package test;

public class TestExcepciones {

      public static void main(String[] args) {

            int resultado = 0;
            
            //Con try controlamos la excepcion para que no termine el programa de forma abrupta
            try {
                  resultado = 10 / 0; //esta es la linea que provoca la excepcion
                 //capturamos la excepcion en el catch, el e es la variable que almacena  el tipo de excepcion
            } catch (Exception e) {
                  System.out.println("Exception  error: " + e);
                  e.printStackTrace(System.out); //Imprimimos la pila de expcepciones, porque puede haber una lista de excepciones
            }

            System.out.println("resultado = " + resultado);
      }
}
