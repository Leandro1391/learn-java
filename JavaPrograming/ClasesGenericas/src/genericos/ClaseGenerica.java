package genericos;

/*  Un tipo generico en java es un comodin, es decir, que en la clase no vamos a definir el tipo de dato que va almaenar sino en el momento
que vamos a crear un objeto de la instancia de esta clase, se especificará el tipo de dato que a utilizar*/

/* <E> Elemento
<K> Llave
<N> Number
<T> type o tipo de una clase
<V> representa un valor*/

public class ClaseGenerica<T> {
      
      private T objecto;
      
      public ClaseGenerica(T objecto) {
            this.objecto = objecto;
      }
      
      public void obtenerTipo() {
            System.out.println("El tipo T es: " + objecto.getClass().getSimpleName());
      }
}
