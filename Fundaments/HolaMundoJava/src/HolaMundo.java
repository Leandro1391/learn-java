
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
        
        // char value store 16 bits like short
        char myCharacter = 'a';
        System.out.println("myCharacter = " + myCharacter);
        
        char variableChar = '\u0021';
        System.out.println("variableChar = " + variableChar);
        
        char varCharDecimal = 33;
        System.out.println("carCharDecimal = " + varCharDecimal);
        
        char varCharSymbol = '!';
        System.out.println("varCharSymbol = " + varCharSymbol);
        
        //With declaration var -  inference
        var varChar0 = '\u0021';
        System.out.println("varChar0 = " + varChar0);
        
        //in this case will not be to char, inferece will take to int
        var varCharDecimal1 = 33;
        System.out.println("varCharDecimal1 = " + varCharDecimal1);
        
        //var char explicit parse
        var varCharDecimalExplicitParse = (char) 33;
        System.out.println("varCharDecimalExplicitParse = " + varCharDecimalExplicitParse);
        
        var varCharSymbol2= '!';
        System.out.println("varCharSymbol2 = " + varCharSymbol2);
        
        //example with int
        int variableIntegerSymbol = '!';
        System.out.println("variableIntegerSymbol = " + variableIntegerSymbol);
        
        int  letter = 'a';
        System.out.println("letter = " + letter);
        
        char letter2 = 97;
        System.out.println("letter2 = " + letter2);
        
        int  letterMayus = 'A';
        System.out.println("letterMayus = " + letterMayus);
      
    }
}
