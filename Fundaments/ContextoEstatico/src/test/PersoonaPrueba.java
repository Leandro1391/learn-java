package test;

import domain.Persona;

public class PersoonaPrueba {

      public int contador;

      //el main es un  metodo estatico  (de clase) porque el compilador necesita primero cargar la clase en la memoria, con main
      // estamos diciendo que ejecute primeor este metodo
      public static void main(String[] args) {
            var persona1 = new Persona("Leandro");
//            System.out.println("persona1 = " + persona1);

            Persona persona2 = new Persona("Mica");
//            System.out.println("persona2 = " + persona2);

            //Si tenemos que llamar metodos dentro de un metodo estático, el otro metodo trambién debe ser estatico como el metodo imprimir
            imprimir(persona1);
            imprimir(persona2);

            //this no se puede usar en un contexto estatico porque no puede acceder al contexto dinamico donde estan los objetos almacenados en memoria
            //para eso primero tiene que gaurdar la clase en memoria
            //La principal diferencia de atributos estáticos y no esteticos es que el segundo se le vuelve asignar su valor default cada vez que se crea una isntancia del objeto 
            // y no comparten información entre ellos pero sí pueden acceder a los atributos o metodos de clase
            //Los atributos de clase o estaticos no pierden o inicializan su valor cuando creamos un instancia del objeto porque dependen de la clase, es decir, están en un contexto estatico
            //En un metodo estatico no s epuede acceder a atributos o metodos NO estaticos
            //this.contador = 10;
      }

      public static void imprimir(Persona persona) {
            System.out.println("persona = " + persona);
      }
      
      //metodo NO estatico
      public int getContador() {
            imprimir(new Persona("Carlos"));
            return this.contador;
      }
}
