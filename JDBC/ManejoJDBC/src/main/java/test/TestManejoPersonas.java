package test;

import datos.PersonaDAO;
import datos.UsuarioDAO;
import domain.Persona;
import domain.Usuario;
import java.util.*;

public class TestManejoPersonas {

      public static void main(String[] args) {
            
            /*
            //En realidad en la siguiente linea conviene usar una interfaz - se vera mas adelante con capa de datos
            PersonaDAO personaDao = new PersonaDAO();

            //Insertando un nuevo objeto de tipo Persona
            Persona personaNueva = new Persona("Charles", "Genova", "cgenova@mail.com", "48563215");
            personaDao.insertar(personaNueva);
            
            //Actualizamos un registr de la base de datos
            Persona personaUpdate = new Persona(10, "Eddie", "Jack", "ejack@mail.com", "1588749");
            personaDao.actualizar(personaUpdate);
            
            //Eliminamos el ultimo registro insertado en la base de datos
            Persona personaDelete = new Persona(13);
            personaDao.eliminar(personaDelete);

            List<Persona> personas = personaDao.seleccionar();
            personas.forEach(persona -> System.out.println("persona = " + persona));
            */
            
            //Usuario test
            UsuarioDAO usuarioDao = new UsuarioDAO();
            
            Usuario usuarioNuevo = new Usuario("Charles", "3214");
            usuarioDao.insertar(usuarioNuevo);
            
            Usuario usuarioNuevo1 = new Usuario("Dimitri", "8796");
            usuarioDao.insertar(usuarioNuevo1);
            
            Usuario actualizarUsuario = new Usuario(1, "Paulin", "222222");
            usuarioDao.actualizar(actualizarUsuario);

//            Usuario eliminarUsuario = new Usuario(1);
//            usuarioDao.eliminar(eliminarUsuario);

//            usuarioDao.truncate();
            
            List<Usuario> listaUsuarios = usuarioDao.seleccionar();
            listaUsuarios.forEach(usuario -> System.out.println("usuario = " + usuario));
            
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
