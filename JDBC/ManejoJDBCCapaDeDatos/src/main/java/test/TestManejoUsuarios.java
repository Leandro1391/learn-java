package test;

import datos.UsuarioDAO;
import datos.Conexion;
import datos.IUsuarioDao;
import domain.UsuarioDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestManejoUsuarios {

      public static void main(String[] args) {

            //Transacciones con Usuarios
            Connection conn = null;

            try {
                  conn = Conexion.getConnection();
                  if (conn.getAutoCommit()) {
                        conn.setAutoCommit(false);
                  }

//                  UsuarioDAO usuarioTransactionon = new UsuarioDAO(conn);
                  
                  IUsuarioDao usuarioInterface = new UsuarioDAO(conn);
                  
                  List<UsuarioDTO> usuarios;
                  
                  usuarios = usuarioInterface.seleccionar();
                  
                  usuarios.forEach(element -> System.out.println("Usuario: " + element));
                          
/*
                  //Insert
                  UsuarioDTO insertarUsuario = new UsuarioDTO();
                  insertarUsuario.setUsuario("Paplopopulus");
                  insertarUsuario.setPassword("ueueuwisjaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

                  usuarioTransaction.insertar(insertarUsuario);

                  //Update
                  UsuarioDTO actualizarUsuario = new UsuarioDTO();
                  actualizarUsuario.setIdUsuario(7);
                  actualizarUsuario.setUsuario("Federer2");
                  actualizarUsuario.setPassword("opaieu434");

                  usuarioTransaction.actualizar(actualizarUsuario);

                  //Delete
                  UsuarioDTO eliminarUsuario = new UsuarioDTO();
                  eliminarUsuario.setIdUsuario(5);
                  
                  usuarioTransaction.eliminar(eliminarUsuario);

                  conn.commit();
                  System.out.println("Se ha realizado la confirmacion de la transaccion");
*/

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
