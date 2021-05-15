package com.gm.mundopc;

public class Orden {

      private int idOrden;
      private Computadora computadoras[];
      private int contadorOrdenes;
      private int contadorComputadoras;
      private int maxComputadoras = 10;

      public Orden() {
            this.idOrden = ++ this.contadorOrdenes;
            this.computadoras = new Computadora[this.maxComputadoras];
      }
      
      //The best way is to use List
      public void agregarComputadora(Computadora computadora ) {
            this.computadoras[this.contadorComputadoras++] = computadora;
      }
      
      public void mostrarOrden() {
             System.out.println("Orden Nº " + this.idOrden);
            System.out.println("Productos                    Precio");
            for (int i = 0; i < this.contadorComputadoras; i++) {
                  System.out.println(this.computadoras[i].toString());
            }
//            System.out.println("Total     $ " + this.calcularTotal());
      }

}
