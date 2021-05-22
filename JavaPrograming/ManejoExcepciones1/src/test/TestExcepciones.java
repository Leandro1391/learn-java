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

/* La clase padre de todas las excepciones se llama Trowable https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html
normalmente no lo vamos a usar en nuestro codigo, la que más vamos a usar es Exception que hereda de Throwable

A partir del Class Exception vamos a poder crear nuestras propias clases de excepcion.
Las clases que heredan de la clase exception se conoce como tipo Check Exception -> el compilador nos va a obligar  a usar el bloque try-catch o a propagar esta excepcion
claseses de tipo check exception -> va aoblogar

java.lang.ArithmeticException hereda de RuntimeException -> son excepciones que ocurren en tiempo de ejecucion
NullPointerException */