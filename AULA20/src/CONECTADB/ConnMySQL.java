package CONECTADB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;

public class ConnMySQL {
    public static Connection conectar(){
        String server = "localhost";
        String port = "3306";
        String banco = "teste";
        String url = "jdbc:mysql://" + server + ":" + port + "/" + banco;
        //jdbc:mysql://localhost:3306/teste
        String user = "root";
        String password = "";
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
        }catch(SQLTimeoutException e ){
            System.err.println("\nTempo de conexão esgotado!\n");
        }catch(SQLException e){
            System.out.println("\nErro inesperado:\n" + e);
        } catch (ClassNotFoundException e) {
            System.out.println("\nDRIVER NÃO CARREGADO!\n");
        }
        return conn;
    }
}
