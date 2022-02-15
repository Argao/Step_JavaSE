package SERVICES;

import CONECTADB.ConnMySQL;
import MODEL.User;


import java.sql.*;
import java.util.ArrayList;

public class UserController {


    public static boolean login(String login,String senha,User u){
        Connection conexao = ConnMySQL.conectar();
        if(conexao != null){
            System.out.println("\nDB Conectado!\n");
        }else{
            System.out.println("\nERRO AO CONECTAR!\n");
        }
        String sql = "SELECT * FROM users " +
                "WHERE username = '" + login + "' AND pass = '" + senha+"'";
        try{
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()){
                u.setUserid(result.getInt(1));
                u.setUserName(result.getString(2));
                u.setPass(result.getString(3));
                u.setFullName(result.getString(4));
                return true;
            }

            return false;
        } catch (SQLException throwables) {
            System.err.println("Erro! "+ throwables);
            return  false;

        }
    }

    public static void atualizaSenha(String senha){
        Connection conexao = ConnMySQL.conectar();

        String sql = "UPDATE users SET pass = ?";
        try{
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1,senha);

            int rows = statement.executeUpdate();
            if(rows>0)
                System.out.println("\nSenha atualizada com sucesso!\n");
        } catch (SQLException e) {
            System.err.println("\nErro inesperado:\n" + e);
        }
        try{
            conexao.close();
        } catch (SQLException e) {
            System.err.println("\nErro inesperado:\n" + e);
        }
    }


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
            conexao.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void getPorNome(String nome){
        Connection conexao = ConnMySQL.conectar();

        String sql = "SELECT * FROM users " +
                        "WHERE fullname LIKE \"%"+ nome +"%\"" ;
        try{
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);

            System.out.println("\nUsuários Cadastrados\n");
            System.out.println("Nomes que contenham: \"" + nome + "\"");
            System.out.println("======================================");
            while(result.next()){
                User u = new User();
                u.setUserid(result.getInt(1));
                u.setUserName(result.getString(2));
                u.setPass(result.getString("pass"));
                u.setFullName(result.getString("fullname"));

                System.out.println("ID: " + u.getUserid());
                System.out.println("Nome: " + u.getFullName());
                System.out.println("Login: " + u.getUserName());
                System.out.println("Password: " + u.getPass());
                System.out.println("-----------------------------");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public static ArrayList<User> getListaPorNome(String nome){
        Connection conexao = ConnMySQL.conectar();
        ArrayList<User> lista = new ArrayList<>();

        String sql = "SELECT * FROM users "+
                "WHERE fullname LIKE \"%" + nome +"%\"";
        try{
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while(result.next()){
                User u = new User();
                u.setUserid(result.getInt(1));
                u.setUserName(result.getString(2));
                u.setPass(result.getString("pass"));
                u.setFullName(result.getString("fullname"));

                lista.add(u);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return lista;
    }

    public static void deleta(){
        System.out.println("Excluir USUÁRIO -------------------------");
        System.out.print("Quem vai pro saco: ");

        getPorNome(Get.texto());

        System.err.print("\n\nCONFIRME O ID À SER EXCLUÍDO: ");
        int id = Get.inteiro();

        Connection conexao = ConnMySQL.conectar();

        String sql = "DELETE FROM Users "+
                     "WHERE user_id = ?";
        try{
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1,id);

            int rows = statement.executeUpdate();
            if(rows>0)
                System.out.println("\nEXCLUÍDO com sucesso!\n");
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
