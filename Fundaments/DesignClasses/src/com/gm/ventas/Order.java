package com.gm.ventas;

public class Order {

      private int idOrder;
      private Producto productos[];
      private static int contadorOrdenes;
      public static final int MAX_PRODUCTOS = 10;

      public Order() {
            this.idOrder = ++Order.contadorOrdenes;
            this.productos = new Producto[Order.MAX_PRODUCTOS];
      }

      public void agregarProducto(Producto producto) {
            if (producto.getIdProducto() < Order.MAX_PRODUCTOS) {
                  this.productos[producto.getIdProducto()] = producto;
            }
            else {
                  System.out.println("Se ha superado el maximo de productos: " + Order.MAX_PRODUCTOS);
            }
      }

      public double calcularTotal() {
            double total = 0;
            for (Producto producto : this.productos) {
                  if (producto != null) {
                        total += producto.getPrecio();
                  }  //else {
//                        break;
//                  }
            }
            return total;
      }

      public void mostrarOrden() {
            System.out.println("Orden Nº " + this.idOrder);
            System.out.println("Productos                    Precio");
            for (Producto producto : this.productos) {
                  if (producto != null) {
                        System.out.println(producto.toString());
                  }
            }
            System.out.println("Total     $ " + this.calcularTotal());
      }
}
