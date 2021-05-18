package domain;

public class Gerente extends Empleado {

      private String departamento;

      public Gerente(String nombre, double sueldo, String departamentos) {
            super(nombre, sueldo);
            this.departamento = departamentos;
      }
      
      //Esta notacion sirve para indicar al compilador que se esta sobreescribiendo el metodo en la clase padre
      @Override
      public String obtenerDetalles() {
            return super.obtenerDetalles() + ", departamento: " + this.departamento;
      }
}
