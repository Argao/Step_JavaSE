package DEVER.VIEW;

import AULA.MODEL.Aluno;
import AULA.MODEL.Matricula;
import AULA.MODEL.Turma;
import DEVER.CTRL.PessoaController;
import DEVER.MODEL.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public static void menu(ArrayList<Pessoa> pessoas){
        while (true) {
            Scanner get = new Scanner(System.in);
            int opcao = 0;

            System.out.println("=============================");
            System.out.println("====Pessoas=====");
            System.out.println("=============================");
            System.out.println("(1)Cadastrar Pessoa");
            System.out.println("(2)Imprimir por ordem de idade");
            System.out.println("(0)##SAIR##");
            System.out.print("Escolha uma opção: ");
            opcao = get.nextInt();

            switch (opcao) {
                case 1:
                    PessoaController.cadastrar(pessoas);
                    break;
                case 2:
                    PessoaController.imprimePorIdade(pessoas);
                    break;
                case 0:
                    System.exit(1);
                    break;
                default:
                    System.out.println("\n\nOpção inválida!\n\n");
            }

        }
    }
}
