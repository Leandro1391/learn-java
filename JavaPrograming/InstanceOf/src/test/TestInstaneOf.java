package test;

import domain.*;

// Con instanceOf vamos a poder determinar el tipo de la referencia a la cual se está apuntando en memoria cierta variable
//ATENCION tipo variable y tipo que esta apuntando en memoria son distintos
public class TestInstaneOf {

      public static void main(String[] args) {
            Empleado empleado = new Empleado("Juan", 5000);
            determinarTipo(empleado);
            empleado = new Gerente("Julia", 10000.0, "Contabilidad");
//            determinarTipo(empleado);

      }

      //primero se pregunta del mas especificas (hijas) y despues los mas genericos hasta la clase object
      //Ademas de saber que tipo es la referencia podemos asegurarnos a que conversion tenemos que enviar
      public static void determinarTipo(Empleado empleado) {
            if (empleado instanceof Gerente) {
                  System.out.println("Es de tipo gerente");
//                  ((Gerente) empleado).getDepartamento(); // Conversion de tipo
                  Gerente gerente = (Gerente) empleado;
                  System.out.println("gerente = " + gerente.getDepartamento());
                  //((Gerente) empleado).getDepartamento(); //en esta linea se puede acceder a los metodos de la clase hija
            } else if (empleado instanceof Empleado) {
                  System.out.println("Es de tipo Empleado");
//                  Gerente gerente = (Gerente) empleado;
//                  System.out.println("gerente = " + gerente.getDepartamento());
                  //Solamente podremos trabajar con metodos de la clase Empleado
                  System.out.println("empleado = " + empleado.getNombre());
            } else if (empleado instanceof Object) {
                  System.out.println("Es de tipo Object");
                  //soalmente tenemos accesos a los metodos definidos en la clase object
            }
      }
}

//Nota: no e puede realizar un casting de objectos de padre a hijo, dará error en tiempo de ejecucion
//java.lang.ClassCastException, solamente esta permitido casteo de hijo a  padre.