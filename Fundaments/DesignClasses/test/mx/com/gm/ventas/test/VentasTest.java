package mx.com.gm.ventas.test;

import com.gm.ventas.Order;
import com.gm.ventas.Producto;

public class VentasTest {
      public static void main(String[] args) {
            
//            do {
//                  
//            } while (true);
            
            Producto producto1 = new Producto("Cachafaz", 120.0);
            Producto producto2 = new Producto("Capitan del espacio", 80.0);
            
            Order order1 = new Order();
            
            order1.agregarProducto(producto1);
            order1.agregarProducto(producto2);
            
            order1.calcularTotal();
            
            System.out.println("Total: " + order1.calcularTotal());
            
            order1.mostrarOrden();
                    
            
      }
}
