package operations;

public class Arithmetic {
      //Atributos de la clase
      int a;
      int b;
      
      //Metodo -> name camelCase
      public void sum() {
            int resultado = a  + b;
            System.out.println("resultado = " + resultado);
      }
      //la palabra reservada this apunta al objeto que se está ejecutando en el compilador, con eso podemos tambien acceder a los atributos y metodos d ela clase
      public int sumWithReturn() {
            return a + b;
      }
      
      //Cuando estamos difiniendo la firma del metodo se llama argumentos
      public int sumWIthArguments(int arg1, int arg2) {
            //in this case whe must use constructor for the args
            a = arg1;
            b = arg2;
            return sumWithReturn();
      }
}
