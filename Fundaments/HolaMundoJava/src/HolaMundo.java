
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

            var alto =0;
            var ancho = 0;
            
            var console = new Scanner(System.in);
            
            System.out.println("Proporciona el alto: ");
            alto = Integer.parseInt(console.nextLine());
            
            System.out.println("Proporciona el ancho: ");
            ancho = Integer.parseInt(console.nextLine());
                    
            System.out.println("Area: " + alto * ancho);
            System.out.println("Perimetro: " + 2*(alto + ancho));
            
      }
}
