package mx.com.gm.peliculas.negocio;

import java.util.*;
import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.excepciones.*;
import mx.com.gm.peliculas.domain.Pelicula;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

      private final IAccesoDatos datos;

      public CatalogoPeliculasImpl() {
            this.datos = new AccesoDatosImpl();
      }

      @Override
      public void agregarPelicula(String nombrePelicula) {
            Pelicula unaPelicula = new Pelicula(nombrePelicula);
            boolean anexar = false;
            try {
                  anexar = datos.existe(NOMBRE_RECURSO);
                  this.datos.escribir(unaPelicula, NOMBRE_RECURSO, anexar);
            } catch (AccesoDatosEx ex) {
                  System.out.println("Error de acceso de datos");
                  ex.printStackTrace(System.out);
            }
      }

      @Override
      public void listarPeliculas() {
            try {
                  var miListaPeliculas = this.datos.listar(ICatalogoPeliculas.NOMBRE_RECURSO);
                  miListaPeliculas.forEach(elemento -> System.out.println(elemento.getNombre()));
            } catch (AccesoDatosEx ex) {
                  System.out.println("Error de acceso de datos");
                  ex.printStackTrace(System.out);
            }
      }

      @Override
      public void buscarPelicula(String buscar) {
            String resultado = null;
            try {
                  resultado = this.datos.buscar(ICatalogoPeliculas.NOMBRE_RECURSO, buscar);
            } catch (LecturaDatosEx ex) {
                  System.out.println("Error de acceso datos");
                  ex.printStackTrace(System.out);
            }
            System.out.println("resultado = " + resultado);
      }

      @Override
      public void iniciarArchivo() {
            try {
                  this.datos.crear(ICatalogoPeliculas.NOMBRE_RECURSO);
            } catch (AccesoDatosEx ex) {
                  ex.printStackTrace(System.out);
            }
      }

      @Override
      public void borrarArchivo() {
            try {
                  this.datos.borrar(NOMBRE_RECURSO);
            } catch (AccesoDatosEx ex) {
                  ex.printStackTrace(System.out);
            }
      }
}
