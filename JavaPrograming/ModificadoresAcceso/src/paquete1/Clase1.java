package paquete1;

//public  esta permitido a nivel clase
public class Clase1 {
      //Se puede aplicar public en atributos
      public String atributoPublico = "Valor atributo publico";
      
      //Se puede aplicar public en constructores
      public Clase1() {
            System.out.println("Constructor Public");
      }
      
      //Tambien en metodos se puede aplicar public
      public void metodoPublico() {
            System.out.println("Metodo publico");
      }
}