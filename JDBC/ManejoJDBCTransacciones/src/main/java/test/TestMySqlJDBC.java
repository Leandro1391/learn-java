package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestMySqlJDBC {
      public static void main(String[] args) {
            //First step string connection
            var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
            
            try {
                  //Second step - no obligatorio pero si se usa para app webs
                  //Class.forName("com.mysql.cj.jdbc.Driver");
                  //Third step connection
                  Connection conexion = DriverManager.getConnection(url);
                  //Fourth statement implementa la interface
                  Statement instruccion = conexion.createStatement();
                  //Fifth query
                  var sql = "SELECT * FROM test.personas;";
                  //Sixth Execute the query with the interface
                  ResultSet resultado = instruccion.executeQuery(sql);
                  //Seventh cycle while for view the query result
                  while(resultado.next()){
                        System.out.print("Id Persona: " + resultado.getInt("id_persona"));
                        System.out.print(" Nombre: " + resultado.getString("nombre"));
                        System.out.print(" Apellido: " + resultado.getString("apellido"));
                        System.out.print(" Email: " + resultado.getString("email"));
                        System.out.print(" Telefono: " + resultado.getString("telefono"));
                        System.out.println("");
                  }
                  resultado.close();
                  instruccion.close();
                  conexion.close();
            } catch (SQLException ex) {
                  ex.printStackTrace(System.out);
            }
      }
}
