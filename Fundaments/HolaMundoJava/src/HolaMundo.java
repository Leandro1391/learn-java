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
    public static void main(String args[]){
//        Define the variable int or literal
         int myVariableInteger = 10;
         System.out.println("Variable Integer: " + myVariableInteger);
         
//         Modificamos el valor de la variable literal
         myVariableInteger = 5;
         System.out.println("Variable Integer modified: " + myVariableInteger);
         
         // String is a class in Java, not Type Primitive
         String  myVariableString = "Greeteings";
         System.out.println(myVariableString);
         
         //We modified the string variable
          myVariableString = "Goodbye";
         System.out.println(myVariableString);
         
         // Since Java 10  we can use  the reserved ky VAR, it's will inference the variable, what's mean this?
         // when I put  a variable with value assigment like 10 -> the compile will interprete the varieble type in tshi case will be a int
         
         //var - Inferencia de tipo en Java
         
         //En este caso va inferir el tipo de dato según el dato que se asigne la variable en el lado derecho
         var myVariableInteger2 = 15;
         System.out.println("Variable Inference Int is: " + myVariableInteger2);
         
         //Literal type string
         var myVariableString2 = "myVariableString2";
         System.out.println("Variable Inference String is: " + myVariableString2);
         
         // with soutv + TAB autmatic complete the follow line down
        System.out.println("myVariableString2 = " + myVariableString2); 
        
        /*The reserved key var only use insede the methods, out of them  it dosen't work*/
        
//        The first character in variable must be in minus for standard conventions
        var miVariable = 1;
                
//     we don't use  specialcharecter  (only $ or _)
        var _miVariable = 2;
        var $miVariable = 3;
        
        //var áVariable = 10; Please never use it
        //var  #miVariable = 2; never with special character
         
    }
}
