package accesodatos;

//Con implements estamos obligando a esta clase a implementar el comportamiento de los metodos definidos en la interfaz
//Si no lo implementamos en esta clase le decimos que es abstracta pero deberiamos crear una clase hija para definir el comportamiento de los metodos
public class ImplementacionMySql implements IAccesoDatos{

      @Override
      public void insertar() {
            System.out.println("Insertar desde Mysql");
      }

      @Override
      public void listar() {
            System.out.println("Listar desde Mysql");
      }

      @Override
      public void actualizar() {
            System.out.println("Actualizar desde Mysql");
      }

      @Override
      public void eliminar() {
            System.out.println("Eliminar desde Mysql");
      }
      
      
}
