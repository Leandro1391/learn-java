package test;

import operaciones.Operaciones;

public class TestOperaciones {

      public static void main(String[] args) {
//            System.out.println("Primera sobrecarga del metodo sumar con int: " + Operaciones.sumar(5, 10));
//            System.out.println("Segunda sobrecarga del metodo sumar con double: " + Operaciones.sumar(20.5, 10.2));
            
            var resultado1 = Operaciones.sumar(5, 3);
            System.out.println("resultado1 = " + resultado1);
            
            var resultado2 = Operaciones.sumar(2.0, 3);
            System.out.println("resultado2= " + resultado2);
                        
            
            var resultado3 = Operaciones.sumar(3, 5L);
            System.out.println("resultado3 = " + resultado3);
      }
}
