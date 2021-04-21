
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
        
        //inference is int
        var numberInteger = 10;
        System.out.println("numberInteger = " + numberInteger);
     
        var numberDouble  = 10.0;
        System.out.println("numberDouble = " + numberDouble);
        
        //Por defecto es double para forzar hay que aplicar F
        var numberFloat = 10.0F;
        System.out.println("numberFloat = " + numberFloat);
    }
}
