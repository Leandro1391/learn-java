
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author leandro
 */
public class HolaMundo {

    public static void main(String args[]) {
        
        // Todo estas clases están contenidas en la clase Java.lang

        /* Architectura del procesador el adecuado en mi caso en long porque tengo AMD64
            tipos primitivos de tipo flotante: float(32bits) y double (64bits)
         */
        
        float numberFLoat = 10.0f;
        System.out.println("numberFLoat = " + numberFLoat);
        float numberFLoat1 = (float)22.2;
        System.out.println("numberFLoat1 = " + numberFLoat1);
        
        System.out.println("Minimun vlaue type float: " + Float.MIN_VALUE);
        System.out.println("Maximun vlaue type float: " + Float.MAX_VALUE);
        
        //explicit convertions
        float numberFLoatOverload = (float)3.4028235E38;
        System.out.println("numberFLoatOverload = " + numberFLoatOverload);
        float numberFLoatOverload2 = (float)3.4028236E38;
        System.out.println("numberFLoatOverload2 = " + numberFLoatOverload2);
        
        double numberDouble = 10;
        System.out.println("numberDouble = " + numberDouble);
        
        System.out.println("Minimun vlaue type double: " + Double.MIN_VALUE);
        System.out.println("Maximun vlaue type double: " + Double.MAX_VALUE);
        
        //The maximal is type Double
        
        
    }
}
