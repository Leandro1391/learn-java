
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
        
        /*Se solicita capturar la siguiente información de una tienda de libros:
        nombre (String)
        id (int)
        precio (double)
        envioGratuito (boolean)*/
        
        var  console = new Scanner(System.in);
        
        System.out.println("Give the name: ");
        var name =  console.nextLine();
        
        System.out.println("Give Id");
        var id = Integer.parseInt(console.nextLine());
        
        System.out.println("Give price");
        var price = Double.parseDouble(console.nextLine());
     
        System.out.println("Give Shipment free");
        var shipment = Boolean.parseBoolean(console.nextLine());
        
        System.out.println("name: " +  name + " - #id:" + id);
        
        System.out.println("Price: $"  + price);
        System.out.println("Send shipment free: " + shipment);
       
    }
}
