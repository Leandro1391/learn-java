package test;

// Una matrz es una arreglo de arreglo en programacion
import domain.Persona;

public class TestMatrices {

      public static void main(String[] args) {
            // esto es object que va almacenar elementos de tipo entero (es primitivo! la variable edades)
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
            TestMatrices.imprimir(edades);
//            for (int fila = 0; fila < edades.length; fila++) {
//                  for (int col = 0; col < edades[fila].length; col++) {
//                        System.out.println("Edades " + fila + " - " + col + " = " + edades[fila][col]);
//                  }
//            }

            //Sintaxis clasica
             String vegetables[][] = new String[3][2];
             
             TestMatrices.imprimir(vegetables);
             
            //Sintaxis simplificada
            String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "Zarzamora", "Mora"}};

            TestMatrices.imprimir(frutas);

            Persona personas[][] = new Persona[2][3];
            personas[0][0] = new Persona("Juan");
            personas[0][1] = new Persona("Mirta");

            TestMatrices.imprimir(personas);
      }

      // No necesitamos indicar en el argumento la cnatidad de filas y columnas porque lo saber con la referencia en memoria del objeto
      public static void imprimir(Object matriz[][]) {
            for (int fil = 0; fil < matriz.length; fil++) {
                  for (int col = 0; col < matriz[fil].length; col++) {
                        System.out.println("Elementos de la matriz: " + fil + "-" + col + ": " + matriz[fil][col]);
                  }
            }
      }
      
      public static void imprimir(int matriz[][]){
            for (int fil = 0; fil < matriz.length; fil++) {
                  for (int col = 0; col < matriz[fil].length; col++) {
                        System.out.println("edades " + fil + "-" + col + ": " + matriz[fil][col]);
                  }
            }
      }
}
