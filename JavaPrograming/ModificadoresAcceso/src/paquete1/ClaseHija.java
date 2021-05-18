package paquete1;

import paquete1.Clase2;

public class ClaseHija extends Clase2{
      
      public ClaseHija() {
            super();
            this.atributoDefault = "Modifcar atributo default";
            System.out.println("atributoDefault = " + this.atributoDefault);
            this.metodoDefault();
      }
      
}
