package domain;

public abstract class FiguraGeometrica {

      private String tipoFIgura;

      protected FiguraGeometrica(String tipoFigura) {
            this.tipoFIgura = tipoFigura;
      }
      
      //Este metodo no se ejecuta
      public abstract void dibujar();

      public String getTipoFIgura() {
            return tipoFIgura;
      }

      public void setTipoFIgura(String tipoFIgura) {
            this.tipoFIgura = tipoFIgura;
      }

      @Override
      public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FiguraGeometrica{tipoFIgura=").append(tipoFIgura);
            sb.append('}');
            return sb.toString();
      }

}
