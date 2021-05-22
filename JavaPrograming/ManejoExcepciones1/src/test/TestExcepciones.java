package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {

      public static void main(String[] args) {

            int resultado = 0;

            //Con try controlamos la excepcion para que no termine el programa de forma abrupta
            try {
                  resultado = division(10, 0);
//                  resultado = 10 / 0; //esta es la linea que provoca la excepcion
            // Para procesar mas de una excepcion podemos agregar otro catch
            //En primer lugar procesamos las excepciones de menor jerarquia y el ultimo catch debe ir la clase Exception que es el padre de todas las excepciones
            } catch (OperacionExcepcion e) {
                  System.out.println("Ocurrió un error de tipo OperacionExcepcion");
                  System.out.println(e.getMessage());
                  //capturamos la excepcion en el catch, el e es la variable que almacena  el tipo de excepcion
            } catch (Exception e) {
                  System.out.println("Exception  error of type Exception: " + e);
//                  e.printStackTrace(System.out); //Imprimimos la pila de expcepciones, porque puede haber una lista de excepciones
                  System.out.println(e.getMessage());
            } finally {
                  System.out.println("Se reviso la division entre cero");
            }

            //finally -> este bloque siempre se va ejecutar al final de la ejecucion try catch, se puede usar para cerrar recursos por ejemplo para finalizar la conexion a una base de datos o un archivo 
            //que se esta utilizando
            System.out.println("resultado = " + resultado);
      }
}

/* La clase padre de todas las excepciones se llama Trowable https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html
normalmente no lo vamos a usar en nuestro codigo, la que más vamos a usar es Exception que hereda de Throwable

* A partir del Class Exception vamos a poder crear nuestras propias clases de excepcion.

* Las clases que heredan de la clase exception se conoce como tipo Check Exception -> el compilador nos va a obligar  a usar el bloque try-catch o a propagar esta excepcion

* Las claseses que heredan de RuntimeException se conocen como uncheck exception -> el compilador no va a obligar agregar un bloque try-catch ni tampoco reportar estas excepciones

*Las clases NullPointerException cualquier variable que quiere acceder a un atributo o metodo y no esta apuntando a un objeto valido y tiene asignado un valor null entonces si tratr
de aceder a un atributo o metodo entonces va marcar una excepcion NullPointerException en tiempo de ejecucion

java.lang.ArithmeticException hereda de RuntimeException -> son excepciones que ocurren en tiempo de ejecucion

RECOMENDACION: en el dia de hoy se recomenda usar excepciones de RunTimeException, tener mas limpio el codigo y usar solamente try catch de las excepciones que pueden aparecer en la ejecucion

Solamente agregamos clases heredados a exception si es necesario, lo recomendable es con RunTimeException pero depende del desarrollador
check exception -> class Exception || uncheck exception -> RunTimeExcetion
*/
