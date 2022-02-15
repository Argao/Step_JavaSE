package TEMA.View;

import TEMA.Controller.LivroController;
import TEMA.Model.LivroModel;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void principal(ArrayList<LivroModel> livros){
        while(0==0){
            Scanner get = new Scanner(System.in);
            int opcao = 0;

            System.out.println("=============================");
            System.out.println("====Biblioteca Municipal=====");
            System.out.println("=============================");
            System.out.println("(1)Cadastrar");
            System.out.println("(2)Consultar");
            System.out.println("(3)Excluir");
            System.out.println("(0)##SAIR##");
            System.out.print("Escolha uma opção: ");
            opcao = get.nextInt();

            switch (opcao){
                case 1://Cadastrar
                    cadastar(livros);
                    break;

                case 2://consultar
                    consulta(livros);
                    break;

                case 3: //excluir
                    excluir(livros);
                    break;
                case 0://sair
                    System.exit(1);
                    break;
                default:
                    System.out.println("\n\nOpção inválida!\n\n");
            }
        }//FIM  WHILE
    }//FIM PRINCIPAL

    public static void cadastar(ArrayList<LivroModel> livros){

        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("=======CADASTRO=========");
        System.out.println("(1)Livro");
        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao){
            case 1://Livro
                LivroController.cadastra(livros);
                break;

            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }

    }//fim cadastra

    public static void consulta(ArrayList<LivroModel> livros) {

        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("=======CONSULTAS=========");
        System.out.println("(1)Livro");
        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao) {
            case 1://Livro
                LivroController.imprime(livros);
                break;

            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }
    }//fim consulta

    public static void excluir(ArrayList<LivroModel> livros) {

        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("=======Exclusão=========");
        System.out.println("(1)Livro");
        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao) {
            case 1://Livro
                LivroController.exclui(livros);
                break;

            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }
    }//fim Excluir
}
