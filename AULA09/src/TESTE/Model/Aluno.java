package TESTE.Model;


import java.time.LocalDate;
import java.util.Scanner;

public class Aluno {
    private String nome,sexo;
    LocalDate data;

    public Aluno(){}

    public Aluno(String nome, String sexo) {
        this.setNome(nome);
        this.setSexo(sexo);
        setData(this.data);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        Scanner get = new Scanner(System.in);
        System.out.println("Digite o dia do mes do nascimento : ");
        int dia = get.nextInt();
        System.out.println("Digite o mes do nascimento: ");
        int mes = get.nextInt();
        System.out.println("Digite o ano do nascimento : ");
        int ano = get.nextInt();

        data = LocalDate.of(ano,mes,dia);
        this.data = data;
    }
}
