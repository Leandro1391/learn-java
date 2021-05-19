package test;

import domain.*;

// Con instanceOf vamos a poder determinar el tipo de la referencia a la cual se está apuntando en memoria cierta variable
//ATENCION tipo variable y tipo que esta apuntando en memoria son distintos
public class TestInstaneOf {

      public static void main(String[] args) {
            Empleado empleado = new Empleado("Juan", 5000);
//            determinarTipo(empleado);
            empleado = new Gerente("Julia", 10000.0, "Contabilidad");
            determinarTipo(empleado);

      }

      //primero se pregunta del mas especificas (hijas) y despues los mas genericos hasta la clase object
      public static void determinarTipo(Empleado empleado) {
            if (empleado instanceof Gerente) {
                  System.out.println("Es de tipo gerente");
            } else if(empleado instanceof Empleado) {
                  System.out.println("Es de tipo Empleado");
            } else if(empleado instanceof  Object) {
                  System.out.println("Es de tipo Object");
            }
      }
}
