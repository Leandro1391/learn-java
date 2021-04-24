
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

            var numero1 = 0;
            var numero2 = 0;

            var console = new Scanner(System.in);

            System.out.println("Proprociona el numero1: ");
            numero1 = Integer.parseInt(console.nextLine());

            System.out.println("Proporciona el numero2: ");
            numero2 = Integer.parseInt(console.nextLine());
            System.out.println("El numero mayor es: ");
            System.out.println(String.valueOf( numero1>numero2 ? numero1 : numero2==numero1 ? "Error: Los numeros son iguales" : numero2));

//            if (numero1 > numero2) {
//                  System.out.println("El numero mayor es: " + numero1);
//            } else if (numero1 == numero2) {
//                  System.out.println("Los numeros son iguales");
//            } else {
//                  System.out.println("El numeros mayor es: " + numero2);
//            }
      }
}
