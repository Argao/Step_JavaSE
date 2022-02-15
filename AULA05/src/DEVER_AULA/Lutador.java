package DEVER_AULA;

import java.util.Scanner;

public class Lutador {
    private String nome;
    private int sexo;
    private double altura, peso;
    private int idade;

    public Lutador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        if (sexo == 1) {
            return "Feminino";
        }
        return "Masculino";
    }

    public void setSexo(String sexo) {
        if (sexo.equalsIgnoreCase("feminino"))
            this.sexo = 1;
        else
            this.sexo = 0;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {

        while (altura < 0) {
            System.out.println("\nAltura inválida. Altura não pode ser menor que 0(zero).");
            System.out.print("Digite uma nova altura: ");
            Scanner get = new Scanner(System.in);
            altura = get.nextDouble();
        }

        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        while (peso < 0) {
            System.out.println("\nPeso inválido. Peso não pode ser menor que 0(zero).");
            System.out.print("Digite uma novo peso: ");
            Scanner get = new Scanner(System.in);
            peso = get.nextDouble();
        }
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        while (idade < 0) {
            System.out.println("\nIdade inválida. Idade não pode ser menor que 0(zero).");
            System.out.print("Digite uma nova idade: ");
            Scanner get = new Scanner(System.in);
            idade = get.nextInt();
        }

        this.idade = idade;
    }

    public void imprime(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Altura: " + this.getAltura() + "m");
        System.out.println("Peso: " + this.getPeso() + "Kg");

    }

    public void getMulherMenor(){
        if(idade < 18 && sexo == 1){
            this.imprime();
        }
    }

    public void getMulher(){
        if(sexo == 1){
            this.imprime();
        }
    }

    public void getHomemMenor(){
        if(idade < 18 && sexo == 0){
            this.imprime();
        }
    }

    public void getHomem(){
        if(sexo == 0){
            this.imprime();
        }
    }
}
