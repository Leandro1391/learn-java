package operations;

public class TestArithmetic {
      public static void main(String[] args) {
            Arithmetic arithmetic1 = new Arithmetic();
            arithmetic1.a = 3;
            arithmetic1.b = 2;
            arithmetic1.sum();
            
            int result = arithmetic1.sumWithReturn();
            System.out.println("result  from test clase = " + result);
            
            //Cuando enviamos la información a nuestro método lo llamamos parámetros
            result = arithmetic1.sumWIthArguments(5, 8);
            System.out.println("result witu arguments= " + result);
      }
}
