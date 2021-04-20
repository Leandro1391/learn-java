
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
        System.out.println("Write your name:");
        //Class Scanner is from Java
        Scanner console = new Scanner(System.in);
        
        //nextLine waits the user input word
        var user = console.nextLine();
        System.out.println("user = " + user);
        
        System.out.println("Title:");
        var title = console.nextLine();
        System.out.println("Result = " + title + " " + user);
        

    }
}
