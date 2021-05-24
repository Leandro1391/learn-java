package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;

public class AccesoDatosImpl implements IAccesoDatos {

      public AccesoDatosImpl() {
      }

      @Override
      public boolean existe(String nombreArchivo) {
            File archivo = new File(nombreArchivo);
            return (archivo.exists());
      }

      @Override
      public List<Pelicula> listar(String nombreArchivo) {
            List miLista = new ArrayList();
            if (this.existe(nombreArchivo)) {
                  File archivo = new File(nombreArchivo);
                  try {
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
                  } catch (IOException ex) {
                        ex.printStackTrace(System.out);
                  }
            }else {
                  System.out.println("No existe el archivo");
            }
            return miLista;
      }

      @Override
      public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {
            if (this.existe(nombreArchivo)) {
                  File archivo = new File(nombreArchivo);
                  try {
                        PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
                        salida.println(pelicula);
                        salida.close();
                        System.out.println("Se ha anexado la pelicula al archivo");
                  } catch (IOException e) {
                        e.printStackTrace(System.out);
                  }
            } else {
                  System.out.println("No existe el archivo");
            }
      }

      @Override
      public void crear(String nombreArchivo) {
            if (!(this.existe(nombreArchivo))) {
                  File archivo = new File(nombreArchivo);
                  try {
                        PrintWriter salida = new PrintWriter(archivo);
                        salida.close();
                        System.out.println("file successfull created");
                  } catch (Exception e) {
                        e.printStackTrace(System.out);
                  }
            } else {
                  System.out.println("El archivo ya esta creado");
            }

      }

      @Override
      public void borrar(String nombreArchivo) {
            if (this.existe(nombreArchivo)) {
                  File archivo = new File(nombreArchivo);
                  if (archivo.delete()) {
                        System.out.println("Deleted the file: " + archivo.getName());
                  } else {
                        System.out.println("Failed to delete the file.");
                  }
            } else{
                  System.out.println("No se puede eliminar porque el archivo no existe");
            }
      }

}
