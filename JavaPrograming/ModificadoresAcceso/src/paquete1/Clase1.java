package paquete1;

//public se puede apicar en una clase y en una clase externa  en el mismo paquete o en uno externo
public class Clase1 {
      //Se puede aplicar public en atributos
      public String atributoPublico = "Valor atributo publico";
      
      //Se puede aplicar public en constructores
      public Clase1() {
            System.out.println("Constructor Public");
      }
      
      public void metodoPublico() {
            System.out.println("Metodo publico");
      }
}