package cpjlaboratoriofinal;

import java.io.IOException;
import java.util.Scanner;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;
import mx.com.gm.peliculas.negocio.ICatalogoPeliculas;

public class CPJLaboratorioFinal {

      public static void main(String[] args) throws IOException {

            var console = new Scanner(System.in);

            int opcion = -1;
//            String nombreArchivo = "peliculas.txt";
            ICatalogoPeliculas catalogoPeliculas = new CatalogoPeliculasImpl();

            do {
                  System.out.println("Elige una opcion: ");
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
                  } catch (Exception e) {
                        e.printStackTrace(System.out);
                  }

                  switch (opcion) {
                        case 1:
                              catalogoPeliculas.iniciarArchivo();
                              break;
                        case 2:
                              System.out.println("Introduce el nombre de una pelicula a agregar:");
                              var nombrePelicula = console.nextLine();
                              catalogoPeliculas.agregarPelicula(nombrePelicula);
                              break;
                        case 3:
                              catalogoPeliculas.listarPeliculas();
                              break;
                        case 4:
                              System.out.println("Introduce el nombre de una pelicula para buscar en el catalogo:");
                              var searchName = console.nextLine();
                              catalogoPeliculas.buscarPelicula(searchName);
                              break;
                        case 5:
                                    catalogoPeliculas.borrarArchivo();
                              break;
                        case 0:
                              System.out.println("Hasta pronto");
                              break;
                        default:
                              System.out.println("Opcion incorrectar vuelve a intentar");
                              break;
                  }

                  System.out.println(" ");
            } while (opcion != 0);
      }

}


/*Bajo acoplamiento: significa que vamos a utilizar la menor cantidad de relaciones  entre las clases, por ejemplo la capa de presentacion no se
comunica directamente con la capa de datos, sino, solamente con la capa del negocio, con eso logramos menor relacion entre las clases para lograr bajo acoplamiento

Alta cohesion: Significa que cada clase se encarga de realizar solamente sus tareas y así cada capa se encarga de cumplir su funcion particular
capa de datos, para comunicarse con el archivo, la capa de negocio de realizar las operaciones de nuestra aplicacion y finalmente la capa de presentacion
se encarga de mostrar la informacion al usuario y tambien de capturar la info del usuario.
*/