package test;

import domain.*;

public class TestClaseAbstracta {
      public static void main(String[] args) {
            //Las clases abstractas no se pueden instanciarse, la consigna es no trabajar con la clase padre solamente con las hijas
            //puede haber una clase abstracta sin metodos abstractos para indicar que no se puede crear una referencia de ese objeto
//            FiguraGeometrica figura = new FIguraGeomtrica());

            //El objetivo de POO es reutilizar codigo y usar algoritmos lo mas generico posible (reutilizable) y para hacerlo usamos polimorfismo
            FiguraGeometrica figura = new Rectangulo("Rectangulo");     //upcasting
            figura.dibujar(); //en polimorfimos siempre ejecuta primero la clase con menor jerarquia  del metodo dibujar() (clase hija) en este caso nunca ejecutara la clase padre porque es abstracta el metodo
      }
}
