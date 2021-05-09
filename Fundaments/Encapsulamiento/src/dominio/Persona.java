package dominio;

public class Persona {
      
      //la mejor forma es usar private o protected para visibilidad de atributos o metodos, segundo: si el atributo o clase no tiene declarado el modificador de acceso seraá default o package y soalemte
      //puede acceder se si está en el mismo nombre paquete declarado
//      String apellido
      private String nombre;
      private double sueldo;
      private boolean eliminado;
      
      public Persona(String nombre, double sueldo, boolean eliminado) {
            this.nombre = nombre;
            this.sueldo = sueldo;
            this.eliminado = eliminado;
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
      
      public void setSueldo(double sueldo) {
            this.sueldo = sueldo;
      }
      
      //In boolean we must use isEliminaod not getEliminado()
      public boolean isEliminado() {
            return this.eliminado;
      }
      
      public void setEliminado(boolean eliminado) {
            this.eliminado = eliminado;
      }
}
