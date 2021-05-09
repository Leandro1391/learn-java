package test;

//para importar todas las clases del paquete dominio usamos el cmodiín * como abajo

import dominio.Persona;

//import dominio.*; //con esta forma solamente va cargar las casels necesarias en memoria

public class PersonaPrueba {
      
      public static void main(String[] args) {
            
            Persona persona1 = new Persona("Pepe", 1200.00, false);
            Persona persona2 = new Persona("Sergio", 2000.00, false);
            System.out.println("Nombre persona1 sin cambios: " + persona1.getNombre());
            
            persona1.setNombre("Juan Carlos");
            
            System.out.println("Nombre persona1: " + persona1.getNombre());
            System.out.println("persona1 sueldo: " + persona1.getSueldo());
            System.out.println("persona eliminado: " + persona1.isEliminado());
            
            //persona2
            System.out.println("nombre de la persona2: "  + persona2.getNombre());
            
            persona2.setNombre("Papadolpoulu");
            System.out.println("nombre de la persona2 cambiado: "  + persona2.getNombre());
            
            System.out.println("suledo: " + persona2.getSueldo());
            
            persona2.setSueldo(10000.50);
            System.out.println("persona2 sueldo actualizado = " + persona2.getSueldo());
            
            persona2.setEliminado(true);
            System.out.println("persona eliminada: " + persona2.isEliminado());
            
//            System.out.println("persona1: " + persona1.toString());
//            System.out.println("persona2: " + persona2.toString());
//                del amisma forma
            System.out.println("persona1: " + persona1);
            System.out.println("persona2: " + persona2);
      }
}
