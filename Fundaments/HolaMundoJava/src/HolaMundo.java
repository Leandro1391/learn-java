
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

            var console = new Scanner(System.in);
            int mounth;
            var season = "Unknow season";

            System.out.println("Press a number");
            mounth = Integer.parseInt( console.nextLine());
            switch (mounth) {
                  case 1:
                  case 2:
                  case 12:
                        season = "Winter";
                        break;
                  case 3:
                  case 4:
                  case 5:
                        season = "Spring";
                        break;
                  case 6:
                  case 7:
                  case 8:
                        season = "Summer";
                        break;
                  case 9:
                  case 10:
                  case 11:
                        season = "Autumn";
                        break;
                  default:
                        season = "Wrong number";
            }
            System.out.println("season = " + season);
      }
}
