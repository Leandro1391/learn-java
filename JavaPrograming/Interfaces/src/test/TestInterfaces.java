package test;

import accesodatos.*;

//el objetivo de las interfaces es hacer metodos mas genericos
//podremos asignar a la variables de tipo interface que puede apuntar a objetos que haya implementado la interfaz que necesitamos

public class TestInterfaces {
      public static void main(String[] args) {
            //definimos una variable interface, pero no podemos crear una instancia de la interfaz con new (objeto)
            IAccesoDatos datos =  new ImplementacionMySql();
//            datos.listar(); //Polimorfismo
            imprimir(datos);
            
            datos = new ImplementacionOracle();
//            datos.listar();
            imprimir(datos);
      }
      
      //el metodo que se va ejecutar en imprimri va a depender a que clase esta apuntando el argumento (objeto ImplementacionMySql o ImplemetancionOracle)
      public static void imprimir(IAccesoDatos datos) {
            datos.listar();
      }
}

//clases: padre, hijas, abstractas

//En la clase asbtraemos las caracteristicas que tiene en comun un objeto de la realidad
//En interfaces estamos abstrayendo comportamiento en comun y despues tenemos clases que implementan ese comportamiento

//En los patrones de diseño se usa mucho interfaces, como los frameworks Spring hibernate
