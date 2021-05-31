package datos;

import static datos.Conexion.*;
import domain.Usuario;
import java.sql.*;
import java.util.*;

public class UsuarioDAO {

      private Connection conexionTransaction;

      private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuarios";
      private static final String SQL_INSERT = "INSERT INTO usuarios(usuario, password) VALUES(?, ?) ";
      private static final String SQL_UPDATE = "UPDATE usuarios SET usuario = ?, password = ? WHERE id_usuario = ?";
      private static final String SQL_DELETE = "DELETE FROM usuarios WHERE id_usuario = ?";
      private static final String SQL_TRUNCATE = "TRUNCATE TABLE usuarios";

      public UsuarioDAO() {
      }

      public UsuarioDAO(Connection conn) {
            this.conexionTransaction = conn;
      }

      public List<Usuario> seleccionar() {
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            Usuario unUsuario = null;
            List<Usuario> usuarios = new ArrayList<>();

            try {
                  conn = getConnection();
                  stmt = conn.prepareStatement(SQL_SELECT);
                  rs = stmt.executeQuery();

                  while (rs.next()) {
                        int idUsuario = rs.getInt("id_usuario");
                        String usuario = rs.getString("usuario");
                        String password = rs.getString("password");

                        unUsuario = new Usuario(idUsuario, usuario, password);

                        usuarios.add(unUsuario);
                  }

            } catch (SQLException ex) {
                  ex.printStackTrace(System.out);
            } finally {
                  try {
                        close(conn);
                        close(stmt);
                        close(rs);
                  } catch (SQLException ex) {
                        ex.printStackTrace(System.out);
                  }
            }
            return usuarios;
      }

      public int insertar(Usuario unUsuario) throws SQLException {
            Connection conn = null;
            PreparedStatement stmt = null;
            int registros = 0;

            try {
                  conn = (this.conexionTransaction != null) ? this.conexionTransaction : getConnection();
                  stmt = conn.prepareStatement(SQL_INSERT);
                  stmt.setString(1, unUsuario.getUsuario());
                  stmt.setString(2, unUsuario.getPassword());
                  registros = stmt.executeUpdate();
           } finally {
                  try {
                        close(stmt);
                        if (this.conexionTransaction == null) {
                              close(conn);
                        }
                  } catch (SQLException ex) {
                        ex.printStackTrace(System.out);
                  }
            }
            return registros;
      }

      public int actualizar(Usuario unUsuario) throws SQLException {
            Connection conn = null;
            PreparedStatement stmt = null;
            int registros = 0;
            try {
                  conn = (this.conexionTransaction != null) ? this.conexionTransaction : getConnection();
                  stmt = conn.prepareStatement(SQL_UPDATE);
                  stmt.setString(1, unUsuario.getUsuario());
                  stmt.setString(2, unUsuario.getPassword());
                  stmt.setInt(3, unUsuario.getIdUsuario());
                  registros = stmt.executeUpdate();
            } finally {
                  try {
                        close(stmt);
                        if (this.conexionTransaction == null) {
                              close(conn);
                        }
                  } catch (SQLException ex) {
                        ex.printStackTrace(System.out);
                  }
            }
            return registros;
      }

      public int eliminar(Usuario unUsuario) throws SQLException {
            Connection conn = null;
            PreparedStatement stmt = null;
            int registros = 0;
            try {
                  conn = (this.conexionTransaction != null) ? this.conexionTransaction : getConnection();
                  stmt = conn.prepareStatement(SQL_DELETE);
                  stmt.setInt(1, unUsuario.getIdUsuario());
                  stmt.executeUpdate();
            } finally {
                  try {
                        close(stmt);
                        if (this.conexionTransaction == null) {
                              close(conn);
                        }
                  } catch (SQLException ex) {
                        ex.printStackTrace(System.out);
                  }
            }
            return registros;
      }

      public int truncate() {
            Connection conn = null;
            PreparedStatement stmt = null;
            int registros = 0;
            try {
                  conn = (this.conexionTransaction != null) ? this.conexionTransaction : getConnection();
                  stmt = conn.prepareStatement(SQL_TRUNCATE);
                  registros = stmt.executeUpdate();
            } catch (SQLException ex) {
                  ex.printStackTrace(System.out);
            } finally {
                  try {
                        close(stmt);
                        if (this.conexionTransaction == null) {
                              close(conn);
                        }
                  } catch (SQLException ex) {
                        ex.printStackTrace(System.out);
                  }
            }
            return registros;
      }

}
