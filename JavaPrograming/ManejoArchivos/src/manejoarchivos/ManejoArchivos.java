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

      public static void anexarArchivo(String nombreArchivo, String contenido) {
            File archivo = new File(nombreArchivo);
            try {
                  PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
                  salida.println(contenido);
                  salida.close();
                  System.out.println("Se ha anexado informaicon el archivo");
            } catch (IOException e) {
                  e.printStackTrace(System.out);
            }
      }

      public static void leerArchivo(String nombreArchivo) {
            var archivo = new File(nombreArchivo);
            try {
                  var entrada = new BufferedReader(new FileReader(archivo));
                  var lectura = entrada.readLine();
                  while(lectura != null) {
                        System.out.println("lectura = " + lectura);
                        lectura = entrada.readLine();
                  }
                  entrada.close();
            } catch (FileNotFoundException ex) {
                  ex.printStackTrace(System.out);
            } catch (IOException ex) {
                  ex.printStackTrace(System.out);
            }
      }

}
