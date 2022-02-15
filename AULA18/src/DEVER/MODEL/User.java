package DEVER.MODEL;

import DEVER.ERROS.SenhaFraca;

import java.util.Scanner;

public class User {
    private String login,senha;

    public User(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    public User(){}


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {

        return senha;
    }

    public void setSenha(String senha) {
        while (true){
            if (!testaSenha(senha)){
                try {
                    throw new SenhaFraca();
                } catch (SenhaFraca senhaFraca ) {
                    System.out.println(senhaFraca);
                }

                Scanner get = new Scanner(System.in);
                System.out.println("Digite uma senha contendo pelo menos 1 numero e 1 caractere especial: ");
                senha = get.nextLine();

            }else {
                this.senha = senha;
                break;
            }
        }

    }

    private static boolean testaSenha(String senha){
        boolean numero = false, especial = false;
        for (int i = 0; i < senha.length(); i++) {
            if (Character.isDigit(senha.charAt(i))){
                numero = true;
            }else if (!Character.isAlphabetic(senha.charAt(i))){
                especial = true;
            }
        }
        if (numero && especial){
            return true;
        }
        return  false;
    }



}
