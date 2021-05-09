package domain;

public class Persona {

       private int idPersona;
      private String nombre;
      private static int contadorPersonas;
      
      public Persona(String nombre) {
            this.nombre = nombre;
            // Incrementar el contador por cada objeto nuevo
            this.idPersona =  ++Persona.contadorPersonas;
            
            //Se puede realizar pero no se recomienda porque es un atributo de la clase como arriba
            //this.contadorPersonas++;
      }

      public int getIdPersona() {
            return idPersona;
      }

      public void setIdPersona(int idPersona) {
            this.idPersona = idPersona;
      }

      public String getNombre() {
            return nombre;
      }

      public void setNombre(String nombre) {
            this.nombre = nombre;
      }
      
         public static int getContadorPersonas() {
            return contadorPersonas;
      }

      public static void setContadorPersonas(int aContadorPersonas) {
            contadorPersonas = aContadorPersonas;
      }

      //Estamos modificando el comportamiento de método toString() en la clase Object
      @Override //anotacion extra al metodo que estamos definiedo, es decir, estamos sobreescribiendo al metodo toString()
      public String toString() {
            return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
      }
      
      
      
      
}
