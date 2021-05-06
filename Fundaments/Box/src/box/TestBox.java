package box;

public class TestBox {
      
      public static void main(String[] args) {
            
            int heightMeasure = 8, widhtMeasure = 10,  depthMeasure= 2;
            
            Box box1 = new Box();
            box1.depth = heightMeasure;
            box1.height = widhtMeasure;
            box1.width = depthMeasure;
            
            System.out.println("The box1's volume is " + box1.calculateBoxVolume() + " \u33A5");
            
            //Create instance of object Box
            Box box2 = new Box(3, 2, 6);
            
            System.out.println("The box2's volume is " + box2.calculateBoxVolume() + " \u33A5");
      }
}
