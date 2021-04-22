
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
        
        // defuale value in boolean is false
        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);
        
      if(varBoolean)
            System.out.println("The flag is true");
      else
            System.out.println("The flag is false");
        
      var age = 30;
//      var isAdult = age >= 18;
        if (age >= 18) 
            System.out.println("You are of legal age" );
        else
        System.out.println("You are not of legal age");
      
    }
}
