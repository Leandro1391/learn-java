package pasoporvalor;

// La lecicón es que con variables de tipo primitivos no se puede cambiar el valor pasandolo a otros métodos
// solamente se puede realizar con atributos de objetos

public class PasoPorValor {
      public static void main(String[] args) {
            int  x = 10;
            System.out.println("x = " + x);
            
            changeValue(x);
      }
      
      //recibe una copia de valor del atributo x, no se puede modificar desde otro metodo
      public static void changeValue(int arg1) {
            System.out.println("arg1 = " + arg1);
            
      }
}
