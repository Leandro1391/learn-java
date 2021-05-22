package manejoarchivos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
}
