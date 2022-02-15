package DEVER.Model;

public class Fruta {
    private String nome;
    private Double preco;


    public Fruta(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Fruta() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
