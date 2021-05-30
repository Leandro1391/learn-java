package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.Connection;
import java.sql.*;

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
                  PersonaDAO personaDaoTransaction = new PersonaDAO(conexion);

                  //UPDATE
                  Persona changePerson = new Persona();
                  changePerson.setIdPersona(12);
                  changePerson.setNombre("Frederich");
                  changePerson.setApellido("Von Paulus");
                  changePerson.setEmail("fpaulus@mail.com");
                  changePerson.setTelefono("22564879653");

                  personaDaoTransaction.actualizar(changePerson);

                  //INSERT
                  Persona newPerson = new Persona();
                  newPerson.setNombre("Gueorgui");
                  newPerson.setApellido("Zhukov");

                  personaDaoTransaction.insertar(newPerson);

                  //DELETE
//                  Persona deletePerson = new Persona();
//                  deletePerson.setIdPersona(14);
//
//                  personaDaoTransaction.eliminar(deletePerson);
                  //Aceptamos los cambios en la tabla con el commit
                  conexion.commit();
                  System.out.println("Se ha echo el commit de la transaccion");

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
