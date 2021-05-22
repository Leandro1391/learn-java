package test;

import java.util.*;

public class TestColeccionesGenericas {
      
      //En APi colection soporta los tipos genericos para indicar el tipo en tiempo de compilacion y est sirve para  validar en tiempo de compilacione
      //tengamos validacion de los elementos que estamos agregando nuestra lista, SE USA PARA BUENAS PRACTICAS DE DESARROLLO
      //Tambien tenemos el beneficio de recuperar elemento sin realizar downcasting

      public static void main(String[] args) {
            //una lista puede crecer dinamicamente
            List<String> miLista = new ArrayList<>(); //notacion diamante <>
            miLista.add("Lunes");
            miLista.add("Martes");
            miLista.add("Miercoles");
            miLista.add("Jueves");
            miLista.add("Viernes");
            miLista.add("Sabado");
            miLista.add("Domingo");
            String elemento = miLista.get(0);
//            System.out.println("elemento = " + elemento);
//            imprimir(miLista);

//            for (Object elemento : miLista) {
//                  System.out.println("Elemento= " + elemento);
//            }
            //en java podemos usar el conecpto de lambda o funcion flecha desde la version 8
//            miLista.forEach(element -> System.out.println("miLista = " + element));
            //Set - es igual que List con la diferencia que no matiene el orden de los elementos que se van guardando y es mas eficiente que list siempre y cuando no necesite mantener un orden
            //no guarda un orden al almacenar los elementos
            
            
            Set<String> miSet = new HashSet<>();
            miSet.add("Lunes");
            miSet.add("Martes");
            miSet.add("Miercoles");
            miSet.add("Jueves");
            miSet.add("Viernes");
//            imprimir(miSet);
            //Las operaciones con set van a realizarse mas rapida que usando list
            
            Map<String, String> miMapa = new HashMap<>();
            miMapa.put("valor1", "Juan"); //(key, object)
            miMapa.put("valor2", "Julia");
            miMapa.put("valor3", "Rosario");
            miMapa.put("valor3", "Charles");// el elemento almacenado en la key "valor3" se va a reemplazar por Charles
            
//            String elementoMapa = (String) miMapa.get("valor1"); //ya no es un object ahora es un String
            String elementoMapa = miMapa.get("valor1");
//            System.out.println("elementoMapa = " + elementoMapa);
            
            
            imprimir(miMapa.keySet()); //no se garantiza el orden porque lo envía como Set
            imprimir(miMapa.values()); //con values() podemos ver toda la lista de keys almacenadas en la variable miMapa
      }

      //interfaz collecction es el mas generico de java para los tipos List y set
      public static void imprimir(Collection<String> coleccion) {
            coleccion.forEach(elemento -> System.out.println("elemento = " + elemento));
      }
}

/*Una lista tiene como propiedad agregar elementos de forma dinamica y ademas  mantiene el orden en el cual se guarda
En Set es como una lista pero no guarda los elementos en forma que se van almacenando y tiene mejor performance que list
en el tipo Lista se puede duplicar los elementos en cambio en set No 
*/
