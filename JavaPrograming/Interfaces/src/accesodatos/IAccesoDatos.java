package accesodatos;

//Las interfaces no se declaran constructores

public interface IAccesoDatos {
      //Los atributos definidos en una interfaz van a ser constantes
      int MAX_REGISTRO = 10; //obligatoriamente tiene que  tener asignado un valor
      
      //todos los metodos son publicos y abstractos en interfaces
      void insertar();
      
      void listar();
      
      void  actualizar();
      
      void eliminar();
      
}
