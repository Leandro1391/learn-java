package test;

public class TestAutoboxinUnboxing {

      public static void main(String[] args) {
            //Clases Envolventes de tipos primitivos (cada tipo primitivo tiene asociado una clase)
            /*
            tipo - Clase envolvente
            int - Integer
            long - Long
            float - Float
            double - Double
            boolean - Boolean
            byte - Byte;
            char - Character
            short - Short
             */

//            int entero = 10;
            Integer entero = 10; //Autoboxing -> envolvemos un tipo primitivo a object
            System.out.println("entero = " + entero); //literal tipo entero
            System.out.println("entero = " + entero.toString()); //literal tipo String
            System.out.println("entero = " + entero.doubleValue()); //literal tipo double
            
            System.out.println("");
            
            //Manera inversa (unboxing) -> extraemos un tipo object a primitivo
            int entero2 = entero;
            System.out.println("entero2 = " + entero2);
      }
}

// Porque vamos  a usar estas clases, porque en las clases envolventes contienen atributos y metodos
//Los atributos primitivos solamente almacenan un valor pero no atributos o metodos
//calculos exhaustivos se usa int, si no son exhaustivos se usa la clase, para realizar conversiones
