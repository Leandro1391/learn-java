package mx.com.gm.peliculas.negocio;

import java.util.*;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.datos.IAccesoDatos;
import mx.com.gm.peliculas.domain.Pelicula;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

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
            miLista.forEach(elemento -> System.out.println(elemento.getNombre()));

      }

      @Override
      public void buscarPelicula(String nombreArchivo, String buscar) {
            int flag = 0;
            List<Pelicula> miLista = new ArrayList<>();
            miLista = this.datos.listar(nombreArchivo);

            for (Pelicula pelicula : miLista) {
                  if (pelicula.getNombre().equals(buscar)) {
                        System.out.println("Pelicula encontrada en el archivo");
                        flag = 1;
                        break;
                  }
            }
            
            if (flag == 0)
                  System.out.println("No se encontro la pelicula en el catalogo");
      }

      @Override
      public void iniciarArchivo(String nombreArchivo) {
            this.datos.crear(nombreArchivo);
      }

}
