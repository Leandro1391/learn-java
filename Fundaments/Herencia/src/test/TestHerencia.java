package test;

import domain.Cliente;
import domain.Empleado;

//Los constructores no se heredan en Java per se puede accederlos con la palabra super(), es decir,
//a los consutrcutores padres y para acceder a uno particular dependerá a la cantidad de argumentos en el super();
public class TestHerencia {

      public static void main(String[] args) {
            Empleado empleado1 = new Empleado("Juan", 5000.0);
            System.out.println("empleado1 = " + empleado1);

//            Cliente cliente1 = new Cliente("Patricia", 'F', 59, "Av. Libertador 5800", true);
//            System.out.println("cliente1 = " + cliente1);
      }
}
