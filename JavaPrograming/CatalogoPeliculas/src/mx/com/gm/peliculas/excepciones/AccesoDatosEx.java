package mx.com.gm.peliculas.excepciones;

//Con exception nos va a oblogar declara try catch
public class AccesoDatosEx extends Exception {

      public AccesoDatosEx(String mensaje) {
            super(mensaje);
      }
}
