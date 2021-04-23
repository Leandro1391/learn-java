
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

            var result = (3 > 2) ? "true" : "false";
            System.out.println("result = " + result);
            
            // Solamente se usan si son expresiones sencillas el operador ternario
            
            var number = 5;
            result = (number % 2 == 0) ? "Es par" : "Es impar";
            System.out.println("result = " + result);

      }
}
