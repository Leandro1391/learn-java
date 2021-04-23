
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

            //Conditional Operators
            var a = 5;
            var minValue = 0;
            var maxValue = 10;

            var result = a >= 0 && a <= 10;
            if (result) {
                  System.out.println("inside of range");
            } else {
                  System.out.println("Out of range");
            }

//            if (a > = 0 && a <= 10)
//                  System.out.println("a is  in the range between 0 and 10");
            var holidays = true;
            var dayRest = false;

            if (holidays || dayRest) {
                  System.out.println("the father can to asist son's game");
            } else {
                  System.out.println("the father is bussy");
            }
      }
}
