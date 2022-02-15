package AULA.CTRL;

import AULA.MODEL.Turma;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class TurmaController {
    static void imprime(Turma a){
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Nome: " + a.getNome());
        System.out.println("Turno: " + a.getTurno());
        System.out.println("Início: " + formatar.format(a.getInicio()));
        if(a.getFim() != null)
            System.out.println("Fim: " + formatar.format(a.getFim()));
        else
            System.out.println("Fim: EM ANDAMENTO");

    }

    public static void cadastrar (ArrayList<Turma> turmas){
        Scanner leia = new Scanner(System.in);
        Turma a = new Turma();

        System.out.println("++++Cadastro de Turmas++++");
        System.out.print("Nome: ");
        a.setNome(leia.nextLine());

        System.out.print("Turno: ");
        a.setTurno(leia.nextLine());

        System.out.print("Início (dia/mês/ano): ");
        a.setInicio(leia.nextLine());

        turmas.add(a);
        System.out.println("\nCadastro realizado com sucesso!\n");
    }

    public static void excluir(ArrayList<Turma> turmas){
        Scanner leia = new Scanner(System.in);
        int index = 1;

        System.out.println("\n---EXCLUIR TURMA---\n");
        for(int i = 0 ; i < turmas.size() ; i++){
            System.out.println("Nº " + (i+1));
            imprime(turmas.get(i));
            System.out.println("============================");
        }

        System.out.println("Qual turma deseja excluir: Nº" );
        index =  leia.nextInt()-1;

        turmas.remove(index);
        System.out.println("\nTurma excluído com sucesso!\n");
    }

    public static void atualiza(ArrayList<Turma> turmas){
        Scanner leia = new Scanner(System.in);
        int index = 1;

        System.out.println("\n---ATUALIZA TURMA---\n");
        for(int i = 0 ; i < turmas.size() ; i++){
            System.out.println("Nº " + (i+1));
            imprime(turmas.get(i));
            System.out.println("============================");
        }

        System.out.println("Qual turma deseja atualizar: Nº" );
        index =  leia.nextInt()-1;

        System.out.println("A turma escolhida foi: ");
        imprime(turmas.get(index));
        System.out.println("É possível definir apenas a data de encerramento.");
        System.out.println("Digite a data final (dd/mm/aaaa), ou 0 para CANCELAR: ");
        String recebe = leia.nextLine();

        if(recebe.equals("0")){
            System.out.println("\nAtualização cancelada!\n");
        }else{
            turmas.get(index).setFim(recebe);
            System.out.println("\nAtualização realizada!\n");
        }
    }

    public static void getAll(ArrayList<Turma> turmas){
        System.out.println("========Relatório Geral=========");
        for(int i = 0 ; i < turmas.size() ; i++){
            System.out.println("Nº " + (i+1));
            imprime(turmas.get(i));
            System.out.println("============================");
        }
    }

}
