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
            edades[2][0] = 12;
            edades[2][1] = 10;
            
//            System.out.println("edades 0-0 = " + edades[0][0]);
//            System.out.println("edades 0-0 = " + edades[0][1]);
//            System.out.println("edades 0-0 = " + edades[1][0]);
//            System.out.println("edades 0-0 = " + edades[1][1]);
            
            for (int fila = 0; fila < edades.length; fila++) {
                  for (int col = 0; col < edades[fila].length; col++) {
                        System.out.println("Edades " + fila + " - " + col + " = " +edades[fila][col]);
                  }
            }
            
            //Sintaxis clasica
            // String frutas[][] = new String[3][2];
            
            //Sintaxis simplificada
            String frutas[][] = {{"Naranja","Limon"},{"Fresa", "Zarzamora", "Mora"}};
            
            for (int fil = 0; fil < frutas.length; fil++) {
                  for (int col = 0; col < frutas[fil].length; col++) {
                        System.out.println("frutas " + fil + "-" + col + ": " + frutas[fil][col]);
                  }
                  
            }
      }
}
