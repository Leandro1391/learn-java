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

//abstract: la palabra  hace referencia cuando no sabemos el comportamiento de un metodo porque es muy generico y lo definimos en la clase hija el comportamiento obligatoriamente
//Si es una clase significa que no se puede instanciar y por lo menos puede tener al menos un metodo abstracto o ninguno.
