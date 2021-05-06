package box;

public class Box {
      
      int  height, width, depth;
      
      public Box() {}
      
      public Box(int height, int width, int depth) {
            this.height = height;
            this.width = width;
            this.depth = depth;
      }
      
      public int calculateBoxVolume() {
            return this.width * this.height * this.depth;
      }
  
}

      /**
       * @param args the command line arguments
       */
//      public static void main(String[] args) {
//            // TODO code application logic here
//      }