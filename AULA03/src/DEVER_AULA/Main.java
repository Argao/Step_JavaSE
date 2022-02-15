package DEVER_AULA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantas pessoas você deseja cadastrar: ");
        int nCadastros = scan.nextInt();
        Pessoa[] pessoas = new Pessoa[nCadastros];

        for (int i = 0; i < pessoas.length;i++ ){

            System.out.println("Digite o nome da pessoa "+ (i+1) + ": ");
            scan.nextLine();
            String nome = scan.nextLine();
            System.out.println("Digite a idade da pessoa "+ (i+1) + ": ");
            int idade = scan.nextInt();
            System.out.println("Digite o peso da pessoa "+ (i+1) +": ");
            double peso = scan.nextDouble();
            System.out.println("Digite a altura da pessoa "+ (i+1) +": ");
            double altura = scan.nextDouble();

            pessoas[i] = new Pessoa(nome,idade,peso,altura);

        }

        for (int i = 0;i< pessoas.length;i++){
            System.out.println("Pessoa " + (i+1));
            System.out.println("\tNome: \t" + pessoas[i].nome);
            System.out.println("\tIdade: \t" + pessoas[i].idade);
            System.out.println("\tPeso: \t" + pessoas[i].peso );
            System.out.println("\tAltura: " + pessoas[i].altura );
        }


    }
}
