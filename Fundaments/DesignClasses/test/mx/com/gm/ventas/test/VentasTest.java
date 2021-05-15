package mx.com.gm.ventas.test;

import com.gm.ventas.*;
//import com.gm.ventas.Order;
//import com.gm.ventas.Producto;

public class VentasTest {
      public static void main(String[] args) {
            
//            do {
//                  
//            } while (true);
            
            Producto producto1 = new Producto("Cachafaz", 120.0);
            Producto producto2 = new Producto("Capitan del espacio", 80.0);
            Producto producto3 = new Producto("Capitan del espacio", 80.0);
            Producto producto4 = new Producto("Capitan del espacio", 80.0);
            Producto producto5 = new Producto("Capitan del espacio", 80.0);
            Producto producto6 = new Producto("Capitan del espacio", 80.0);
            Producto producto7 = new Producto("Capitan del espacio", 80.0);
            Producto producto8 = new Producto("Capitan del espacio", 80.0);
            Producto producto9 = new Producto("Capitan del espacio", 80.0);
            Producto producto10 = new Producto("Capitan del espacio", 80.0);
            Producto producto11 = new Producto("Capitan del espacio", 80.0);
            
            Order order1 = new Order();
            
            order1.agregarProducto(producto1);
            order1.agregarProducto(producto2);
            order1.agregarProducto(producto3);
            order1.agregarProducto(producto4);
            order1.agregarProducto(producto5);
            order1.agregarProducto(producto6);
            order1.agregarProducto(producto7);
            order1.agregarProducto(producto8);
            order1.agregarProducto(producto9);
            order1.agregarProducto(producto10);
            order1.agregarProducto(producto11);
            
            order1.calcularTotal();
            
            System.out.println("Total: " + order1.calcularTotal());
            
            order1.mostrarOrden();
                    
            
      }
}
