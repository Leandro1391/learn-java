package box;

public class TestBox {
      
      public static void main(String[] args) {
            
            //Create instance of object Box
            Box box1 = new Box(3, 2, 6);
            
            System.out.println("The box's volume is " + box1.calculateBoxVolume() + "mts");
      }
}
