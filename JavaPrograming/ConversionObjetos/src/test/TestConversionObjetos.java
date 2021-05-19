package test;

import domain.*;

public class TestConversionObjetos {
      public static void main(String[] args) {
            Empleado empleado;
            
            //Como vemos un objeto padre puede almacenar la referencia de una de sus clases derivadas o hijas
            empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
//            System.out.println("empleado = " + empleado);
      
            //Aunque estemos usando una variable de tipo padre podemos acceder a la informacion de la clase hija Escritor por el polimorfismo
            //podremos acceder a la informacion tanto del padre o del hijo DEPENDIENDO del  objeto que esté apuntando en memoria en la linea 10 new, en este caso d ela hija
            //El compilador no sabe a que nivel se ejecuta. solamente se define en tiempo de ejecucion 
            System.out.println("empleado = " + empleado.obtenerDetalles());
            
            //No se puede acceder porque getTipoEscritura solamente esta definido en la clase hija Escritor para invocarlo hay que usar downcasting
            //empleado.getTipoEscritura();
            
            //Conversion de Empleado a Escirtor  - Downcasting
//            ((Escritor)empleado).getTipoEscritura();
            Escritor escritor = (Escritor) empleado;
            escritor.getTipoEscritura();
            
            //Conversion hijo hacia padre no necesita una conversion o casting explicito (Upcasting)
            
            Empleado empleado2 = escritor;
            System.out.println("empleado2 = " + empleado2.obtenerDetalles());
            
      }
}

//asignamos sin problemas una referencia de tipo hijo a la clase padre line 10

//Downcasting es similar cuando trabajarmos con tipos primitivos -> los tipos que tienen mas bytes soportan tipos con menor cantidad de bytes pero en forma inversa
//no aplicar y entonces deberemos indicar la conversion explicita

//Downcasting: convertir un tipo de la clase padre a hija
//Upcasting: convertir un tipo de la clase hija  hacia un tipo de la clase  padre