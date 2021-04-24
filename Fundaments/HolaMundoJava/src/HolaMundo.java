
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

            
            //continue va a la siguiente iteración del ciclo for, no ejecuta las lineas que faltan en el ciclo
            for (int contador = 0; contador < 3; contador++) {
                  if (contador % 2 != 0) {
                        continue;//go to the next iteration
                  }
                  System.out.println("contador = " + contador);
            }
            
//            for (int contador = 0; contador < 3; contador++) {
//                  if (contador % 2 == 0) {
//                        System.out.println("contador = " + contador);
//                        break;
//                  }
//            }

//            var contador = 0;
//            while(contador < 3) {
//                  System.out.println("contador = " + contador);
//                  contador++;
//            }
            //cycle do while
//            var contador = 0;
//            do {
//                  System.out.println("contador = " + contador);
//                  contador++;
//            } while (contador < 3);
      }
}
