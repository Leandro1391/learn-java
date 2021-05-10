package domian;

//Si tiene la palabra reservada finla no podra extenderse a las clases hijas
//public final class Persona {
public final class Persona {
      //No podremos modificar el comportamiento del metodo imprimir en una clase hija
      public final void imprimir() {
            System.out.println("Metodo imprimir");
      }
}
