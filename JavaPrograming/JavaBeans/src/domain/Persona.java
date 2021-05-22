package domain;

import java.io.Serializable;

/*IMPORTANTE: Para que una clase se considere un JavaBean debe cumplir ciertas caracteristicas
1 - Los atributos deben ser privados
2 - Debe tener un constructor publico vacio
3 - Declarar las propiedades getter and setters de cada atributo
4 - importar e implementar la interfaz Java.io.Serializable*/

//La interfaz Serializable permite emviar nuestra clase a diferentes equipos y otras tecnologias pueden utilizar nuestras clases como
// Hibernate, Spring o Java Enterprise

public class Persona  implements Serializable{
      
      private String nombre;
      private String apellido;
      
      public Persona() {}
      
      public Persona(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
      }

      public String getNombre() {
            return this.nombre;
      }

      public void setNombre(String nombre) {
            this.nombre = nombre;
      }

      public String getApellido() {
            return this.apellido;
      }

      public void setApellido(String apellido) {
            this.apellido = apellido;
      }
      
      //es opcional agregar toString, hasCode y equals

      @Override
      public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Persona{nombre=").append(nombre);
            sb.append(", apellido=").append(apellido);
            sb.append('}');
            return sb.toString();
      }
      
      
      
}
