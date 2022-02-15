package AULA.VIEW;

import AULA.CTRL.AlunoController;
import AULA.CTRL.MatriculaController;
import AULA.CTRL.TurmaController;
import AULA.MODEL.Aluno;
import AULA.MODEL.Matricula;
import AULA.MODEL.Turma;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void menu(ArrayList<Aluno> alunos,
                            ArrayList<Turma> turmas,
                            ArrayList<Matricula> matriculas) {
        while (true) {
            Scanner get = new Scanner(System.in);
            int opcao = 0;

            System.out.println("=============================");
            System.out.println("====Escola do ze=====");
            System.out.println("=============================");
            System.out.println("(1)Menu de Cadastros");
            System.out.println("(2)Menu de Impressão");
            System.out.println("(3)Menu de Exclusão");
            System.out.println("(0)##SAIR##");
            System.out.print("Escolha uma opção: ");
            opcao = get.nextInt();

            switch (opcao) {
                case 1:
                    menuCadastro(alunos,turmas,matriculas);
                    break;
                case 2:
                    menuImpressao(alunos,turmas,matriculas);
                    break;
                case 3:
                    menuExclui(alunos,turmas);
                    break;
                case 0:
                    System.exit(1);
                    break;
                default:
                    System.out.println("\n\nOpção inválida!\n\n");

            }

        }
    }

    private static void menuCadastro(ArrayList<Aluno> alunos,
                                     ArrayList<Turma> turmas,
                                     ArrayList<Matricula> matriculas){
        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("=============================");
        System.out.println("====Cadastros=====");
        System.out.println("=============================");
        System.out.println("(1)Cadastrar Aluno");
        System.out.println("(2)Cadastrar Turma");
        System.out.println("(3)Cadastra Aluno na Turma ");
        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao){
            case 1:
                AlunoController.cadastrar(alunos);
                break;
            case 2:
                TurmaController.cadastrar(turmas);
                break;
            case 3:
                MatriculaController.cadastra(matriculas,alunos,turmas);
                break;
            default:
                System.out.println("\n\nOpção inválida!\n\n");

        }
    }

    private static void menuImpressao(ArrayList<Aluno> alunos,
                                      ArrayList<Turma> turmas,
                                      ArrayList<Matricula> matriculas) {
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
        System.out.println("(10) Alunos por turma");


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
                MatriculaController.AlunoTurma(matriculas);
                break;
            default:
                System.out.println("\n\nOpção inválida!\n\n");

        }
    }
    private static void menuExclui(ArrayList<Aluno> alunos,
                                   ArrayList<Turma> turmas){
        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("=============================");
        System.out.println("====Exclusão=====");
        System.out.println("=============================");
        System.out.println("(1)Excluir Aluno");
        System.out.println("(2)Excluir Turma");
        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao){
            case 1:
                AlunoController.excluir(alunos);
                break;
            case 2:
                TurmaController.excluir(turmas);
                break;
            default:
                System.out.println("\n\nOpção inválida!\n\n");

        }
    }
}

