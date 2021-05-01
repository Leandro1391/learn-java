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
      //la palabra reservada "this" apunta al objeto que se está ejecutando en el compilador en ese momento, con eso podemos tambien acceder a los atributos y metodos d ela clase
      public int sumWithReturn() {
            return this.a + this.b;
      }
      
      //Cuando estamos difiniendo la firma del metodo se llama argumentos
      public int sumWIthArguments(int a, int b) {
            //in this case whe must use constructor for the args
            this.a = a; //Argumento a se asigna al atributo this.a
            this.b = b; //Argumento b se asigna al atributo this.b
            return this.sumWithReturn();
      }
      
      //El this solamente se puede utilizar en la clase que estamos  trabajando para realizar instancias en el main
      //THIS sirve para saber si hace referencuia a un atributo de nuestra clase y si no tiene es una variable local de clase
}
