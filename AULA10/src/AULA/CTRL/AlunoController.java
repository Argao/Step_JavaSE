package AULA.CTRL;

import AULA.MODEL.Aluno;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class AlunoController {
    private static void imprime(Aluno a){
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Nome: " + a.getNome());
        System.out.println("Sexo: " + a.getSexo());
        System.out.println("Nascimento: " + formatar.format(a.getNascimento()));
        System.out.println();

    }

    public static void cadastrar (ArrayList<Aluno> alunos){
        Scanner leia = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("++++Cadastro de alunos++++");
        System.out.print("Nome: ");
        a.setNome(leia.nextLine());

        System.out.print("Sexo: ");
        a.setSexo(leia.nextLine());

        System.out.print("Nascimento (dia/mês/ano): ");
        a.setNascimento(leia.nextLine());

        System.out.println("Turno: ");
        a.setTurno(leia.nextLine());

        alunos.add(a);
        System.out.println("\nCadastro realizado com sucesso!\n");
    }

    public static void alunosMaiores(ArrayList<Aluno> alunos){
        System.out.println("===ALUNOS MAIORES DE IDADE===\n");

        for(int i = 0 ; i < alunos.size() ; i++){
            Period periodo = Period.between(alunos.get(i).getNascimento(), LocalDate.now());
            if(periodo.getYears() >= 18){
                imprime(alunos.get(i));
            }
        }
    }

    public static void alunosMenores(ArrayList<Aluno> alunos){
        System.out.println("===ALUNOS MENORES DE IDADE===\n");

        for(int i = 0 ; i < alunos.size() ; i++){
            Period periodo = Period.between(alunos.get(i).getNascimento(), LocalDate.now());
            if(periodo.getYears() < 18){
                imprime(alunos.get(i));
            }
        }
    }

    public static void alunosMenoresMenino(ArrayList<Aluno> alunos){
        System.out.println("===ALUNOS MENORES DE IDADE MASCULINO===\n");

        for(int i = 0 ; i < alunos.size() ; i++){
            Period periodo = Period.between(alunos.get(i).getNascimento(), LocalDate.now());
            if(periodo.getYears() < 18 &&
                alunos.get(i).getSexo().toLowerCase().startsWith("m")){
                imprime(alunos.get(i));
            }
        }
    }
    public static void alunasMenoresMenina(ArrayList<Aluno> alunos){
        System.out.println("===ALUNAS MENORES DE IDADE===\n");

        for(int i = 0 ; i < alunos.size() ; i++){
            Period periodo = Period.between(alunos.get(i).getNascimento(), LocalDate.now());
            if(periodo.getYears() < 18 &&
                    alunos.get(i).getSexo().toLowerCase().startsWith("f")){
                imprime(alunos.get(i));
            }
        }
    }

    public static void aniversariantesMes(ArrayList<Aluno> alunos){
        System.out.println("===Aniversariantes do Mês===\n");

        for(int i = 0 ; i < alunos.size() ; i++){
            if(alunos.get(i).getNascimento().getMonth() ==
                LocalDate.now().getMonth()){
                imprime(alunos.get(i));
            }
        }
    }

    public static void masculinoVelho(ArrayList<Aluno> alunos){
        System.out.println("===Homem mais velho===");
        Aluno a = new Aluno();

        for(int i = 0 ; i < alunos.size();i++){
            if(alunos.get(i).getSexo().toLowerCase().startsWith("m")){
                if(a.getNome() == null){
                    a = alunos.get(i);
                } else {
                    if(a.getNascimento().isAfter(alunos.get(i).getNascimento())){
                        a = alunos.get(i);
                    }
                }
            }
        }
        imprime(a);
    }

    public static void femininaVelha(ArrayList<Aluno> alunos){
        System.out.println("===Mulher mais velha===");
        Aluno a = new Aluno();

        for(int i = 0 ; i < alunos.size();i++){
            if(alunos.get(i).getSexo().toLowerCase().startsWith("f")){
                if(a.getNome() == null){
                    a = alunos.get(i);
                } else {
                    if(a.getNascimento().isAfter(alunos.get(i).getNascimento())){
                        a = alunos.get(i);
                    }
                }
            }
        }
        imprime(a);
    }

    public static void masculinoNovo(ArrayList<Aluno> alunos){
        System.out.println("===Homem mais novo===");
        Aluno a = new Aluno();

        for(int i = 0 ; i < alunos.size();i++){
            if(alunos.get(i).getSexo().toLowerCase().startsWith("m")){
                if(a.getNome() == null){
                    a = alunos.get(i);
                } else {
                    if(a.getNascimento().isBefore(alunos.get(i).getNascimento())){
                        a = alunos.get(i);
                    }
                }
            }
        }
        imprime(a);
    }

    public static void femininaNova(ArrayList<Aluno> alunos){
        System.out.println("===Mulher mais novo===");
        Aluno a = new Aluno();

        for(int i = 0 ; i < alunos.size();i++){
            if(alunos.get(i).getSexo().toLowerCase().startsWith("f")){
                if(a.getNome() == null){
                    a = alunos.get(i);
                } else {
                    if(a.getNascimento().isAfter(alunos.get(i).getNascimento())){
                        a = alunos.get(i);
                    }
                }
            }
        }
        imprime(a);
    }

    public static void excluiAlunos(ArrayList<Aluno> alunos){


        if(alunos.isEmpty()){
            System.out.println("\n\nLISTA VAZIA\n\n");
        }else{

            Scanner get = new Scanner(System.in);

            System.out.println("\nEscolha o aluno que deseja excluir:\n");

            for (int i = 0; i < alunos.size(); i++){
                System.out.println("Nº " + (i+1));
                imprime(alunos.get(i));
            }

            System.out.print("Qual aluno deseja excluir? Nº ");
            int index = get.nextInt()-1;

            alunos.remove(index);
            System.out.println("\nExluído com Sucesso\n");
        }
    }

    public static void alunosManha(ArrayList<Aluno> alunos){
        System.out.println("===Turno da manhã===");

        for (Aluno a : alunos){
            if (a.getTurno().toLowerCase().startsWith("m")){
                imprime(a);
            }
        }
    }

    public static void alunosTarde(ArrayList<Aluno> alunos){
        System.out.println("===Turno da tarde===");

        for (Aluno a : alunos){
            if (a.getTurno().toLowerCase().startsWith("t")){
                imprime(a);
            }
        }
    }

    public static void alunosNoite(ArrayList<Aluno> alunos){
        System.out.println("===Turno da noite===");

        for (Aluno a : alunos){
            if (a.getTurno().toLowerCase().startsWith("n")){
                imprime(a);
            }
        }
    }

    public static void alunosNoiteMenores(ArrayList<Aluno> alunos){
        System.out.println("===Menores de idade noite===");

        for (Aluno a : alunos){
            Period periodo = Period.between(a.getNascimento(), LocalDate.now());
            if (a.getTurno().toLowerCase().startsWith("n") && periodo.getYears() < 18){
                imprime(a);
            }
        }
    }


    public void teste(ArrayList<Aluno> alunos){
        for(int i = 0 ; i < alunos.size() ; i++){
            Aluno a = alunos.get(i);
            Period periodo = Period.between(a.getNascimento(), LocalDate.now());
            if(periodo.getYears() >= 18){
                imprime(a);
            }
        }

        for(Aluno a : alunos){
            Period periodo = Period.between(a.getNascimento(), LocalDate.now());
            if(periodo.getYears() >= 18){
                imprime(a);
            }
        }

        Iterator<Aluno> iterator = alunos.iterator();
        Aluno aluno;

        while(iterator.hasNext()){
            aluno = iterator.next();
            imprime(aluno);
            if(!iterator.hasNext()){
                System.out.println("</table>");
            }
        }

    }
}


