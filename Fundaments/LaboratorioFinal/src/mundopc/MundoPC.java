package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
      
      public static void main(String[] args) {
            
            var raton1 = new Raton("USB", "Genius");
            var raton2 = new Raton("Bluetooth", "Korg");
            
            var teclado1 = new Teclado("USB", "Zom");
            var teclado2 = new Teclado("Bluetooth", "Genius");
            
            var monitor1 = new Monitor("Samsung", 1024.0);
            var monitor2 = new Monitor("Panasonic", 768.0);
            
            Monitor monitorHP = new Monitor("HP",  20.2);
            Teclado tecladoHP = new Teclado("USB", "HP");
            Raton ratonHP = new Raton("USB", "HP");
            
            Computadora computadoraHP = new Computadora("HP", monitorHP, tecladoHP, ratonHP);
                    
            var computadora1 = new Computadora("Toshiba", monitor1, teclado1, raton1);
            var computadora2 = new Computadora("Ramexx", monitor1, teclado1, raton1);
            var computadora3 = new Computadora("Solus", monitor2, teclado2, raton2);
            
            var orden1 = new Orden();
            Orden ordenHP = new Orden();
            
            orden1.agregarComputadora(computadora1);
            orden1.agregarComputadora(computadora2);
            orden1.agregarComputadora(computadora3);
            ordenHP.agregarComputadora(computadoraHP);
            
            orden1.mostrarOrden();
            ordenHP.mostrarOrden();
            
            
      }
}
