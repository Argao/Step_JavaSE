package DEVER.CONTROLLER;

import DEVER.MODEL.NaoDoador;

import java.util.Scanner;

public class NaoDoadorController extends NaoDoador implements PessoaInterface {

    public NaoDoadorController(String nome, String cpf, String telefone, String sangue) {
        super(nome, cpf, telefone, sangue);
    }

    public NaoDoadorController() {
    }

    @Override
    public void cadastra() {
        Scanner get = new Scanner(System.in);
        System.out.println("\n-----Cadastrar não Doador-----\n");

        System.out.println("Nome:");
        this.setNome(get.nextLine());

        System.out.println("CPF:");
        this.setCpf(get.nextLine());

        System.out.println("Tel:");
        this.setTelefone(get.nextLine());

        System.out.println("Tipo Sanguíneo");
        this.setSangue(get.nextLine());
    }

    @Override
    public void imprime() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Tel: " + this.getTelefone());
        System.out.println("Tipo Sanguíneo: " + this.getSangue());
    }
}
