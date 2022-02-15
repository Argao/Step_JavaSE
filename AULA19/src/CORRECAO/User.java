package CORRECAO;

import java.sql.SQLOutput;
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
        while(!senhaForte(pass)){
            System.out.println("Senha fraca");
            System.out.println("Precisa ter letra e número");
            Scanner get = new Scanner(System.in);

            System.out.print("Tente novamente: ");
            pass = get.nextLine();
        }
        this.pass = pass;
    }

    private boolean senhaForte(String pass){
        boolean temNumero = false, temCaractere = false;

        for(int i = 0 ; i < pass.length() ; i++){
            if(Character.isDigit(pass.charAt(i))){
                temNumero = true;
            } else if (!Character.isAlphabetic(pass.charAt(i))){
                temCaractere = true;
            }
        }
        return (temCaractere && temNumero);
    }

}
