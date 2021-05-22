package test;

import java.util.*;

public class TestColecciones {
      public static void main(String[] args) {
            //una lista puede crecer dinamicamente
            List miLista = new ArrayList();
            miLista.add("Lunes");
            miLista.add("Martes");
            miLista.add("Miercoles");
            miLista.add("Jueves");
            miLista.add("Viernes");
            miLista.add("Sabado");
            miLista.add("Domingo");
            
//            for (Object elemento : miLista) {
//                  System.out.println("Elemento= " + elemento);
//            }
            
            //en java podemos usar el conecpto de lambda o funcion flecha desde la version 8
            miLista.forEach(element -> System.out.println("miLista = " + element));
      }
}

/*Una lista tiene como propiedad agregar elementos de forma dinamica y ademas  mantiene el orden en el cual se guarda*/