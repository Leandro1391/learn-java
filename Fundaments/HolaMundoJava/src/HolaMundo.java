
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

            var nota = 0;
            var ok = 'n';
            var console = new Scanner(System.in);

            do {
                  System.out.println("Proporciona un valor entre 0 y 10: ");
                  nota = Integer.parseInt(console.nextLine());
                  if (nota >= 9 && nota <= 10) {
                        System.out.println("A");
                  } else if (nota >= 8 && nota < 9) {
                        System.out.println("B");
                  } else if (nota >= 7 && nota < 8) {
                        System.out.println("C");
                  } else if (nota >= 6 && nota < 7) {
                        System.out.println("D");
                  } else if (nota >= 0 && nota < 6) {
                        System.out.println("F");
                  } else {
                        System.out.println("Valor desconocido");
                  }
                  System.out.println("¿Desea continuar?  s/n");
                  ok = console.nextLine().charAt(0);
            } while (nota <= 0 || nota > 10 || ok == 's');

      }
}
