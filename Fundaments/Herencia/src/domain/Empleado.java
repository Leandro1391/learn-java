package domain;

//Solamente puede haber una jerarquía de clases simple
public class Empleado extends Persona {

      //Si no vamos a tener mas clases hijas o derivadas se deben declarar con un acceso privado
      private int idEmpleado;
      private Double sueldo;
      private static int contadorEmpleado;
      
      public Empleado() {
            //super(); // hay una llamada implicita a la clase padre persona
            this.idEmpleado = ++Empleado.contadorEmpleado;
      }

      public Empleado(String nombre, Double sueldo) {
//            super(nombre); No puede estar super() o this() en el un consutrcutor solamente puede haber uno
            this(); // con this() llamo al constructor Empleado() o algún otro constructor de la misma clase dependiendo de la cnatidad e argumentos definidos;
            this.nombre = nombre; // esta es una forma para setear el valor sin super
//            this.idEmpleado = ++Empleado.contadorEmpleado;
            this.sueldo = sueldo;
      }

      public Empleado(String nombre, char genero, int edad, String direccion, Double sueldo) {
            super(nombre, genero, edad, direccion);
            this.idEmpleado = ++Empleado.contadorEmpleado;
            this.sueldo = sueldo;
      }

      public int getIdEmpleado() {
            return this.idEmpleado;
      }

      public Double getSueldo() {
            return this.sueldo;
      }

      public void setSueldo(Double sueldo) {
            this.sueldo = sueldo;
      }

      //Estamos sobreescribiendo el metodo toString de la clase object o d ela clase padre
      //Los objetos de tipo string son inmutables, es decir, cuando ya tengamos un valor ya no se pueden modificar
//      @Override
//      public String toString() {
//            return "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
//      }
      
      //Con Stringbuilder es mas eficiente porque podemos modificar los valores internamente
      // Cuando estamos creando un objeto de la clase empleado, tenemos informacion tanto de la clase hija sino también de la clase padre
      //ya que en memoria es un solo objeto, cuando creamos una clase hija automaticamente tenemos todas las caraterisitcas heredades de la clase padre
      @Override
      public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
            sb.append(", sueldo=").append(this.sueldo);
//            sb.append(", nombre=").append(this.nombre);
//            sb.append(", nombre=").append(this.getNombre());
            sb.append(", ").append(super.toString());
            sb.append('}');
            return sb.toString();
      }

}
