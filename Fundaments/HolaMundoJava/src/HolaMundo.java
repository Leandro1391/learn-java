
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

            var mounth = 0;
            var console = new Scanner(System.in);
            var season = "Season unknow";
            var ok = 'n';

            do {
                  System.out.println("Press the number between 1 to 12  for know the season");
                  mounth = Integer.parseInt(console.nextLine());

                  if (mounth == 1 || mounth == 2 || mounth == 12) {
                        season = "Winter";
                  } else if (mounth == 3 || mounth == 4 || mounth == 5) {
                        season = "Spring";
                  } else if (mounth == 6 || mounth == 7 || mounth == 8) {
                        season = "Summer";
                  } else if (mounth == 9 || mounth == 10 || mounth == 11) {
                        season = "Autumn";
                  } else {
                        System.out.println("Wrong number please try again");
                        season = "Season unknow";
                  }
                  System.out.println("season = " + season);
                  
                  System.out.println("Do you want continue? y/n");
                  ok = console.nextLine().charAt(0);

            } while (mounth <= 0 || mounth >= 13 || ok == 'y');

      }
}
