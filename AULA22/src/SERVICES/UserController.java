package SERVICES;

import CONECTADB.ConnMySQL;
import MODEL.User;

import java.sql.*;
import java.util.ArrayList;

public class UserController {

    public static void cadastra(){
        Connection conexao = ConnMySQL.conectar();

        if(conexao != null){
            System.out.println("\nDB Conectado!\n");
        }else{
            System.out.println("\nERRO AO CONECTAR!\n");
        }

        String sql = "INSERT INTO Users (username,pass,fullname,permissao)"+
                     " VALUES (?,?,?,?)";
        User u = new User(true);
        try{
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1,u.getUserName());
            statement.setString(2,u.getPass());
            statement.setString(3,u.getFullName());
            statement.setInt(4,u.getPermissao());

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

    public static User login(){
        System.out.println("===============LOGIN=================");
        System.out.print("User: ");
        String user = Get.texto();
        System.out.print("Pass: ");
        String pass = Get.texto();
        User u = null;

        try{
            String sql = "SELECT * FROM users "+
                         "WHERE userName LIKE \"%" + user +"%\"";
            Connection conexao = ConnMySQL.conectar();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while(result.next()){
                u = new User();
                u.setUserid(result.getInt(1));
                u.setUserName(result.getString(2));
                u.setPass(result.getString("pass"));
                u.setFullName(result.getString("fullname"));
                u.setPermissao(result.getInt("permissao"));
            }

            if(u.getPass().equals(pass)){
                return u;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.gc();//chma o garbage collector
        return null;
    }

    public static void alterarSenha(User user){
        Connection conexao = ConnMySQL.conectar();

        String sql = "UPDATE Users SET pass = ? WHERE user_id = ?";
        String senha = "";
        while(true){
            System.out.print("Informe Nova SENHA: ");
            senha = Get.texto();
            System.out.print("CONFIRME NOVA SENHA: ");
            String novaSenha = Get.texto();

            if(senha.equals(novaSenha)) break;
        }

        try{
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1,senha);
            statement.setInt(2, user.getUserid());

            int rows = statement.executeUpdate();
            if(rows>0)
                System.out.println("\nSenha alterada com sucesso!\n");
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
