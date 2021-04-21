
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
            tipos primitivos enteros: byte (8bits), short (16bits), int (32bits), long (64bits)
         */
        byte numberByte = 10;
        System.out.println("numberByte = " + numberByte);

        //Class Byte
        System.out.println("Minimum value byte: " + Byte.MIN_VALUE);
        System.out.println("Maximun value byte: " + Byte.MAX_VALUE);

        //  Explicit Convertion bun carefull  always watch the range type, los precission
        byte numberByteMax = (byte) 129;
        System.out.println(numberByteMax);

        short numberShort = 200;
        System.out.println("numberShort = " + numberShort);

        //Class Short
        System.out.println("Minimun value short: " + Short.MIN_VALUE);
        System.out.println("Maximun value short: " + Short.MAX_VALUE);
        
        //El usuario se hará cargo de la pérdida de precición en una la conversión explícita
         short numberOverloadShort = (short) 32768;
        System.out.println("numberOverload = " + numberOverloadShort);
        
        int numberInt = 10;
        System.out.println("numberInt = " + numberInt);
        
        System.out.println("Minimun value inte: " + Integer.MIN_VALUE);
        System.out.println("Maximun value int: " + Integer.MAX_VALUE);
        
        // this is a spacial case, the literal default is int, that's is the problem so we need convert to long
        int numberIntOverload = (int)2147483648L; // with L convert to long 32 to 64
        System.out.println("numberIntOverload = " + numberIntOverload);
        //int numberIntOverload = 2147483648L; // Error
        
        
       long numberLong = 10;
        System.out.println("numberLong = " + numberLong);
        System.out.println("Minimun value long: " + Long.MIN_VALUE);
        System.out.println("Maximun value long: " + Long.MAX_VALUE);
        
        long numberLongOverload =  9223372036854775807L;
        System.out.println("numberLongOverload = " + numberLongOverload);
        
        long numberLongOverload2 =  (long)9223372036854775808D;
        // long numberLongOverload23=  (long)9223372036854775808L;
        long numberLongOverload23=  (long)9223372036854775808D;
        
    }
}
