package mx.com.gm.peliculas.negocio;

import java.util.*;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.datos.IAccesoDatos;
import mx.com.gm.peliculas.domain.Pelicula;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas{
      
      public IAccesoDatos datos;

      public CatalogoPeliculasImpl() {
            this.datos = new AccesoDatosImpl();
      }

      @Override
      public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
            Pelicula unaPelicula = new Pelicula(nombrePelicula);
            
            //necesit la instancia de la clase pelicula
            this.datos.escribir(unaPelicula, nombreArchivo, true);
      }

      @Override
      public void listarPeliculas(String nombreArchivo) {
            List<Pelicula> miLista = new ArrayList<>();
            miLista = this.datos.listar(nombreArchivo);
            miLista.forEach(elemento ->System.out.println(elemento.getNombre()));
            
      }

      @Override
      public void buscarPelicula(String nombreArchivo, String buscar) {
            
      }

      @Override
      public void iniciarArchivo(String nombreArchivo) {
            this.datos.crear(nombreArchivo);
      }
      
}
