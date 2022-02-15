package CORRECAO.VIEW;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void inicial() {
        Scanner get = new Scanner(System.in);
        System.out.println("=====SISTEMA DE CADASTROS======");
       while(true){
           System.out.print("Login: ");
           String login = get.nextLine();
           System.out.print("Senha: ");
           String senha = get.nextLine();
            try{
                if(UserService.login(login,senha)){
                    cadastro();
                }
            }catch (java.io.IOException e){
                System.out.println("Deu ruim");
            }

       }
    }
    public static void cadastro() throws IOException {
        while(true){
            System.out.println("=== SISTEMA DE CADASTRO ==");
            System.out.println("(0) #SAIR#");
            System.out.println("(1) Cadastrar");
            System.out.print("Escolha uma opção: nº ");
            Scanner get = new Scanner(System.in);
            int op = get.nextInt();

            switch (op){
                case 0:
                    System.exit(0);
                case 1:
                    UserService.cadUser();
                    break;
            }
        }

    }
}
