package cpjlaboratoriofinal;

import java.io.IOException;
import java.util.Scanner;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;

public class CPJLaboratorioFinal {

      public static void main(String[] args) throws IOException {

            var console = new Scanner(System.in);

            int opcion;
            String nombreArchivo;
            var catalogoPeliculas = new CatalogoPeliculasImpl();

            do {
                  System.out.println("Elige opcion: ");
                  System.out.println("1 - Iniciar catalogo peliculas");
                  System.out.println("2 - Agregar pelicula");
                  System.out.println("3 - Listar Peliculas");
                  System.out.println("4 - Buscar Pelicula");
                  System.out.println("0 - Salir");
                  
                  try {
                        opcion = Integer.parseInt(console.nextLine());
                  } catch (NumberFormatException e) {
                        e.printStackTrace(System.out);
                        System.out.println(e.getMessage());
                  } catch(Exception e) {
                        e.printStackTrace(System.out);
                  }finally {
                        opcion = 5;
                  }
                  

                  switch (opcion) {
                        case 1:
                              break;
                        case 2:
                              break;
                        case 3:
                              break;
                        case 4:
                              break;
                        default:
                              System.out.println("Opcion incorrectar vuelve a intentar");
                              break;
                  }
                   
                  System.out.println(" ");
            } while (opcion != 0);
      }

}
