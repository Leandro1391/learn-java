package test;

import domain.*;

//Precondiciones para polimorfismo: Tener una herencia de clases(una clase padre e hija) y poseer al menos un metodo sobreescrito desde la clase hija que pertenezca al padre
//Polimorfismo: multiples comportamientos en tiempo de ejecucion del programa, desde el compilador no se puede ver como se implementa

//En la clase hija solamente se puede hacer menos restivtivo con respecto a la clase padre en el metodo sobreescrito si está en protected por ejmplo (public, default o protected)

public class TestSobreescritura {
      public static void main(String[] args) {
            //Realizamos una instancia de la clase padre
            Empleado empleado = new Empleado("Juan", 5000);
//            System.out.println("empleado = " + empleado.obtenerDetalles());
                  imprimir(empleado);
            
            empleado = new Gerente("Julia", 10000.0, "Contabilidad");
//            System.out.println("gerente = " + gerente.obtenerDetalles());
            imprimir(empleado);
            
            //Definimos una variable de la clase hija
//            Gerente gerente = new Gerente("Julia", 10000.0, "Contabilidad");
//            System.out.println("gerente = " + gerente.obtenerDetalles());
            
      }
      
      // para poder recibir referencias tanto de la clase padre y de la hija usamos el más genérico (el padre)
      public static void imprimir(Empleado empleado) {
            System.out.println("empleado = " + empleado.obtenerDetalles()); // aquí se aplica el concepto de polimorfismo
      }
}

/* En tiempo de ejecución, se ejecutara el metodo correspondiente dependiendo del tipo de objeto que va recibir, en este caso la variable empleado, que esta almacenado en referencia en memoria
* Multiples comportamientos dependiendo donde este apuntado en memoria el tipo objeto (deben ser compatibles los objetos, es decir, deben poseer herencia)
* Es un concepto es muy importante  en POO, ya que vamos a poder crear metodos mas genericos, como el caso del metodo imprimir podremos imprimir  informacion varios tipos de objetos
como la clase hija y del padre en un solo metodo.
 reutilizando codigo para que se pueda tener mejor mantenimiento


Resumen Polimorfismo: es tener un metodo generico que reciba la referencia de un objeto y dependiendo de la referencia que estemos apuntando en memoria, entonces en tiempo de ejecucion
el metodo obtenerDetalles() va hacer referencia a la clase donde se esta apuntando en memoria, dependiendo si un tipo padre (Empleado) o hijo (Gerente)
*/
