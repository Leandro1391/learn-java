
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

            //NO ES RECOMENDABLE USAR GO TO (ETiQUETAS - LABELS)
            
            //En este caso lo que hace es cuando ejecuta la linea 24 se va a la 21, se puede usar cuando queramos ir a un for previo, es decir, ciclos anidados
            
            inicio:
            for (int contador = 0; contador < 3; contador++) {
                  if (contador % 2 != 0) {
                        continue inicio;//go to the code line label (21)
                  }
                  System.out.println("contador = " + contador);
            }
            
//            for (int contador = 0; contador < 3; contador++) {
//                  if (contador % 2 == 0) {
//                        System.out.println("contador = " + contador);
//                        break inicio;
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
