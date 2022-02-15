package TESTE.Controller;

import TESTE.Model.Aluno;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class AlunoController {
    public static void cadastra(ArrayList<Aluno> alunos){
        Scanner get = new Scanner(System.in);
        String nome, sexo;
        System.out.println("Digite o nome do aluno");
        nome = get.nextLine();

        System.out.println("Digite o sexo do aluno, m para masculino e f para feminino");
        sexo = get.nextLine();

        alunos.add(new Aluno(nome,sexo));
    }

    public static void maiores(ArrayList<Aluno> alunos){
        System.out.println("Alunos de maior: ");
        LocalDate hoje = LocalDate.now();
        for (int i =0; i < alunos.size();i++){
            if (ChronoUnit.YEARS.between(alunos.get(i).getData(),hoje) >= 18){
                imprime(alunos.get(i));
            }
        }
    }

    public static void menores(ArrayList<Aluno> alunos){
        LocalDate hoje = LocalDate.now();
        System.out.println("Alunos de menor: ");
        for (int i =0; i < alunos.size();i++){
            if (ChronoUnit.YEARS.between(alunos.get(i).getData(),hoje) < 18){
                imprime(alunos.get(i));
            }
        }

    }

    public static void menoresHomi(ArrayList<Aluno> alunos){
        LocalDate hoje = LocalDate.now();
        System.out.println("Alunos homi de menor: ");
        for (int i =0; i < alunos.size();i++){
            if (ChronoUnit.YEARS.between(alunos.get(i).getData(),hoje) < 18 && alunos.get(i).getSexo().equals("m")){
                imprime(alunos.get(i));
            }
        }
    }



    public static void menoresMuie(ArrayList<Aluno> alunos){
        LocalDate hoje = LocalDate.now();
        System.out.println("Alunos muie de menor: ");
        for (int i =0; i < alunos.size();i++){
            if (ChronoUnit.YEARS.between(alunos.get(i).getData(),hoje) < 18 && alunos.get(i).getSexo().equals("f")){
                imprime(alunos.get(i));
            }
        }
    }

    public static void aniversariantes(ArrayList<Aluno> alunos){
        LocalDate hoje = LocalDate.now();
        System.out.println("Aniversariantes do mês: ");
        for (int i = 0; i < alunos.size();i++){
            if (alunos.get(i).getData().getMonth() == hoje.getMonth()){
                imprime(alunos.get(i));
            }
        }
    }

    public static void homiMaisVeio(ArrayList<Aluno> alunos){
        Aluno maisVelho = new Aluno();
        for (int i = 0; i < alunos.size(); i++){
            if (alunos.get(i).getSexo().equals("m")){
                if (maisVelho.getNome() == null){
                    maisVelho = alunos.get(i);
                }else {
                    if (maisVelho.getData().isAfter(alunos.get(i).getData())){
                        maisVelho = alunos.get(i);
                    }
                }
            }
        }
        if (maisVelho.getNome() != null){
            System.out.println("O aluno homi mais velho é o: ");
            imprime(maisVelho);
        }

    }
    public static void homiMaisNovin(ArrayList<Aluno> alunos){
        Aluno maisNovo = new Aluno();
        for (int i = 0; i < alunos.size(); i++){
            if (alunos.get(i).getSexo().equals("m")){
                if (maisNovo.getNome() == null){
                    maisNovo = alunos.get(i);
                }else {
                    if (maisNovo.getData().isBefore(alunos.get(i).getData())){
                        maisNovo = alunos.get(i);
                    }
                }
            }
        }
        if (maisNovo.getNome() != null){
            System.out.println("O aluno homi  mais novo é o: ");
            imprime(maisNovo);
        }
    }

    public static void muieMaisVeia(ArrayList<Aluno> alunos){
        Aluno maisVelho = new Aluno();
        for (int i = 0; i < alunos.size(); i++){
            if (alunos.get(i).getSexo().equals("f")){
                if (maisVelho.getNome() == null){
                    maisVelho = alunos.get(i);
                    System.out.println(maisVelho.getNome());
                }else {
                    if (maisVelho.getData().isAfter(alunos.get(i).getData())){
                        maisVelho = alunos.get(i);
                        System.out.println(maisVelho.getNome());
                    }
                }
            }

        }
        if (maisVelho.getNome() != null){
            System.out.println("A aluna muie mais velha é a: ");
            imprime(maisVelho);
        }

    }
    public static void muieMaisNovinha(ArrayList<Aluno> alunos){
        Aluno maisNovo = new Aluno();
        for (int i = 0; i < alunos.size(); i++){
            if (alunos.get(i).getSexo().equals("f")){
                if (maisNovo.getNome() == null){
                    maisNovo = alunos.get(i);
                }else {
                    if (maisNovo.getData().isBefore(alunos.get(i).getData())){
                        maisNovo = alunos.get(i);
                    }
                }

            }
        }
        if (maisNovo.getNome() != null){
            System.out.println("A aluna muie mais nova é a: ");
            imprime(maisNovo);
        }


    }


    public static void imprime(Aluno aluno){
        DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("\nNome: " + aluno.getNome());
        System.out.println("Sexo: " + switchSexo(aluno.getSexo()));
        System.out.println("Data de nascimento: " + aluno.getData().format(formataData));
    }

    private static String switchSexo(String sexo) {
        switch (sexo) {
            case "m":
                return "Masculino";
            case "f":
                return "Feminino";
            default:
                return "Outro";
        }
    }


}
