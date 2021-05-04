package hackerranktest;

import java.util.Scanner;

public class HackerRankTest {

      static int B, H;
      static boolean flag = true;

      static {
            Scanner sc = new Scanner(System.in);
            do {
                  B = Integer.parseInt(sc.nextLine());
                  H = Integer.parseInt(sc.nextLine());
            } while ((B < -100 || B > 100) || (H < -100 || H > 100));

            if (B <= 0 || H <= 0) {
                  System.out.println("java.lang.Exception: Breadth and height must be positive");
                  flag = false;
            }
      }

      public static void main(String[] args) {

            if (flag) {
                  int area = B * H;
                  System.out.print(area);
            } else  {
                  System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
      }
}
