package VIEW;

import SERVICES.Get;
import SERVICES.UserController;

import java.util.Scanner;

public class Menu {
    public static void principal(){
        while (true) {
            int opcao = 0;

            System.out.println("=============================");
            System.out.println("====SISTEMA=====");
            System.out.println("=============================");
            System.out.println("(1)Cadastrar");
            System.out.println("(2)Consultar");
            System.out.println("(0)##SAIR##");
            System.out.print("Escolha uma opção: ");
            opcao = Get.inteiro();

            switch (opcao) {
                case 1:
                    UserController.cadastra();
                    break;
                case 2:
                    consultar();
                    break;
                case 0:
                    System.exit(1);
                    break;
                default:
                    System.out.println("\n\nOpção inválida!\n\n");
            }
        }
    }

    private static void consultar(){
        int opcao = 0;
        System.out.println("=============================");
        System.out.println("====SISTEMA=====");
        System.out.println("=============================");
        System.out.println("(1)Consultar Todos");
        System.out.println("(2)Consultar por Nome");
        System.out.print("Escolha uma opção: ");
        opcao = Get.inteiro();


        switch (opcao) {
            case 1:
                UserController.getAll();
                break;
            case 2:
                UserController.getFullName();
                break;
            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }


    }

}
