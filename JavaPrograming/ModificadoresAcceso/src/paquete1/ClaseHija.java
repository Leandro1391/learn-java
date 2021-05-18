package paquete1;

import paquete1.Clase2;

public class ClaseHija extends Clase2{
      
      //Como el constructo d ela clase padre es privado da error y no se puede utilizar
      public ClaseHija() {
            super("Publico");
//            this.atributoDefault = "Modifcar atributo default";
//            System.out.println("atributoDefault = " + this.atributoDefault);
//            this.metodoDefault();
      }
      
}
