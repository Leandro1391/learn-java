package cpjlaboratoriofinal;

import java.io.IOException;
import java.util.Scanner;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;

public class CPJLaboratorioFinal {

      public static void main(String[] args) throws IOException {

            var console = new Scanner(System.in);

            int opcion = 0;
            String nombreArchivo = "peliculas.txt";
            CatalogoPeliculasImpl catalogoPeliculas;

            do {
                  System.out.println("Elige opcion: ");
                  System.out.println("1 - Iniciar catalogo peliculas");
                  System.out.println("2 - Agregar pelicula");
                  System.out.println("3 - Listar Peliculas");
                  System.out.println("4 - Buscar Pelicula");
                  System.out.println("5 - Eliminar Pelicula");
                  System.out.println("0 - Salir");
                  
                  try {
                        opcion = Integer.parseInt(console.nextLine());
                  } catch (NumberFormatException e) {
                        e.printStackTrace(System.out);
                        System.out.println(e.getMessage());
                        opcion = -1;
                  } catch(Exception e) {
                        e.printStackTrace(System.out);
                  }
                  

                  switch (opcion) {
                        case 1:
                              catalogoPeliculas = new CatalogoPeliculasImpl();
                              catalogoPeliculas.iniciarArchivo(nombreArchivo);
                              break;
                        case 2:
                              //la instancia se hara una sola vez en la opcion 1
                              catalogoPeliculas = new CatalogoPeliculasImpl();
                              System.out.println("Introduce el nombre de una pelicula a agregar:");
                              var nombre = console.nextLine();
                              catalogoPeliculas.agregarPelicula(nombre, nombreArchivo);
                              break;
                        case 3:
                              catalogoPeliculas = new CatalogoPeliculasImpl();
//                              System.out.println("Lista de peliculas");
                              catalogoPeliculas.listarPeliculas(nombreArchivo);
                              break;
                        case 4:
                              
                              break;
                        case 5:
                              
                        default:
                              System.out.println("Opcion incorrectar vuelve a intentar");
                              break;
                  }
                   
                  System.out.println(" ");
            } while (opcion != 0);
      }

}
