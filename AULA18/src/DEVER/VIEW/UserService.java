package DEVER.VIEW;

import DEVER.CONTROLLER.UserController;

import java.io.*;
import java.util.ArrayList;

public class UserService {

    public static void cadUser() throws IOException {
        UserController user = new UserController();
        System.out.println("==CADASTRANDO USUÁRIO==");
        user.cadastra();

        FileWriter file = new FileWriter("c:\\SAIDAJAVA\\usuarios.dat",true);
        BufferedWriter buff = new BufferedWriter(file);

        buff.write(user.getLogin() + ";" + user.getSenha() + "\n");

        buff.close();

        System.out.println("Usuário Cadastrado com Sucesso!");
    }

    public static boolean login(String login, String senha) throws IOException {
        ArrayList<UserController> users = new ArrayList<>();

        if (login.equals("root") && senha.equals("root123")){
            return true;
        }

        FileReader file = new FileReader("c:\\SAIDAJAVA\\usuarios.dat");
        BufferedReader buff = new BufferedReader(file);

        String row = "";
        while((row = buff.readLine()) != null){
            String[] aux = row.split(";");
            users.add(new UserController(aux[0],aux[1]));
        }

        for(UserController u : users){
            if(u.getLogin().equalsIgnoreCase(login) && u.getSenha().equals(senha)){
                return true;
            }
        }
        System.out.println("Usuário ou senha inválidos!");
        return false;
    }


}
