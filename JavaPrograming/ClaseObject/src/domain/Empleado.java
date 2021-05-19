package domain;

import java.util.Objects;

public class Empleado {
      protected String nombre;
      protected double sueldo;
      
      public Empleado(String nombre, double sueldo) {
            this.nombre = nombre;
            this.sueldo = sueldo;
      }
      
      public String obtenerDetalles() {
            return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo;
      }

      public String getNombre() {
            return this.nombre;
      }

      public void setNombre(String nombre) {
            this.nombre = nombre;
      }

      public double getSueldo() {
            return this.sueldo;
      }

            //Hashcode: Generar un valor entero unico, lo más unico posible, relacionado a los atributos de este objeto
      @Override
      public int hashCode() {
            int hash = 7;
            hash = 31 * hash + Objects.hashCode(this.nombre);
            hash = 31 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
            return hash;
      }
      
      //La referencia this
      @Override
      public boolean equals(Object obj) {
            //Tienen la misma referencia en memoria this y obj?
            if (this == obj) {
                  return true;
            }
            //el objeto es igual a null?
            if (obj == null) {
                  return false;
            }
            //getCLass() tipo de la clase del objeto que estamos trabajando, el tipo de la clase o de los objetos son diferentes?
            if (getClass() != obj.getClass()) {
                  return false;
            }
            // Compara los atirbutos
            final Empleado other = (Empleado) obj;
            if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
                  return false;
            }
            //Compara contenidos porque son Strings la variable nombre
            if (!Objects.equals(this.nombre, other.nombre)) {
                  return false;
            }
            // Si el contenido de las variables son iguales devuelve true
            return true;
      }

      public void setSueldo(double sueldo) {
            this.sueldo = sueldo;
      }

      @Override
      public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Empleado{nombre=").append(nombre);
            sb.append(", sueldo=").append(sueldo);
            sb.append('}');
            return sb.toString();
      }
      
      
      
      
}
