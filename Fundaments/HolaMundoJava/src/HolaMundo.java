
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
            
            // Switch is the best way for menú options
            //IF I don't added the keyword break the ejecution procedes to the next case in the switch
            
            var number = 4;
            var numberText = "unknow value";
            
            switch (number){
                  case 1:
                          numberText = "Number one";
                          break;
                  case 2:
                        numberText = "Number two";
                        break;
                  case 3:
                        numberText = "Number three";
                        break;
                  case 4:
                        numberText = "Number four";
                        break;
                  default:
                        numberText = "Case not found";
            }
            System.out.println("numberText = " + numberText);
      }
}
