
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
        
        //Convertion string type to int type (redundance type word)
        var age = Integer.parseInt( "20");
//        var edad = "20";
        System.out.println("edad = " + (age + 1));
      
        var valuePI = Double.parseDouble("3.1416");
        System.out.println("valuePI = " + valuePI);
        
        //Ask a value
        var console = new Scanner(System.in);
//        System.out.println("Give a vlue");
//        age = Integer.parseInt(console.nextLine());
//        System.out.println("age = " + age);
        
        var ageText = String.valueOf(10);
        System.out.println("ageText = " + ageText);
        
        //Char -> explicit convertion type String to Char
        var varChar = "hola".charAt(0);
        System.out.println("varChar = " + varChar);
        
        System.out.println("Give one char");
        varChar =  console.nextLine().charAt(0) ;
        System.out.println("varChar = " + varChar);
    }
}
