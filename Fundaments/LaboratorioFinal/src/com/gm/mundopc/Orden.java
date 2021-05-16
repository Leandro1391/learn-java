package com.gm.mundopc;

public class Orden {

      private final  int idOrden;
      private Computadora computadoras[];
      private static int contadorOrdenes;
      private int contadorComputadoras;
      private static final int MAX_COMPUTADORAS = 10;

      public Orden() {
            this.idOrden = ++Orden.contadorOrdenes;
            this.computadoras = new Computadora[this.MAX_COMPUTADORAS];
      }
      
      //The best way is to use List
      public void agregarComputadora(Computadora computadora ) {
            if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS)
                  this.computadoras[this.contadorComputadoras++] = computadora;
            else
                  System.out.println("Has superado el limite: " + Orden.MAX_COMPUTADORAS);
      }
      
      public void mostrarOrden() {
             System.out.println("Orden Nº " + this.idOrden);
            System.out.println("Computadoras de la orden #: " + this.idOrden);
            for (int i = 0; i < this.contadorComputadoras; i++) {
                  System.out.println(this.computadoras[i].toString());
            }
      }

}
