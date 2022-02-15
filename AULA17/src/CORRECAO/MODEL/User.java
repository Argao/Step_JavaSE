package CORRECAO.MODEL;

import java.util.Scanner;

public class User {
    private String login, pass;

    public User(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        while(pass.length()<8){
            Scanner get = new Scanner(System.in);
            System.out.println("Senha curta. Precisa de 8 caracteres!");
            System.out.print("Nova Senha: ");
            pass = get. nextLine();
        }
        this.pass = pass;
    }
}
