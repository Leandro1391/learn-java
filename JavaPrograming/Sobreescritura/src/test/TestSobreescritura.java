package test;

import domain.Gerente;

public class TestSobreescritura {
      public static void main(String[] args) {
            Gerente gerente1 = new Gerente("Gerardo", 1000.0, "Sistemas");
            System.out.println("gerente1 = " + gerente1.obtenerDetalles());
      }
}
