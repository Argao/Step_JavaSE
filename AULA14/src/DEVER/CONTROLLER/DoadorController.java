package DEVER.CONTROLLER;

import DEVER.MODEL.Doador;

import java.util.ArrayList;
import java.util.Scanner;

public class DoadorController extends Doador implements PessoaInterface {


    @Override
    public void cadastra() {
        Scanner get = new Scanner(System.in);
        System.out.println("\n-----Cadastrar doador-----\n");

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
