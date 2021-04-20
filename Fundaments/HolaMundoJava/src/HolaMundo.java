
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
        
         Scanner console = new Scanner(System.in);
         
         System.out.println("Input the title:");
        var title = console.nextLine();
         
         System.out.println("Input the author:");
         var author = console.nextLine();
         
         System.out.println( title + "  was written by " + author);      
        
    }
}
