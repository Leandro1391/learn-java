
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
            
            var a = 3;
            var b =2;
            
            var c = (a == b);
            System.out.println("c = " + c);
            
            var d = a != b;
            System.out.println("d = " + d);
            
            var chain = "Hello";
            var chain2 = "Hello";
            var e = chain == chain2;// compare memeory reference of the two objects variables(string is a object )
            System.out.println("e = " + e);
            
            var f = chain.equals(chain2); //Verifica si el contenido de cadenas es el mismo
            System.out.println("f = " + f);
            
            //Relational Operators
            var g = a >= b;
            System.out.println("g = " + g);
            
            if (a % 2 == 0)
                  System.out.println("Es numero par ");
            else  
                  System.out.println("Es numero impar");
            
            var age = 15;
            var adult = 18;
            if (age >= adult) 
                  System.out.println("Is eldest");
           else
            System.out.println("Is not eldest");
                  
            }
      }
