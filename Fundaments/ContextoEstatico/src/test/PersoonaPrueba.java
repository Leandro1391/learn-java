package test;

import domain.Persona;

public class PersoonaPrueba {

      //el main es un  metodo estatico  (de clase) porque el compilador necesita primero cargar la clase en la memoria, con main
      // estamos diciendo que ejecute primeor este metodo
      public static void main(String[] args) {
            var persona1 = new Persona("Leandro");
            System.out.println("persona1 = " + persona1);

            Persona persona2 = new Persona("Mica");
            System.out.println("persona2 = " + persona2);

            //La principal diferencia de atributos estáticos y no esteticos es que el segundo se le vuelve asignar su valor default cada vez que se crea una isntancia del objeto 
            // y no comparten información entre ellos pero sí pueden acceder a los atributos o metodos de clase
            //Los atributos de clase o estaticos no pierden o inicializan su valor cuando creamos un instancia del objeto porque dependen de la clase, es decir, están en un contexto estatico
      }
}
