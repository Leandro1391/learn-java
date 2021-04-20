
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
        
        /* Architectura del procesador el adecuado en mi caso en long porque tengo AMD64
            tipos primitivos enteros: byte (8bits), short (16bits), int (32bits), long (64bits)
        */
        
        byte numberByte = 10;
        System.out.println("Minimum value byte: " + Byte.MIN_VALUE);
        System.out.println("Maximun value byte: " + Byte.MAX_VALUE);
        
        //  Explicit Convertion bun carefull  always watch the range type
        byte numberByteMax = (byte)129;
        System.out.println(numberByteMax);
        
        
    }
}
