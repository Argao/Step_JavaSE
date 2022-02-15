package DEVER.CONTROLLER;

import DEVER.MODEL.Pessoa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PessoaController extends Pessoa implements IPessoa {

    public PessoaController() {
    }

    public PessoaController(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }

    @Override
    public void cadastra() {
        Scanner get = new Scanner(System.in);

        System.out.println("Nome: ");
        super.setNome(get.nextLine());

        System.out.println("Sexo: ");
        super.setSexo(get.nextLine());

        forcaIdadeInt();

    }

    private void forcaIdadeInt(){//Força com que o usuario digite um valor inteiro para a idade
        Scanner get = new Scanner(System.in);

        try {
            System.out.println("Idade: ");
            super.setIdade(get.nextInt());
        }catch (InputMismatchException e){
            System.out.println("Erro! Digite apenas numeros para a idade.");
            forcaIdadeInt();
        }

    }


    @Override
    public void imprime() {
        System.out.println("Nome: " + super.getNome());
        System.out.println("Sexo: " + super.getSexo());
        System.out.println("Idade: " + super.getIdade());
    }


}
