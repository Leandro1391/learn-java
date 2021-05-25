package mx.com.gm.peliculas.datos;

import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public interface IAccesoDatos {
      
      //con throws indicamos en la firma del metodo que se debe implementar
      boolean existe(String nombreArchivo) throws AccesoDatosEx;

      List<Pelicula> listar(String nombre) throws LecturaDatosEx;

      void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

      String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

      void crear(String nombreArchivo) throws AccesoDatosEx;

      void borrar(String nombreArchivo) throws AccesoDatosEx;

}


/*Bajo acoplamiento y alta cohesion
No va haber comunicacion entre las clases CatalogoPeliculasImpl y AccesoDatosImpl, el primero se comunicara
con la otra clase a traves de la interfaz AccesoDatos

Bajo acoplamiento porque si nuestras clases trabajan directamente entre si, puede afectar nuestro codigo
pero si trabajamos con interfaces no afecta el comportamiento de los metodo es como otra capa solamente accedemos a las firmas
*/