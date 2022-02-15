package DEVER.Model;

import java.util.Scanner;

public class ClienteModel {
    private String nome,cpf,email,endereco;
    private int id;


    public ClienteModel(){}

    public ClienteModel(String nome, String cpf,String email, String endereco,int id){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setEndereco(endereco);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        while(email.length() == 0){
            Scanner get = new Scanner(System.in);
            System.out.println("\n\nPrecisa digitar um email.");
            System.out.print("Novo email: ");
            email = get.nextLine();
        }
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        while(endereco.length() == 0){
            Scanner get = new Scanner(System.in);
            System.out.println("\n\nPrecisa digitar um nome.");
            System.out.print("Novo nome: ");
            endereco = get.nextLine();
        }
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
