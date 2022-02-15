package DEVER.CONTROLLER;

import DEVER.MODEL.User;

import java.util.Scanner;

public class UserController extends User implements IUser {
    public UserController(String login, String senha) {
        super(login, senha);
    }
    public  UserController(){
        super();
    };

    @Override
    public void cadastra() {
        Scanner get = new Scanner(System.in);

        System.out.println("Login: ");
        super.setLogin(get.nextLine());
        System.out.println("Senha: ");
        super.setSenha(get.nextLine());

    }
}
