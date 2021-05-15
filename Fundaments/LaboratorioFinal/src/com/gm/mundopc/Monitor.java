package com.gm.mundopc;

public class Monitor {
      private int idMonitor;
      private String marca;
      private double tamanio;
      private static int contadorMonitores;
      
      private Monitor() {
            this.idMonitor = ++Monitor.contadorMonitores;
      }
      
      public Monitor(String marca, Double tamanio) {
            this();
            this.marca = marca;
            this.tamanio = tamanio;
      }

      public int getIdMonitor() {
            return this.idMonitor;
      }

      public String getMarca() {
            return this.marca;
      }

      public void setMarca(String marca) {
            this.marca = marca;
      }

      public double getTamanio() {
            return this.tamanio;
      }

      public void setTamanio(double tamanio) {
            this.tamanio = tamanio;
      }

      public int getContadorMonitores() {
            return this.contadorMonitores;
      }

      public void setContadorMonitores(int contadorMonitores) {
            this.contadorMonitores = contadorMonitores;
      }

      @Override
      public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Monitor{idMonitor=").append(idMonitor);
            sb.append(", marca=").append(marca);
            sb.append(", tamanio=").append(tamanio);
            sb.append(", contadorMonitores=").append(contadorMonitores);
            sb.append('}');
            return sb.toString();
      }
      
}
