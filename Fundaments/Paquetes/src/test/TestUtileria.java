package test;

//import mx.com.globalmentoring.Utileria;
//import mx.com.globalmentoring.*; todas las clases importa con asterisco per no se cargan en memoria
import static mx.com.globalmentoring.Utileria.imprimir;

public class TestUtileria {

      public static void main(String[] args) {
//            Utileria.imprimir("Saludos"); //Import normal -> este es el recomendado para usar
//            imprimir("goodbye") // Import static -> esta forma sería la segunda opción
            mx.com.globalmentoring.Utileria.imprimir("Hello"); //nombre completamente caliifcado -> se usa en archivos de configuracion

      }
}
