package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.*;

public class TestManejoUsuarios {

      public static void main(String[] args) {

            //Usuario test
            UsuarioDAO usuarioDao = new UsuarioDAO();

            Usuario usuarioNuevo = new Usuario("Charles", "3214");
            usuarioDao.insertar(usuarioNuevo);

            Usuario usuarioNuevo1 = new Usuario("Dimitri", "8796");
            usuarioDao.insertar(usuarioNuevo1);

            Usuario actualizarUsuario = new Usuario(1, "Vasili", "222222");
            usuarioDao.actualizar(actualizarUsuario);

            Usuario eliminarUsuario = new Usuario(3);
            usuarioDao.eliminar(eliminarUsuario);

//            usuarioDao.truncate();

            List<Usuario> listaUsuarios = usuarioDao.seleccionar();
            listaUsuarios.forEach(usuario -> System.out.println("usuario = " + usuario));

      }

}
