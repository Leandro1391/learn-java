package operaciones;

public class Operaciones {

      //Sobrecarga de metodo consisten en  declarar dos o mas veces el mismo nombre de metodo
      //diferenciandose cada una con una cantidad distinta de argumentos
      public static int sumar(int a, int b) {
            System.out.println("sumar(int a, int b)");
            return a + b;
      }
      
      public static double sumar(double a, double b) {
            System.out.println("sumar(double a, double b)");
            return  a + b;
      }
}
