package CORRECAO.Controller;

import CORRECAO.MODEL.User;

import java.util.Scanner;

public class UserController extends User implements  IUser {
    public UserController(String login, String pass) {
        super(login, pass);
    }

    public UserController() {
    }

    @Override
    public void cadastra() {
        Scanner get = new Scanner(System.in);

        System.out.print("Login: ");
        super.setLogin(get.nextLine());

        System.out.println("Senha: ");
        super.setPass(get.nextLine());
    }
}
