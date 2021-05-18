package paquete2;

import paquete1.Clase2;

public class ClaseHija extends Clase2{
      
      public ClaseHija() {
            super();
            this.atributoProtected = "Modifcar atributo protected";
            System.out.println("atributoProtegido = " + this.atributoProtected);
            this.metodoProtected();
      }
      
}
