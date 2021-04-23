
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
        
        int  a=3, b=2;
        var result = a + b;
        System.out.println("result  sum= " + result);
        
        result = a - b;
        System.out.println(" result minus= " +  result);
        
        result = a * b;
        System.out.println("result multiplicate= " + result);
        
//        result =  a / b; result is integer
//            var result2 = 3F / b;
            var result2 = 3D / b;
        System.out.println("result div = " + result2);
       
        // Obtiene el resto de la division
        result = a % b;
        System.out.println("result2 = " + result);
        
        //is par or impar
        if(b % 2 == 0)
            System.out.println("Es numero par");
        else
            System.out.println("Es numero impar");
    }
}
