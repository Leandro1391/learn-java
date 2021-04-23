
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author leandro
 */
public class HolaMundo {

      public static void main(String args[]) {

            //Operator Priority
            
            //the compllation read left to right
            var x = 5;
            var y = 10;
            var z = ++x + y--; 
            
            System.out.println("x = " + x);
            System.out.println("y = " + y); //9 because the decremetn is post secuence execution
            System.out.println("z = " + z);
            
            // Si usamos parentesis podemos cambiar la prioridad
            var result = 4 + 5 * 6 / 3; //  4 + ((5*6) / 3)
            System.out.println("result = " + result);
            
            result = ( 4 + 5 ) * 6 / 3; //  54 / 3 = 18
            System.out.println("result = " + result);
      }
}
