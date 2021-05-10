package domian;

//Si tiene la palabra reservada finla no podra extenderse a las clases hijas
//public final class Persona {
public final class Persona {
      
      //Esto se define como variable constante en Java porque es estatico, publico y final
      public final static int MI_CONSTANTE = 1;
      
      //No podremos modificar el comportamiento del metodo imprimir en una clase hija
      public final void imprimir() {
            System.out.println("Metodo imprimir");
      }
}
