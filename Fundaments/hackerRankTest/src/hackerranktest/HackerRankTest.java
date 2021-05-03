package hackerranktest;

import java.util.Scanner;

public class HackerRankTest {

      /**
       * @param args the command line arguments
       */
      public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            int q, a, b, n, result = 0, p = 1;

            do {
                  q = in.nextInt();
            } while (q < 0 || q > 500);

            for (int i = 0; i < q; i++) {

                  do {
                        a = in.nextInt();
                        b = in.nextInt();
                        n = in.nextInt();
                  } while ((a < 0 || a > 50) || (b < 0 || b > 50) || (n < 1 || n > 15));

                  for (int j = 0; j < n; j++) {

                        if (j == 0) {
                              result = a + (1) * b;
                        } else {
                              p *= 2;
                              result += p * b;
                        }
                        System.out.print(result + " ");
                  }
                  System.out.println("");
                  p = 1;
            }
            in.close();
      }
}
