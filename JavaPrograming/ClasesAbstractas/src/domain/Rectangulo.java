package domain;

public class Rectangulo extends FiguraGeometrica {
      
      public Rectangulo(String tipoFigura) {
            super(tipoFigura);
      }
      
      //Lo estamos implementado, no sobreescribiendo porque no esta implementadoe l comportamiendo en la clase padre
      @Override
      public void dibujar() {
            //Regresamo el tipo de nuesta clase
            System.out.println("Se imprime un: " + this.getClass().getSimpleName());
      }
}
