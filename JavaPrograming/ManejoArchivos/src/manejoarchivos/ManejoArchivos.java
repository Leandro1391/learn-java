package manejoarchivos;

import java.io.*;

/*
Crear archivo
Guardar informacion
Eliminar informacion
Eliminar por completo
 */
public class ManejoArchivos {

      public static void crearArchivo(String nombreArchivo) {
            //Se crea un objeto file en memoria
            File archivo = new File(nombreArchivo);
            try {
                  //Para guardar el archivo en el disco duro hay que usar PrintWriter
                  PrintWriter salida = new PrintWriter(archivo);
                  salida.close();
                  System.out.println("Se ha creado el archivo");
            } catch (FileNotFoundException ex) {
                  ex.printStackTrace(System.out);
            }
      }
      
      public static void escribirArchivo(String nombreArchivo, String contenido) {
            File archivo = new File(nombreArchivo);
            try {
                  PrintWriter salida = new PrintWriter(archivo);
                  salida.println(contenido);
                  salida.close();
                  System.out.println("Se ha escrito el archivo");
            } catch (Exception e) {
                  e.printStackTrace(System.out);
            }
      }
      
}
