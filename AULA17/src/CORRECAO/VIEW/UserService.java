package CORRECAO.VIEW;

import CORRECAO.Controller.UserController;

import java.io.*;
import java.util.ArrayList;

public class UserService {
    public static void cadUser() throws IOException {
        UserController user = new UserController();
        System.out.println("==CADASTRANDO USUÁRIO==");
        user.cadastra();

        FileWriter file = new FileWriter("c:\\SAIDA JAVA\\users.dat",true);
        BufferedWriter buff = new BufferedWriter(file);

        buff.write("\n" + user.getLogin() + "##§##" + user.getPass());

        buff.close();

        System.out.println("Usuário Cadastrado com Sucesso!");
    }

    public static boolean login(String login, String pass) throws IOException {
        ArrayList<UserController> users = new ArrayList<>();

        FileReader file = new FileReader("c:\\SAIDA JAVA\\users.dat");
        BufferedReader buff = new BufferedReader(file);

        String row = "";
        while((row = buff.readLine()) != null){
            String[] aux = row.split("##§##");
            users.add(new UserController(aux[0],aux[1]));
        }

        for(UserController u : users){
            if(u.getLogin().equalsIgnoreCase(login) && u.getPass().equals(pass)){
                return true;
            }
        }
        System.out.println("Usuário ou senha inválidos!");
        return false;
    }
}
