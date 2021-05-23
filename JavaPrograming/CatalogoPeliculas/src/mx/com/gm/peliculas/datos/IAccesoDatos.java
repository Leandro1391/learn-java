package mx.com.gm.peliculas.datos;

import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;

public interface IAccesoDatos {
      
      boolean existe(String nombreArchivo);
      
       ArrayList<Pelicula> listar(String nombre);
       
       void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar);
       
       void crear(String nombreArchivo);
       
       void borrar(String nombreArchivo);
      
}
