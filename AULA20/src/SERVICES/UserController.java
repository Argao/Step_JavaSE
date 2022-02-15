package SERVICES;

import CONECTADB.ConnMySQL;
import MODEL.User;

import java.sql.*;

public class UserController {

    public static void cadastra(){
        Connection conexao = ConnMySQL.conectar();

        if(conexao != null){
            System.out.println("\nDB Conectado!\n");
        }else{
            System.out.println("\nERRO AO CONECTAR!\n");
        }

        String sql = "INSERT INTO Users (username,pass,fullname)"+
                     " VALUES (?,?,?)";
        User u = new User(true);
        try{
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1,u.getUserName());
            statement.setString(2,u.getPass());
            statement.setString(3,u.getFullName());

            int rows = statement.executeUpdate();
            if(rows>0)
                System.out.println("\nCadastrado com sucesso!\n");
        } catch (SQLException e) {
            System.err.println("\nErro inesperado:\n" + e);
        }
        try{
            conexao.close();
        } catch (SQLException e) {
            System.err.println("\nErro inesperado:\n" + e);
        }
    }

    public static void getAll(){
        Connection conexao = ConnMySQL.conectar();

        if(conexao != null){
            System.out.println("\nDB Conectado!\n");
        }else{
            System.out.println("\nERRO AO CONECTAR!\n");
        }

        String sql = "SELECT * FROM users";
        try{
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);

            System.out.println("\nUsuários Cadastrados\n");
            System.out.println("======================");
            while(result.next()){
                User u = new User();
                u.setUserid(result.getInt(1));
                u.setUserName(result.getString(2));
                u.setPass(result.getString("pass"));
                u.setFullName(result.getString("fullname"));

                System.out.println("Nome: " + u.getFullName());
                System.out.println("Login: " + u.getUserName());
                System.out.println("Password: " + u.getPass());
                System.out.println("-----------------------------");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try{
            conexao.close();
        } catch (SQLException e) {
            System.err.println("\nErro inesperado:\n" + e);
        }

    }

    public static void getFullName(){
        Connection conexao = ConnMySQL.conectar();

        if(conexao != null){
            System.out.println("\nDB Conectado!\n");
        }else{
            System.out.println("\nERRO AO CONECTAR!\n");
        }

        System.out.println("Digite o nome da pessoa q deseja buscar: ");
        String nome = Get.texto();

        String sql = "SELECT * FROM users WHERE fullname LIKE \"%" + nome +"%\"";
        try{
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()){
                User u = new User();
                u.setUserid(result.getInt("user_id"));
                u.setUserName(result.getString("username"));
                u.setPass(result.getString("pass"));
                u.setFullName(result.getString("fullname"));


                System.out.println("Nome: " + u.getFullName());
                System.out.println("Login: " + u.getUserName());
                System.out.println("Password: " + u.getPass());
                System.out.println("-----------------------------");
            }


        } catch (SQLException e) {
            System.err.println("\nErro inesperado:\n" + e);
        }
        try{
            conexao.close();
        } catch (SQLException e) {
            System.err.println("\nErro inesperado:\n" + e);
        }
    }


}
