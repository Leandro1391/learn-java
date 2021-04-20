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
        var user = "Giovanni";
        var title = "Ingenieri";

        var union = title + " " + user;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;
        
        //Sum of numbers
        System.out.println(i + j);
        System.out.println(i + j + " " +user);
        
        //Interesting example -> context string
        System.out.println(user  + i + j);
        
        //Iwth parentheses up the priority evaluation level, in this case first sumaand then string
        System.out.println(user  + (i + j));
        

        // ALf + Shift + F -> format the code in the IDE
    }
}
