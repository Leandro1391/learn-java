
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

            //Sentece if  else
            var condition = true;

            if (condition) {
                  System.out.println("True condition");
                  System.out.println("New Line");
            } else {
                  System.out.println("False condition");
            }
            
            var number = 4;
            var numberText = "Unknow number";
            
            if (number == 1) {
                  numberText = "Number one";
            } else if (number == 2){
                  numberText = "Number two";
            }else if (number == 3) {
                  numberText = "Number three";
            } else if (number == 4) {
                  numberText = "Number four";
            } else {
                  numberText = "Number not found";
            }
            
            System.out.println("numberText = " + numberText);
      }
}
