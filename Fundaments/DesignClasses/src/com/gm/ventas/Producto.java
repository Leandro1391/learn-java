package com.gm.ventas;

public class Producto {

      private int idProducto;
      private String nombre;
      private double precio;
      private static int contadorProducto;

      private Producto() {
            this.idProducto = Producto.contadorProducto++;
      }

      public Producto(String nombre, double precio) {
            this();
            this.nombre = nombre;
            this.precio = precio;
      }

      public int getIdProducto() {
            return this.idProducto;
      }

      public String getNombre() {
            return this.nombre;
      }

      public void setNombre(String nombre) {
            this.nombre = nombre;
      }

      public double getPrecio() {
            return this.precio;
      }

      public void setPrecio(double precio) {
            this.precio = precio;
      }

      @Override
      public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Producto ").append(++idProducto);
            sb.append(" ").append(nombre);
            sb.append("       ").append(precio);
            sb.append(' ');
            return sb.toString();
      }

}
