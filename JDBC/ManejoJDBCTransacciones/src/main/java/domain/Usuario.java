package domain;

public class Usuario {

      private int idUsuario;
      private String usuario;
      private String password;

      public Usuario() {
      }

      public Usuario(int idUsuario) {
            this.idUsuario = idUsuario;
      }

      public Usuario(String usuario, String password) {
            this.usuario = usuario;
            this.password = password;
      }

      public Usuario(int idUsuario, String usuario, String password) {
            this.idUsuario = idUsuario;
            this.usuario = usuario;
            this.password = password;
      }

      public int getIdUsuario() {
            return this.idUsuario;
      }

      public void setId_usuario(int idUsuario) {
            this.idUsuario = idUsuario;
      }

      public String getUsuario() {
            return this.usuario;
      }

      public void setUsuario(String usuario) {
            this.usuario = usuario;
      }

      public String getPassword() {
            return this.password;
      }

      public void setPassword(String password) {
            this.password = password;
      }

      @Override
      public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Usuario{id_usuario=").append(idUsuario);
            sb.append(", usuario=").append(usuario);
            sb.append(", password=").append(password);
            sb.append('}');
            return sb.toString();
      }
}
