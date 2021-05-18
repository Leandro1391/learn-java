package paquete1;

//Cuando trabajamos con protected  permitir a las clases hijas de la clase2 poder acceder a los atributos y constructores definidos en la clase padre (clase2)
//Aunque los constructores no se heredan podemos usar la palabra super() para usar los constructores de la clase padre
//Si el constructor esta declarado como private en la clase padre no vamos a poder acceder con super u otra manera
//Protected no significa que se hereden sino que pueda accederlos usando la palabra super

//protected no se aplica a nivel clase dará error en el editor
//las clases no pueden ser privadas
class Clase2 {
      //Se puede aplicar protected en atributos y se puede acceder a la clase hija
     private  String atributoPrivado = "Valor atributo privado";
      
      //en constructor se puede aplicar protected, se puede invocar desde una clase hija con la palabra super
     //si el consutructo es privado solamente se podra utilizar en la misma clase
      private Clase2() {
            System.out.println("Constructor private");
      }
      
      public Clase2(String argumentos) {
            this();
            System.out.println("Constructor publico");
      }
      
      private void metodoDefault() {
            System.out.println("Metodo default");
      }

      public String getAtributoPrivado() {
            return atributoPrivado;
      }

      public void setAtributoPrivado(String atributoPrivado) {
            this.atributoPrivado = atributoPrivado;
      }
      
}

//El conecpto de encapsulamiento es que los atributos sean privados para leer o escribir con metodos get() o set() para accederlos