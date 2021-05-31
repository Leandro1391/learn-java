package test;

import datos.UsuarioDAO;
import datos.Conexion;
import domain.Usuario;
import java.sql.Connection;
import java.sql.SQLException;

public class TestManejoUsuarios {

      public static void main(String[] args) {

            //Transacciones con Usuarios
            Connection conn = null;

            try {
                  conn = Conexion.getConnection();
                  if (conn.getAutoCommit()) {
                        conn.setAutoCommit(false);
                  }

                  UsuarioDAO usuarioTransaction = new UsuarioDAO(conn);

                  //Insert
                  Usuario insertarUsuario = new Usuario();
                  insertarUsuario.setUsuario("Paplopopulus");
                  insertarUsuario.setPassword("ueueuwisjaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

                  usuarioTransaction.insertar(insertarUsuario);

                  //Update
                  Usuario actualizarUsuario = new Usuario();
                  actualizarUsuario.setIdUsuario(7);
                  actualizarUsuario.setUsuario("Federer2");
                  actualizarUsuario.setPassword("opaieu434");

                  usuarioTransaction.actualizar(actualizarUsuario);

                  //Delete
                  Usuario eliminarUsuario = new Usuario();
                  eliminarUsuario.setIdUsuario(5);
                  
                  usuarioTransaction.eliminar(eliminarUsuario);

                  conn.commit();
                  System.out.println("Se ha realizado la confirmacion de la transaccion");

            } catch (SQLException ex) {
                  ex.printStackTrace(System.out);
                  System.out.println("Se ha revertido la transaccion");
                  try {
                        //Si falla una de las transacciones se realiza un rollback de todo
                        conn.rollback();
                  } catch (SQLException ex1) {
                        ex1.printStackTrace(System.out);
                  }
            }
      }
}
