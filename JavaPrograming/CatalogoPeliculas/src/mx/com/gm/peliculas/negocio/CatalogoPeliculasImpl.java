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
                  if (this.datos.existe(NOMBRE_RECURSO)) {
                        anexar = datos.existe(NOMBRE_RECURSO);
                        this.datos.escribir(unaPelicula, NOMBRE_RECURSO, anexar);
                  } else {
                        System.out.println("No se encontro el archivo");
                  }
            } catch (AccesoDatosEx ex) {
                  System.out.println("Error de acceso de datos");
                  ex.printStackTrace(System.out);
            }
      }

      @Override
      public void listarPeliculas() {
            try {
                  if (this.datos.existe(NOMBRE_RECURSO)) {
                        var miListaPeliculas = this.datos.listar(ICatalogoPeliculas.NOMBRE_RECURSO);
                        miListaPeliculas.forEach(elemento -> System.out.println(elemento.getNombre()));
                  } else {
                        System.out.println("No se encontro el archivo");
                  }
            } catch (AccesoDatosEx ex) {
                  System.out.println("Error de acceso de datos");
                  ex.printStackTrace(System.out);
            }
      }

      @Override
      public void buscarPelicula(String buscar) {
            String resultado = null;
            try {
                  if (this.datos.existe(NOMBRE_RECURSO)) {
                        resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
                  } else {
                        System.out.println("No se encontro el archivo");
                  }
            } catch (AccesoDatosEx ex) {
                  System.out.println("Error de acceso datos");
                  ex.printStackTrace(System.out);
            }
            System.out.println("resultado = " + resultado);
      }

      @Override
      public void iniciarArchivo() {
            try {
                  if (!(this.datos.existe(NOMBRE_RECURSO))) {
                        this.datos.crear(NOMBRE_RECURSO);
                  } else {
                        System.out.println("El archivo ya existe en el sistema");
                  }
            } catch (AccesoDatosEx ex) {
                  System.out.println("Error de acceso datos");
                  ex.printStackTrace(System.out);
            }
      }

      @Override
      public void borrarArchivo() {
            try {
                  if (this.datos.existe(NOMBRE_RECURSO)) {
                        this.datos.borrar(NOMBRE_RECURSO);
                  } else {
                        System.out.println("No existe el archivo o ya se ha eliminado");
                  }
            } catch (AccesoDatosEx ex) {
                  ex.printStackTrace(System.out);
            }
      }
}
