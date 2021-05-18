package test;

import paquete1.Clase1;
import paquete1.Clase2;
import paquete2.*;

public class TestModificadoresAcceso {

      public static void main(String[] args) {
            Clase1 clase1 = new Clase1();
            System.out.println("clase1 = " + clase1.atributoPublico);
            clase1.metodoPublico();

            //Con protected no se puede acceder al constructor de la Clase2() debemos definir otro como public 
            //esto pasa porque estamos en un paquete distinto a donde está definido Clase2,  si es hija también tendra restricciones en otro paquete
//            Clase2 clase2 = new Clase2("Publico");
            //No podemos acceder a los atributos protected
//            System.out.println("clase2 = " + clase2.atr);
            //No se puede acceder a los metodos  protected
//            clase1.metodoPublico();
            ClaseHija claseHija = new ClaseHija();
            System.out.println("claseHija = " + claseHija);

            //En resumen no se puede acceder a los atributos, metodos y contructores protected de una clase externa, solamente podrá se la clase es derivada
      }
}
