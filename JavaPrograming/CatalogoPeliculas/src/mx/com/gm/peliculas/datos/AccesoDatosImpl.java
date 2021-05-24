package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.ArrayList;
import mx.com.gm.peliculas.domain.Pelicula;

public class AccesoDatosImpl implements IAccesoDatos {

      public AccesoDatosImpl() {
      }

      @Override
      public boolean existe(String nombreArchivo) {
            return (nombreArchivo != null);
      }

      @Override
      public ArrayList<Pelicula> listar(String nombre) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }

      @Override
      public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {
            File archivo = new File(nombreArchivo);
            try {
                  PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
                  salida.println(pelicula);
                  salida.close();
                  System.out.println("Se ha anexado pelicula al archivo");
            } catch (IOException e) {
                  e.printStackTrace(System.out);
            }
      }

      @Override
      public void crear(String nombreArchivo) {
            File archivo = new File(nombreArchivo);
            try {
                  PrintWriter salida = new PrintWriter(archivo);
                  salida.close();
                  System.out.println("file successfull created");
            } catch (Exception e) {
                  e.printStackTrace(System.out);
            }

      }

      @Override
      public void borrar(String nombreArchivo) {
//            this.existe(nombreArchivo)
            File archivo = new File(nombreArchivo);
            if (archivo.delete()) {
                  System.out.println("Deleted the file: " + archivo.getName());
            } else {
                  System.out.println("Failed to delete the file.");
            }
      }

}
