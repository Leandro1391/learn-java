package test;

import datos.Conexion;
import datos.IPersonaDao;
import datos.PersonaDAO;
import domain.PersonaDTO;
import java.sql.Connection;
import java.sql.*;
import java.util.*;

public class TestManejoPersonas {

      public static void main(String[] args) throws SQLException {

            Connection conexion = null;

            try {
                  conexion = Conexion.getConnection();
                  if (conexion.getAutoCommit()) {
                        //No queremos que se guarden los cambios en la transaccion en forma automatica, solamente cuando hagamos commit
                        conexion.setAutoCommit(false);
                  }

                  //Enviamos como argumento la variable conexion al constructor de la clase PersonaDAO para manejar nuestra transaccion
//                  PersonaDAO personaDaoTransaction = new PersonaDAO(conexion);

                  //vamos a usar la interfaz
                  //del lado izquiero es la interfaz y el laod derecho apunta a la clase que va a puntar en la referencia el objeto que va almacenar la variable perosnaDAO
                 IPersonaDao  personaDao = new PersonaDAO(conexion);
                  
                 //en este punto ya no me importa que teconologia de base de datos estoy usando al implementar la interfaz, estoy haciendo lo mas generico posible
                  List<PersonaDTO> personas = personaDao.seleccionar();
                  
                  personas.forEach(element -> System.out.println("Persona DTO: " + element));
/*
                  //UPDATE
                  PersonaDTO changePerson = new PersonaDTO();
                  changePerson.setIdPersona(12);
                  changePerson.setNombre("Frederich");
                  changePerson.setApellido("Von Paulus");
                  changePerson.setEmail("fpaulus@mail.com");
                  changePerson.setTelefono("22564879653");

                  personaDaoTransaction.actualizar(changePerson);

                  //INSERT
                  PersonaDTO newPerson = new PersonaDTO();
                  newPerson.setNombre("Gueorgui");
                  newPerson.setApellido("Zhukov");

                  personaDaoTransaction.insertar(newPerson);

                  //DELETE
//                  PersonaDTO deletePerson = new PersonaDTO();
//                  deletePerson.setIdPersona(14);
//
//                  personaDaoTransaction.eliminar(deletePerson);
                  //Aceptamos los cambios en la tabla con el commit
                  conexion.commit();
                  System.out.println("Se ha echo el commit de la transaccion");
*/
            } catch (SQLException ex) {
                  ex.printStackTrace(System.out);
                  System.out.println("Entramos al rollback");
                  try {
                        conexion.rollback();
                  }catch (SQLException ex1){
                        ex1.printStackTrace(System.out);
                  }
            }
      }
}

/*Bajo acoplamiento: separa las funcionalidad en distintas clases como por ejemplo TestMySqlJDBC que tiene contenido varias tareas y cada una tiene las relaciones minimas con cada clase
y alta cohesion ya que cada clase realiza una unica tarea.

En la clase TestMySqlJDBC
realizar una conexion a la base de datos
definir la sentencia de SQL
Iterara los resultado
cerrar las conexiones
Esto no es una buena practica centrar todo en una sola clase
 */
