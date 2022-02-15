package DEVER_AULA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        Pessoa [] lista =  new Pessoa[4];

        for(int i = 0; i < lista.length ; i++){
            //FORMA 2 em comentários
            //Pessoa[i] =  new Pessoa();
            System.out.println("SISTEMA DE CADASTRO");
            System.out.print("Nome: ");
            String nome =  get.nextLine();
            //Pessoa[i].nome = get.nextLine();

            System.out.print("idade: ");
            int idade =  get.nextInt();
            //Pessoa[i].idade = get.nextInt();

            System.out.print("Altura: ");
            double altura =  get.nextDouble();
            //Pessoa[i].altura = get.nextDouble();

            System.out.print("Peso: ");
            double peso =  get.nextDouble();
            //Pessoa[i].peso = get.nextDouble();

            get.nextLine();
            lista[i] = new Pessoa(nome,idade,peso,altura);
        }

        System.out.println("Pessoas Cadastradas\n+++++++++++++++++++++\n\n");
        for(int i = 0 ; i < lista.length ; i++){
            System.out.println("Nome: \t\t" + lista[i].nome);
            System.out.println("Idade: \t\t"  + lista[i].idade);
            System.out.println("Peso: \t\t" + lista[i].peso);
            System.out.println("Altura: \t" + lista[i].altura);
            System.out.println("+++++++++++++++++++++++++++++");

        }

    }
}

class Pessoa{
    String nome;
    int idade;
    double peso, altura;

    Pessoa(String _nome, int _idade, double _peso, double _altura ){
        this.nome = _nome;
        this.idade = _idade;
        this.peso = _peso;
        this.altura = _altura;
    }
    Pessoa(){}

}
