package AULA.CTRL;

import AULA.MODEL.Aluno;
import AULA.MODEL.Matricula;
import AULA.MODEL.Turma;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MatriculaController {
    private static void imprime(Matricula matriculas){
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data: " + matriculas.getData().format(formatar));
        System.out.println("===========Aluno ");
        AlunoController.imprime(matriculas.getAluno());
        System.out.println("==========Turma");
        TurmaController.imprime(matriculas.getTurma());
    }

    public static void cadastra(ArrayList<Matricula> matriculas,
                                ArrayList<Aluno> alunos,
                                ArrayList<Turma> turmas){
        Scanner leia = new Scanner(System.in);
        Matricula matricula = new Matricula();

        System.out.println("======= Cadastro de Matrículas =======");
        System.out.println("==================Alunos==================");
        AlunoController.getAll(alunos);
        System.out.print("Qual aluno? Nº ");
        matricula.setAluno(alunos.get(leia.nextInt()-1));

        System.out.println("==================Turmas==================");
        TurmaController.getAll(turmas);
        System.out.print("Qual turma? Nº ");
        matricula.setTurma(turmas.get(leia.nextInt()-1));

        matriculas.add(matricula);

        System.out.println("\nMatrícula Nº " + matriculas.size() +" realizada!\n");
    }

    public static void AlunoTurma(ArrayList<Matricula> matriculas){
        ComparaMatricula compara  =  new ComparaMatricula();
        ArrayList<Matricula> aux = matriculas;

        Collections.sort(aux,compara);

        for(Matricula m : aux){
            imprime(m);
        }
    }

    public static void cadastra(ArrayList<Matricula> matriculas) {
    }
}

class ComparaMatricula implements Comparator<Matricula> {

    public int compare(Matricula x, Matricula y){
        return x.getAluno().getNome().compareTo(y.getAluno().getNome());
    }

}