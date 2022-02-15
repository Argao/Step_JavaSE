package VIEW;

import MODEL.User;
import SERVICES.Get;
import SERVICES.UserController;

import java.util.ArrayList;

public class Menu {

    private static void inicio(User u){
        System.out.println(u.getPermissao());
        if (u.getPermissao() == 1){
            while(0==0){
                System.out.println("\n\n++++++++++++++++++++++++++++");
                System.out.println("+++++++++Cadastro++++++++++");
                System.out.println("++++++++++++++++++++++++++++");
                System.out.println("(0)SAIR");
                System.out.println("(1)CADASTRAR");
                System.out.println("(2)CONSULTAR");
                System.out.println("(3)DELETAR");
                System.out.println("(4)ALTERAR SENHA");
                System.out.print("Digite uma opção: nº");
                int op = Get.inteiro();

                switch(op){
                    case 0: System.exit(1);
                    case 1: cadastrar(); break;
                    case 2: consultar(); break;
                    case 3: deletar(); break;
                    case 4: alterarsenha(u); break;
                    default: System.out.println("\nOpção inválida!\n");
                }
            }
        }else{
            while(0==0){
                System.out.println("\n\n++++++++++++++++++++++++++++");
                System.out.println("+++++++++Cadastro++++++++++");
                System.out.println("++++++++++++++++++++++++++++");
                System.out.println("(0)SAIR");
                System.out.println("(1)ALTERAR SENHA");
                System.out.print("Digite uma opção: nº");
                int op = Get.inteiro();

                switch(op){
                    case 0: System.exit(1);
                    case 1: alterarsenha(u); break;
                    default: System.out.println("\nOpção inválida!\n");
                }
            }
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

    private static void deletar(){
        System.out.println("----------DELETAR USUÁRIO------------");
        UserController.deleta();
    }

    public static void login(){
        while(true){
            User user = UserController.login();
            if(user != null){
                inicio(user);
            }else{
                System.out.println("\nUsuário ou senha inválidos!\n");
            }
        }
    }

    private static void alterarsenha(User user){
        System.out.println("//////////////TROCA DE SENHA/////////////");
        UserController.alterarSenha(user);
    }
}
