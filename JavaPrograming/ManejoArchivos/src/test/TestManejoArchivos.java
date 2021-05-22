package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {
      public static void main(String[] args) {
            var nombreArchivo = "prueba.txt";
//             crearArchivo(nombreArchivo);
            
//            escribirArchivo(nombreArchivo, "Hello from Java");
            anexarArchivo(nombreArchivo, "Hello from Java");
            anexarArchivo(nombreArchivo, "Goodbye");
      }
}
