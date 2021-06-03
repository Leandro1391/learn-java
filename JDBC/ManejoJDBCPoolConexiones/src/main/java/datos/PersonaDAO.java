package datos;

//Realizara las operaciones en DML - INSER UPDATE
import static datos.Conexion.*;
import domain.PersonaDTO;
import java.sql.*;
import java.util.*;

public class PersonaDAO implements IPersonaDao{

      private Connection conexionTransaccional;

      //las sentencias lo definimos al principio de la clase
      private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM personas";
      //se usa interrogacion para sustituir los parametros respectos en los argumentos personas
      private static final String SQL_INSERT = "INSERT INTO personas(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?) ";
      private static final String SQL_UPDATE = "UPDATE personas SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?";
      private static final String SQL_DELETE = "DELETE FROM personas WHERE id_persona = ?";

      public PersonaDAO() {

      }

      public PersonaDAO(Connection conn) {
            this.conexionTransaccional = conn;
      }

      public List<PersonaDTO> seleccionar() {
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            PersonaDTO persona = null;
            List<PersonaDTO> personas = new ArrayList<>();

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

                        persona = new PersonaDTO(idPersona, nombre, apellido, email, telefono);

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

      public int insertar(PersonaDTO persona) throws SQLException {
            Connection conn = null;
            PreparedStatement stmt = null;
            int registros = 0;
            try {
                  conn = (this.conexionTransaccional != null) ? this.conexionTransaccional : getConnection();
                  stmt = conn.prepareStatement(SQL_INSERT);
                  stmt.setString(1, persona.getNombre());
                  stmt.setString(2, persona.getApellido());
                  stmt.setString(3, persona.getEmail());
                  stmt.setString(4, persona.getTelefono());

                  //La sentencia executeUpdate actualiza la tabla de la bd y devuelve la filas afectadas se puede usar tanto para DELETE, UPDATE e INSERT
                  System.out.println("Ejecutamos la transaccion INSERT: " + SQL_INSERT);
                  registros = stmt.executeUpdate();
                  System.out.println("Registros afectados: " + registros);
            } finally {
                  try {
                        close(stmt);
                        if (this.conexionTransaccional == null) {
                              close(conn);
                        }
                  } catch (SQLException ex) {
                        ex.printStackTrace(System.out);
                  }
            }
            return registros;
      }

      public int actualizar(PersonaDTO persona) throws SQLException {
            Connection conn = null;
            PreparedStatement stmt = null;
            int registros = 0;
            try {
                  conn = (this.conexionTransaccional != null) ? this.conexionTransaccional : getConnection();
                  stmt = conn.prepareStatement(SQL_UPDATE);
                  stmt.setString(1, persona.getNombre());
                  stmt.setString(2, persona.getApellido());
                  stmt.setString(3, persona.getEmail());
                  stmt.setString(4, persona.getTelefono());
                  stmt.setInt(5, persona.getIdPersona());

                  System.out.println("Ejecutamos la transaccion UPDATE: " + SQL_UPDATE);
                  registros = stmt.executeUpdate();
                  System.out.println("Registros afectados: " + registros);
            } finally {
                  try {
                        close(stmt);
                        if (this.conexionTransaccional == null) {
                              close(conn);
                        }
                  } catch (SQLException ex) {
                        ex.printStackTrace(System.out);
                  }
            }
            return registros;
      }

      public int eliminar(PersonaDTO persona) {
            Connection conn = null;
            PreparedStatement stmt = null;
            int registros = 0;
            try {
                  conn = (this.conexionTransaccional != null) ? this.conexionTransaccional : getConnection();
                  stmt = conn.prepareStatement(SQL_DELETE);
                  stmt.setInt(1, persona.getIdPersona());
                  System.out.println("Ejecutamos la transaccion DELETE: " + SQL_DELETE);
                  registros = stmt.executeUpdate();
                  System.out.println("Registros afectados: " + registros);
            } catch (SQLException ex) {
                  ex.printStackTrace(System.out);
            } finally {
                  try {
                        close(stmt);
                        if (this.conexionTransaccional == null) {
                              close(conn);
                        }
                  } catch (SQLException ex) {
                        ex.printStackTrace(System.out);
                  }
            }
            return registros;
      }
}
