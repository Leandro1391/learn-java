package clases;

public class PruebaPersona {
      public static void main(String[] args) {
            //Llamamos al constructor - Crea un objeto que lo almacena en memoria
            //las variables y objetos se almacenan en distintos lugares de la memoria
            //cuando termina de crear el objeto en memoria regresa la referencia donde se ha creado el objeto en la memoria 
            // a persona1 y con ese podemos acceder a los atributos y metodos del objeto que hemos creado  en memoria
            Persona persona1 = new Persona(); 
            System.out.println("persona1 = " + persona1);
            //salida de la consola -> persona1 = clases.Persona@2f92e0f4
            
            //accedemos como instancia de la clase Persona
            persona1.nombre = "Gustavo";
            persona1.apellido = "Lopez";
            
            persona1.desplegarInformacion();
            
            Persona persona2 = new Persona();
            System.out.println("persona2 = " + persona2);
            //salida de la consola ->  persona2 = clases.Persona@2f92e0f4
            
            System.out.println("Nombre: " + persona2.nombre);
            System.out.println("Apellido: " + persona2.apellido);
            //el valor default de un objeto es null
            
            persona2.apellido = "Lara";
            persona2.nombre = "Karla";
            persona2.desplegarInformacion();
            
            /*El miembro derecho se crea el objeto  ->  se  reserva espacio de memrofia y esa referencia de memoria se le asigna 
            a la variable persona1 y por eso podemos leer o modificar a los atributos y metodos de la clase Persona*/
            // Persona persona1 = new Persona(); 
            
            /*RESUMEN
            
            Clase: es la plantilla o molde donde definimos los atributos o carateristicas y metodos, es decir, la abstraccion de un objeto
            Objeto: Son las intancias que estamos creando desde nuestra clase (lo concreto), con esto podemos utilizar  para acceder a sus atribtuso y metodos 
            Cada objeto que se crea es dinstinto por eso de denomina "INSTANCIA de la clase" 
            IMPORTANTE: instancia de una clase u objeto son lo MISMO*/
      }
}
