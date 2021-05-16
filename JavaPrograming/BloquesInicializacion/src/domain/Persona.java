package domain;

/*
Bloques de Inicializacion: Inicializan variables antes de invocar el contstructor,
Existen dos tipos: Bloques de inicializacion estatico y no estaticos
*/

public class Persona {

      private final int idPersona;
      private static int contadorPersonas;

      static {
            //Aquí se va ejecutar una sola vez cuando se cargue en memoria la clase Persona
            System.out.println("Ejecucion bloque estatico");
            ++Persona.contadorPersonas;
            //no se puede inicializar una variable no estático en un contexto estatico
            //idPersona = 10;
      }

      {
            System.out.println("Ejecucion bloque NO estatico o contexto dinamico");
            //Se va a ejecutar cada vez que creemos un objeto de nuestra clase
            this.idPersona = Persona.contadorPersonas++;
      }
      
      public Persona() {
            System.out.println("Ejecucion del constructor");
      }

      public int getIdPersona() {
            return this.idPersona;
      }

      @Override
      public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Persona{idPersona=").append(idPersona);
            sb.append(" PersonaReferenceMemory=").append(super.toString());
            sb.append('}');
            return sb.toString();
      }
      
      

}
