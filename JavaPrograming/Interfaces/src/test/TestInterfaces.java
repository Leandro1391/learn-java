package test;

import accesodatos.*;

/*Una interface es parecido a una clase abstracta, en el aspecto de que los metodos no tienen el comportamiento definido como metodo abstractos,
 una interfaz es un nuevo tipo en java y similar a las clases abstractas todo ls metodo deinifdos seran abstractas y sus atritbuso sera constantes (public, final y static)

La diferencia principal de una clase abstracta y una interfaz es:
* Cuando las caracteristicas de nuestra clase son muy parecidas de una figura geometrica (cuadrado, triangulo, circulo) se usa herencia y la clase padres es abstracto
* Cuando la relacion entre las clases tiene en común su comportamiento se recomienda usar INTERFACES como la conexion a distintas base de datos (MySQL y Oracle)
para que tenga metodo genericos y los dos van implementar los metodos definidos en
entonces euna interface  lo vamos a usar mas para el comportamiento de nuestras clases, No tanto por las caracteriscas que heredemos sino POR COMPORTAMIENTO EN COMUN
*/

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
