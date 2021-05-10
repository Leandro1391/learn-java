package domain;

import java.util.Date;

public class Cliente extends Persona {

      private int idCliente;
      private Date fechaRegistro;
      private boolean vip;
      private static int contadorCliente;

      public Cliente(String nombre, boolean vip) {
            super(nombre);
            this.fechaRegistro = new Date();
            this.idCliente = ++Cliente.contadorCliente;
            this.vip = vip;
      }

      public Cliente(String nombre, char genero, int edad, String direccion, boolean vip) {
            super(nombre, genero, edad, direccion);
            this.fechaRegistro = new Date();
            this.idCliente = ++Cliente.contadorCliente;
            this.vip = vip;
      }

      public int getIdCliente() {
            return this.idCliente;
      }

      public Date getFechaRegistro() {
            return this.fechaRegistro;
      }

      public boolean isVip() {
            return this.vip;
      }

      public void setVip(boolean vip) {
            this.vip = vip;
      }

      @Override
      public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Cliente{idCliente=").append(idCliente);
            sb.append(", fechaRegistro=").append(fechaRegistro);
            sb.append(", vip=").append(vip);
            sb.append(", ").append(super.toString());
            sb.append('}');
            return sb.toString();
      }

}
