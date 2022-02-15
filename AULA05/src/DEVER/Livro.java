package DEVER;

import java.util.Scanner;

public class Livro {
    private String nome, autor, genero;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {

        return preco;
    }

    public void setPreco(double preco) {
        while (preco < 0){
            System.out.println("O preço não pode ser menor que 0 !!!!");
            System.out.println("Digite o preço.");
            Scanner get = new Scanner(System.in);
            preco = get.nextDouble();

        }
        this.preco = preco;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Autor: " + this.autor);
        System.out.println("Genero: " + this.genero);
        System.out.println(String.format("Preço: (R$) %.02f", this.preco));

    }


}
