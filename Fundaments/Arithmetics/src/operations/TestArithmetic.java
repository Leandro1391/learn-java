package operations;

public class TestArithmetic {
      public static void main(String[] args) {
            // El objetivo del constructor es construir un objeto, reservar espacio de memoria e inicializar los atributos de la clase
            //new reserva el espacio de memoria
            //Cuando se crea el objeto retorna una referencia de memoria para asignarlo a la variable arithmetic1
            //Entonces la variable arithmetic1 apunta al objeto que se creo al espacio de memoria new Arithmetic();
            Arithmetic arithmetic1 = new Arithmetic();
            System.out.println("Arithmetic a: " + arithmetic1.a);
            System.out.println("Arithmetic b: " + arithmetic1.b);
            
            Arithmetic arithmetic2 = new Arithmetic(5, 20);
            System.out.println("Arithmetic a: " + arithmetic2.a);
            System.out.println("Arithmetic b: " + arithmetic2.b);
            
            arithmetic1.a = 3;
            arithmetic1.b = 2;
            arithmetic1.sum();
            
            
            int result = arithmetic1.sumWithReturn();
            System.out.println("result  from test clase = " + result);
            
            //Cuando enviamos la información a nuestro método lo llamamos parámetros
            result = arithmetic1.sumWIthArguments(5, 8);
            System.out.println("result witu arguments = " + result);
            
            // Dentro de un metodo estatico no podemos usar la palabra reservada THIS porque solamente se usa en una intancia de la clase
      }
}
