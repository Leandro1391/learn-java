package paquete1;

//Cuando trabajamos con protected  permitir a las clases hijas de la clase2 poder acceder a los atributos y constructores definidos en la clase padre (clase2)
//Aunque los constructores no se heredan podemos usar la palabra super() para usar los constructores de la clase padre
//Si el constructor esta declarado como private en la clase padre no vamos a poder acceder con super u otra manera
//Protected no significa que se hereden sino que pueda accederlos usando la palabra super

//protected no se aplica a nivel clase dará error en el editor
class Clase2 {
      //Se puede aplicar protected en atributos y se puede acceder a la clase hija
      String atributoDefault = "Valor atributo default";
      
      //en constructor se puede aplicar protected, se puede invocar desde una clase hija con la palabra super
      Clase2() {
            System.out.println("Constructor default");
      }
      
      Clase2(String arg) {
//            this();
            this.atributoDefault = arg;
      }
      void metodoDefault() {
            System.out.println("Metodo default");
      }
}