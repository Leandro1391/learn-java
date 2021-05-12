package test;

// Una matrz es una arreglo de arreglo en programacion

public class TestMatrices {
      public static void main(String[] args) {
            // esto es object que va almacenar elementos de tipo entero
            int edades[][] = new int[3][2];
            System.out.println("edades = " + edades);
            
            edades[0][0] = 5;
            edades[0][1] = 7;
            edades[1][0] = 8;
            edades[1][1] = 4;
            
            System.out.println("edades 0-0 = " + edades[0][0]);
            System.out.println("edades 0-0 = " + edades[0][1]);
            System.out.println("edades 0-0 = " + edades[1][0]);
            System.out.println("edades 0-0 = " + edades[1][1]);
      }
}
