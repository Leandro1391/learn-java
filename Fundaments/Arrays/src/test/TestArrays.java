package test;

public class TestArrays {
      
      public static void main(String[] args) {
            //tambien se puede declarar así int []ages
            //Los arreglos son de tipo Object y no se puede modificar el tamaó del array ya una vez declarado
            int ages[] = new int[3];
            System.out.println("ages = " + ages);
            
            //Modificar y acceder elementos d eun array
            ages[0] = 10;
            System.out.println("ages 0 = " + ages[0]);
            ages[1] = 15;
            System.out.println("ages 1 = " + ages[1]);
            ages[2] = 27;
            System.out.println("ages 2 = " + ages[2]);
      }
      
}
