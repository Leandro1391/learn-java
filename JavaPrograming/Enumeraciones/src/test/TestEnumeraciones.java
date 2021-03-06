package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
      public static void main(String[] args) {
            System.out.println("Dia 6: " + Dias.SABADO);
            indicarDiaSemana(Dias.SABADO);
            
            System.out.println("Continente no. 4: " + Continentes.AMERICA);
            System.out.println("No. de paises en el 4to continente: " + Continentes.AMERICA.getPaises());
//            System.out.println("Continente no. 4: " + Continentes[3]);
      }
      
      private static void indicarDiaSemana(Dias dias) {
            switch(dias) {
                  case LUNES -> System.out.println("Primer dia de la semana");
                  case MARTES -> System.out.println("Segundo dia de la semana");
                  case MIERCOLES -> System.out.println("Tercer dia de la semana");
                  case JUEVES -> System.out.println("Cuarto dia de la semana");
                  case VIERNES -> System.out.println("Quinto dia de la semana");
                  case SABADO -> System.out.println("Sexto dia de la semana");
                  case DOMINGO -> System.out.println("Septimo dia de la semana");
                  default -> System.out.println("Day null");
                      
            }
      }
}
