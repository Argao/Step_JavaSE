package AULA.VIEW;

import AULA.CTRL.AlunoController;
import AULA.MODEL.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void menu(ArrayList<Aluno> alunos) {
        while (true) {
            Scanner get = new Scanner(System.in);
            int opcao = 0;

            System.out.println("=============================");
            System.out.println("====Escola do ze=====");
            System.out.println("=============================");
            System.out.println("(1)Cadastrar Alunos");
            System.out.println("(2)Menu de Impressão");
            System.out.println("(3)Excluir");
            System.out.println("(0)##SAIR##");
            System.out.print("Escolha uma opção: ");
            opcao = get.nextInt();

            switch (opcao) {
                case 1:
                    AlunoController.cadastrar(alunos);
                    break;
                case 2:
                    menuImpressao(alunos);
                    break;
                case 3:
                    AlunoController.excluiAlunos(alunos);
                    break;
                case 0:
                    System.exit(1);
                    break;
                default:
                    System.out.println("\n\nOpção inválida!\n\n");

            }

        }
    }

    public static void menuImpressao(ArrayList<Aluno> alunos) {
        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("=============================");
        System.out.println("====Relatorios=====");
        System.out.println("=============================");
        System.out.println("(1)Alunos maiores de idade");
        System.out.println("(2)Alunos menores de idade");
        System.out.println("(3)Alunos homens menores ");
        System.out.println("(4)Alunas mulheres menores ");
        System.out.println("(5) Aniversariantes do mês");
        System.out.println("(6) Aluno homem mais velho");
        System.out.println("(7) Aluno homem mais novo");
        System.out.println("(8) Aluna mulher mais velha");
        System.out.println("(9) Aluna mulher mais nova");
        System.out.println("(10) Turno da manhã");
        System.out.println("(11) Turno da tarde");
        System.out.println("(12) Turno da noite");
        System.out.println("(13) Menores de idade no turno da noite");

        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();




        switch (opcao) {
            case 1:
                AlunoController.alunosMaiores(alunos);
                break;
            case 2:
                AlunoController.alunosMenores(alunos);
                break;
            case 3:
                AlunoController.alunosMenoresMenino(alunos);
                break;
            case 4:
                AlunoController.alunasMenoresMenina(alunos);
                break;
            case 5:
                AlunoController.aniversariantesMes(alunos);
                break;
            case 6:
                AlunoController.masculinoVelho(alunos);
                break;
            case 7:
                AlunoController.masculinoNovo(alunos);
                break;
            case 8:
                AlunoController.femininaVelha(alunos);
                break;
            case 9:
                AlunoController.femininaNova(alunos);
                break;
            case 10:
                AlunoController.alunosManha(alunos);
                break;
            case 11:
                AlunoController.alunosTarde(alunos);
                break;
            case 12:
                AlunoController.alunosNoite(alunos);
                break;
            case 13:
                AlunoController.alunosNoiteMenores(alunos);
                break;
            default:
                System.out.println("\n\nOpção inválida!\n\n");

        }
    }
}

