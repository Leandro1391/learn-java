package mx.com.gm.peliculas.negocio;

//en esta capa el usuario va a interactuar con el negocio de la aplicacion
public interface ICatalogoPeliculas {
      
      String NOMBRE_RECURSO = "peliculas.txt";

      void agregarPelicula(String nombrePelicula);

      void listarPeliculas();

      void buscarPelicula(String buscar);

      void iniciarArchivo();
      
      void borrarArchivo();

}
