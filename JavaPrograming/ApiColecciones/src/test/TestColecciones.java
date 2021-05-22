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
//            imprimir(miLista);

//            for (Object elemento : miLista) {
//                  System.out.println("Elemento= " + elemento);
//            }
            //en java podemos usar el conecpto de lambda o funcion flecha desde la version 8
//            miLista.forEach(element -> System.out.println("miLista = " + element));
            //Set - es igual que List con la diferencia que no matiene el orden de los elementos que se van guardando y es mas eficiente que list siempre y cuando no necesite mantener un orden
            //no guarda un orden al almacenar los elementos
            Set miSet = new HashSet();
            miSet.add("Lunes");
            miSet.add("Martes");
            miSet.add("Miercoes");
            miSet.add("Jueves");
            miSet.add("Viernes");
//            imprimir(miSet);
            //Las operaciones con set van a realizarse mas rapida que usando list
            
            Map miMapa = new HashMap();
            miMapa.put("valor1", "Juan"); //(key, object)
            miMapa.put("valor2", "Karla");
            miMapa.put("valor3", "Rosario");
            
            String elemento = (String) miMapa.get("valor1");
//            System.out.println("elemento = " + elemento);
            
            
            //imprimir(miMapa.keySet()); //no se garantiza el orden porque lo envía como Set
            imprimir(miMapa.values()); //con values() podemos ver toda la lista de keys almacenadas en la variabl miMapa
      }

      //interfaz collecction es el mas generico de java para los tipos List y set
      public static void imprimir(Collection coleccion) {
            coleccion.forEach(elemento -> System.out.println("elemento = " + elemento));
      }
}

/*Una lista tiene como propiedad agregar elementos de forma dinamica y ademas  mantiene el orden en el cual se guarda
En Set es como una lista pero no guarda los elementos en forma que se van almacenando y tiene mejor performance que list
en el tipo Lista se puede duplicar los elementos en cambio en set No 
*/
