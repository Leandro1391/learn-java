package datos;

//Realizara las operaciones en DML - INSER UPDATE
import static datos.Conexion.*;
import domain.Persona;
import java.sql.*;
import java.util.*;

public class PersonaDAO {

      //las sentencias lo definimos al principio de la clase
      private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM personas";
      //se usa interrogacion para sustituir los parametros respectos en los argumentos personas
      private static final String SQL_INSERT = "INSERT INTO personas(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?) ";

      private static final String SQL_UPDATE = "UPDATE personas SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?";

      private static final String SQL_DELETE = "DELETE FROM personas WHERE id_persona = ?";

      public List<Persona> seleccionar() {
            //Necesitamos crear objecto Connection para establecer la conexion a la base de datos por URL
            Connection conn = null;
            //El PreparedStatement es mas eficiente que statement -> es una interface
            PreparedStatement stmt = null;
            //Result Set es una interfaz que sirve para recibir el resultado de una consulta y obtener sus objetos
            ResultSet rs = null;
            Persona persona = null;
            List<Persona> personas = new ArrayList<>();

            try {
                  conn = getConnection();
                  stmt = conn.prepareStatement(SQL_SELECT);
                  rs = stmt.executeQuery();

                  while (rs.next()) {
                        int idPersona = rs.getInt("id_persona");
                        String nombre = rs.getString("nombre");
                        String apellido = rs.getString("apellido");
                        String email = rs.getString("email");
                        String telefono = rs.getString("telefono");

                        persona = new Persona(idPersona, nombre, apellido, email, telefono);

                        personas.add(persona);
                  }

            } catch (SQLException ex) {
                  ex.printStackTrace(System.out);
            } finally {
                  try {
                        //Conexion es una clase estatica - los argumentos son los objetos declarados mas arriba
                        close(rs);
                        close(stmt);
                        close(conn);
                  } catch (SQLException ex) {
                        ex.printStackTrace(System.out);
                  }
            }
            return personas;
      }

      public int insertar(Persona persona) {
            Connection conn = null;
            PreparedStatement stmt = null;
            int registros = 0;
            try {
                  conn = getConnection();
                  stmt = conn.prepareStatement(SQL_INSERT);
                  stmt.setString(1, persona.getNombre());
                  stmt.setString(2, persona.getApellido());
                  stmt.setString(3, persona.getEmail());
                  stmt.setString(4, persona.getTelefono());
                  //La sentencia executeUpdate actualiza la tabla de la bd y devuelve la filas afectadas se puede usar tanto para DELETE, UPDATE e INSERT
                  registros = stmt.executeUpdate();
            } catch (SQLException ex) {
                  ex.printStackTrace(System.out);
            } finally {
                  try {
                        close(stmt);
                        close(conn);
                  } catch (SQLException ex) {
                        ex.printStackTrace(System.out);
                  }
            }
            return registros;
      }

      public int actualizar(Persona persona) {
            Connection conn = null;
            PreparedStatement stmt = null;
            int registros = 0;
            try {
                  conn = getConnection();
                  stmt = conn.prepareStatement(SQL_UPDATE);
                  stmt.setString(1, persona.getNombre());
                  stmt.setString(2, persona.getApellido());
                  stmt.setString(3, persona.getEmail());
                  stmt.setString(4, persona.getTelefono());
                  stmt.setInt(5, persona.getIdPersona());
                  registros = stmt.executeUpdate();
            } catch (SQLException ex) {
                  ex.printStackTrace(System.out);
            } finally {
                  try {
                        close(stmt);
                        close(conn);
                  } catch (SQLException ex) {
                        ex.printStackTrace(System.out);
                  }
            }
            return registros;
      }
      
      public int eliminar(Persona persona) {
            Connection conn = null;
            PreparedStatement stmt = null;
            int registros = 0;
            try {
                  conn = getConnection();
                  stmt = conn.prepareStatement(SQL_DELETE);
                  stmt.setInt(1, persona.getIdPersona());
                  registros = stmt.executeUpdate();
            } catch (SQLException ex) {
                  ex.printStackTrace(System.out);
            } finally {
                  try {
                        close(stmt);
                        close(conn);
                  } catch (SQLException ex) {
                        ex.printStackTrace(System.out);
                  }
            }
            return registros;
      }
}
