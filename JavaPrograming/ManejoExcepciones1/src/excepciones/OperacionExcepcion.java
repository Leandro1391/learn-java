package excepciones;

//public class OperacionExcepcion extends Exception {
public class OperacionExcepcion extends RuntimeException {

      //es check y el mensaje se propaga a la clase padre con super()
      public OperacionExcepcion(String mensaje) {
            super(mensaje);
      }

}
