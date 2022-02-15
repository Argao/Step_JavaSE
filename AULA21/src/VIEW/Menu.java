package VIEW;

import MODEL.User;
import SERVICES.Get;
import SERVICES.UserController;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void inicio(User u){
        System.out.println("=====ENTRAR NO SISTEMA======");
        while (true) {
            System.out.print("Login: ");
            String login = Get.texto();
            System.out.print("Senha: ");
            String senha = Get.texto();

            if (UserController.login(login,senha,u)){
                sistema(u);
                break;
            }else {
                System.out.println("Usuario ou senha incorretos!!\nTente novamente!");
            }

        }
    }
    private static void sistema(User u){
        while(0==0){
            System.out.println("\n\n++++++++++++++++++++++++++++");
            System.out.println("+++++++++Sistema++++++++++");
            System.out.println("++++++++++++++++++++++++++++");
            System.out.println("(0)SAIR");
            System.out.println("(1)CADASTRAR");
            System.out.println("(2)CONSULTAR");
            System.out.println("(3)TROCAR SENHA");
            System.out.print("\nDigite uma opção: nº");
            int op = Get.inteiro();

            switch(op){
                case 0: System.exit(1);
                case 1: cadastrar(); break;
                case 2: consultar(); break;
                case 3: trocarSenha(u); break;
                default: System.out.println("\nOpção inválida!\n");
            }
        }
    }
    private static void trocarSenha(User u){
        System.out.println("\nDigite sua senha atual: ");
        String senhaAtual = Get.texto();

        if (senhaAtual.equals(u.getPass())){
            while (true){
                System.out.println("Digite a nova senha: ");
                String senha1 = Get.texto();
                System.out.println("Digite novamente a nova senha");
                String senha2 = Get.texto();

                if (senha1.equals(senha2)){
                    UserController.atualizaSenha(senha1);
                    break;
                }else {
                    System.out.println("As senha digitadas não batem");
                    System.out.println("Digite novamente a senha.");
                }
            }

        }else{
            System.out.println("A senha digitada não corresponde com a senha do usuario!");
        }
    }
    private static void cadastrar(){
        System.out.println("\n++++CADASTRO DE USUÁRIOS++++");
        UserController.cadastra();
        System.out.println("\nUSUÁRIO CADASTRADO COM SUCESSO!\n");
    }

    private static void consultar(){
        System.out.println("=====CONSULTAS======");
        System.out.println("(1)Todos os usuários");
        System.out.println("(2)Usuários por nome");
        System.out.print("Digite a opção desejada: nº");
        int op = Get.inteiro();

        switch (op){
            case 1 : UserController.getAll(); break;
            case 2 : consultarUsuarioPorNome(); break;
        }
    }

    private static void consultarUsuarioPorNome(){
        System.out.print("\nQual o nome procurado? ");
        String a = Get.texto();

        System.out.println("\nResultado sem arraylist\n");
        UserController.getPorNome(a);

        System.out.println("\n\n===========================\n");
        System.out.println("Resultado por ArrayList");
        System.out.println("---------------------------");

        ArrayList<User> lista = UserController.getListaPorNome(a);

        for(User u : lista){
            System.out.println("ID: " + u.getUserid());
            System.out.println("Login: " + u.getUserName());
            System.out.println("Senha: " + u.getPass());
            System.out.println("Nome completo: " + u.getFullName());
            System.out.println("-----------------------------------");
        }
    }
}
