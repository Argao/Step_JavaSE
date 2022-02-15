package TEMA.Model;

import java.util.Scanner;

public class LivroModel {
    private String nome, autor, genero;
    private double preco;

    public LivroModel(){}

    public LivroModel(String nome,
                      String autor,
                      String genero,
                      double preco){
        this.setNome(nome);
        this.setAutor(autor);
        this.setGenero(genero);
        this.setPreco(preco);
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        while(autor.length() == 0){
            Scanner get = new Scanner(System.in);
            System.out.println("\n\nPrecisa digitar um nome.");
            System.out.print("Novo nome: ");
            autor = get.nextLine();
        }
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        while(genero.length() == 0){
            Scanner get = new Scanner(System.in);
            System.out.println("\n\nPrecisa digitar um gênero.");
            System.out.print("Novo gênero: ");
            genero = get.nextLine();
        }
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        while(preco < 0){
            Scanner get = new Scanner(System.in);
            System.out.println("\n\nPreço precisa ser positivo.");
            System.out.print("Novo preço: ");
            preco = get.nextDouble();
        }
        this.preco = preco;
    }
}
