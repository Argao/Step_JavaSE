package DEVER.Model;

import java.util.Scanner;

public class FuncionarioModel {
    private String nome, cargo, cpf;
    private int id;

    public FuncionarioModel(){}

    public FuncionarioModel(String nome, String cargo,String cpf,int id){
        this.setNome(nome);
        this.setCargo(cargo);
        this.setCpf(cpf);
        this.setId(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        while(nome.length() == 0){
            Scanner get = new Scanner(System.in);
            System.out.println("\n\nPrecisa digitar um nome.");
            System.out.print("Novo nome: ");
            nome = get.nextLine();
        }
        this.nome = nome;

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {

        while(cpf.length() != 14){
            Scanner get = new Scanner(System.in);
            System.out.print("\n\nCPF não válido.");
            System.out.println("Digite um cpf no formato xxx.xxx.xxx-xx.");
            cpf = get.nextLine();
        }
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        while(cargo.length() == 0){
            Scanner get = new Scanner(System.in);
            System.out.println("\n\nPrecisa digitar um cargo.");
            System.out.print("Novo cargo: ");
            cargo = get.nextLine();
        }

        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
