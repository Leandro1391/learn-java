package mx.com.gm.peliculas.negocio;

import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.datos.IAccesoDatos;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas{
      
      public IAccesoDatos datos;

      public CatalogoPeliculasImpl() {
            this.datos = new AccesoDatosImpl();
      }

      @Override
      public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
            
      }

      @Override
      public void listarPeliculas(String nombreArchivo) {
            
      }

      @Override
      public void buscarPelicula(String nombreArchivo, String buscar) {
            
      }

      @Override
      public void iniciarArchivo(String nombreArchivo) {
            //opcion 1
            this.datos.crear(nombreArchivo);
      }
      
}
