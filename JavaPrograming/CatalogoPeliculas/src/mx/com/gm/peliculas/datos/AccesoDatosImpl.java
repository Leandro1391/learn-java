package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public class AccesoDatosImpl implements IAccesoDatos {

      public AccesoDatosImpl() {
      }

      //throws son las posibles excepciones que pueden lanzar nuestros metodos
      @Override
      public boolean existe(String nombreArchivo) {
            File archivo = new File(nombreArchivo);
            return (archivo.exists());
      }

      @Override
      public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
            List<Pelicula> miLista = new ArrayList<>();
            try {
                  File archivo = new File(nombreArchivo);
                  var entrada = new BufferedReader(new FileReader(archivo));
                  var lectura = entrada.readLine();
                  while (lectura != null) {
                        Pelicula unaPeli = new Pelicula();
                        unaPeli.setNombre(lectura);
                        miLista.add(unaPeli);
                        lectura = entrada.readLine();
                  }
                  entrada.close();
            } catch (FileNotFoundException ex) {
                  ex.printStackTrace(System.out);
                  //Abajo estamos propagando una excepcion nuestra para que el usuairo entienda mejor que esta pasando en la aplicacion
                  throw new LecturaDatosEx("Excepcion al listar peliculas: " + ex.getMessage());
            } catch (IOException ex) {
                  ex.printStackTrace(System.out);
            }
            return miLista;
      }

      @Override
      public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
            try {
                  File archivo = new File(nombreArchivo);
                  PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
                  salida.println(pelicula.toString());
                  salida.close();
                  System.out.println("Se ha anexado la pelicula al archivo: " + pelicula);
            } catch (IOException ex) {
                  ex.printStackTrace(System.out);
                  throw new EscrituraDatosEx("Excepcion al escribir peliculas: " + ex.getMessage());
            }
      }

      @Override
      public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
            File archivo = new File(nombreArchivo);
            String resultado = null;
            try {
                  var entrada = new BufferedReader(new FileReader(archivo));
                  String linea = null;
                  linea = entrada.readLine();
                  var indice = 1;
                  while (linea != null) {
                        if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                              resultado = "Pelicula " + linea + "encontrada en el indice " + indice;
                              break;
                        }
                        indice++;
                        linea = entrada.readLine();
                  }
                  entrada.close();
            } catch (FileNotFoundException ex) {
                  ex.printStackTrace(System.out);
                  throw new LecturaDatosEx("Excepcion al listar peliculas: " + ex.getMessage());
            } catch (IOException ex) {
                  ex.printStackTrace(System.out);
                  throw new LecturaDatosEx("Excepcion al listar peliculas: " + ex.getMessage());
            }
            return resultado;
      }

      @Override
      public void crear(String nombreArchivo) throws AccesoDatosEx {
            File archivo = new File(nombreArchivo);
            try {
                  PrintWriter salida = new PrintWriter(archivo);
                  salida.close();
                  System.out.println("file successfull created");
            } catch (FileNotFoundException e) {
                  e.printStackTrace(System.out);
                  throw new AccesoDatosEx("Excepcion al crear arhivo: " + e.getMessage());
            }
      }

      @Override
      public void borrar(String nombreArchivo) {
            File archivo = new File(nombreArchivo);
            if (archivo.delete()) {
                  System.out.println("Deleted the file: " + archivo.getName());
            } else {
                  System.out.println("Failed to delete the file.");
            }
      }

}
