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
            imprimir(miLista);

//            for (Object elemento : miLista) {
//                  System.out.println("Elemento= " + elemento);
//            }
            //en java podemos usar el conecpto de lambda o funcion flecha desde la version 8
//            miLista.forEach(element -> System.out.println("miLista = " + element));
            //Set - es igual que List con la diferencia que no matiene el orden de los elementos que se hayan guardado
            Set miSet = new HashSet();
            miSet.add("Lunes");
            miSet.add("Martes");
            miSet.add("Miercoes");
            miSet.add("Jueves");
            miSet.add("Viernes");
            imprimir(miSet);

      }

      //interfaz collecction es el mas generico de java para los tipos List y set
      public static void imprimir(Collection coleccion) {
            coleccion.forEach(elemento -> System.out.println("elemento = " + elemento));
      }
}

/*Una lista tiene como propiedad agregar elementos de forma dinamica y ademas  mantiene el orden en el cual se guarda*/
