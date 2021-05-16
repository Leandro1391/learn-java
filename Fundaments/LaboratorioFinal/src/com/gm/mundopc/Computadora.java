package com.gm.mundopc;

public class Computadora {
      
      private final int idComputadora;
      private String nombre;
      private Monitor monitor;
      private Teclado teclado;
      private Raton mouse;
      private static int contadorComputadora ;
      
      private Computadora() {
            this.idComputadora = ++Computadora.contadorComputadora;
      }
      
      public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton mouse) {
            this();
            this.nombre = nombre;
            this.monitor = monitor;
            this.teclado = teclado;
            this.mouse = mouse;
      }

      public int getIdComputadora() {
            return this.idComputadora;
      }

      public String getNombre() {
            return this.nombre;
      }

      public void setNombre(String nombre) {
            this.nombre = nombre;
      }

      public Monitor getMonitor() {
            return this.monitor;
      }

      public void setMonitor(Monitor monitor) {
            this.monitor = monitor;
      }

      public Teclado getTeclado() {
            return this.teclado;
      }

      public void setTeclado(Teclado teclado) {
            this.teclado = teclado;
      }

      public Raton getMouse() {
            return this.mouse;
      }

      public void setMouse(Raton mouse) {
            this.mouse = mouse;
      }

      @Override
      public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Computadora{idComputadora=").append(idComputadora);
            sb.append(", nombre=").append(nombre);
            sb.append(", monitor=").append(monitor);
            sb.append(", teclado=").append(teclado);
            sb.append(", mouse=").append(mouse);
            sb.append('}');
            return sb.toString();
      }
      
}
