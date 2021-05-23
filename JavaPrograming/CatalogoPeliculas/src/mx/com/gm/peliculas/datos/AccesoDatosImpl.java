package mx.com.gm.peliculas.datos;

import java.util.ArrayList;
import mx.com.gm.peliculas.domain.Pelicula;

public class AccesoDatosImpl implements IAccesoDatos{

      public AccesoDatosImpl() {
      }
      
      @Override
      public boolean existe(String nombreArchivo) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }

      @Override
      public ArrayList<Pelicula> listar(String nombre) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }

      @Override
      public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }

      @Override
      public void crear(String nombreArchivo) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }

      @Override
      public void borrar(String nombreArchivo) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }
      
}
