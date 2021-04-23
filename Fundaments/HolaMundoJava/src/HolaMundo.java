
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
            //Numbers
            var a = 3;
            var b = -a;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            
            //Boolean
            var c = true;
            var d = !c;       //negation
            System.out.println("c = " + c);
            System.out.println("d = " + d);
            
            //increment
            //1.preincrement (symbole goes before  of the variable)
            var e = 3;
            var f = ++e; //first increment the variable and later use his value
            System.out.println("e = " + e);
            System.out.println("f = " + f);
            
            //2.postincrement (symbol goes after the variable)
            var g = 5;
            var h = g++; //h = 5
            System.out.println("g = " + g); //g = 6 increment
            System.out.println("h = " + h); // h=5
            
            //decrement
            //1.predecrement
            var i = 2;
            var j = --i;
            System.out.println("i = " + i);
            System.out.println("j = " + j);
            
            //2.Postdecrement
            var k =4;
            var l= k--; // first use the variable value and stay pending th decrement
            System.out.println("k = " + k); //has pending one decrement
            System.out.println("l = " + l); 
            
      }
}
