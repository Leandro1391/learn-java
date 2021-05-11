package test;

import domain.Persona;

public class TestArraysObject {

      public static void main(String[] args) {
            //Los arrays se denominan en plural
            Persona personas[] = new Persona[2];
            
            personas[0] = new Persona("Juan");
            personas[1] = new Persona("Pedro");
            System.out.println("personas 0 =  " + personas[0]);
            System.out.println("personas 1 =  " + personas[1]);
      }
}
