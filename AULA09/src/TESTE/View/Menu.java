package TESTE.View;

import TESTE.Controller.AlunoController;
import TESTE.Model.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void menu(ArrayList<Aluno> alunos){

        while (true){
            Scanner get = new Scanner(System.in);
            System.out.println("Deseja cadastrar um novo aluno? 1 para sim e 2 para não");
            int opção = get.nextInt();
            if (opção ==2){
                break;
            }
            AlunoController.cadastra(alunos);

        }

        System.out.println("\n=============================\n");
        AlunoController.maiores(alunos);
        System.out.println("\n=============================\n");
        AlunoController.menores(alunos);
        System.out.println("\n=============================\n");
        AlunoController.menoresHomi(alunos);
        System.out.println("\n=============================\n");
        AlunoController.menoresMuie(alunos);
        System.out.println("\n=============================\n");
        AlunoController.aniversariantes(alunos);
        System.out.println("\n=============================\n");
        AlunoController.homiMaisVeio(alunos);
        System.out.println("\n=============================\n");
        AlunoController.homiMaisNovin(alunos);
        System.out.println("\n=============================\n");
        AlunoController.muieMaisVeia(alunos);
        System.out.println("\n=============================\n");
        AlunoController.muieMaisNovinha(alunos);



    }
}
