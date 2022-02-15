package AULA.MODEL;

import java.util.Scanner;

public abstract class Veiculo {
    private String fabricante, modelo;
    private int ano, tipo;
    private double preco;
    private boolean ligado, move;
    
    protected Veiculo(String fabricante, String modelo, int ano, int tipo, double preco) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = tipo;
        this.preco = preco;
        this.ligado = false;
        this.move = false;
    }

    protected Veiculo() {
    }

    protected String getFabricante() {
        return fabricante;
    }

    protected void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    protected String getModelo() {
        return modelo;
    }

    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    protected int getAno() {
        return ano;
    }

    protected void setAno(int ano) {
        this.ano = ano;
    }

    protected String getTipo() {
        String retorno = "";
        switch (this.tipo){
            case 1:
                retorno = "Carro";
                break;
            case 2:
                retorno =  "Moto";
                break;
            case 3:
                retorno = "Barco";
                break;
        }
        return retorno;
    }

    protected void setTipo(int tipo) {
        Scanner get =  new Scanner(System.in);

        while(tipo < 1 || tipo >3){
            System.out.println("Tipo inválido!");
            System.out.println("(1)Carro");
            System.out.println("(2)Moto");
            System.out.println("(3)Barco");
            System.out.println("Tipo nº ");
            tipo = get.nextInt();
        }
        this.tipo = tipo;
    }

    protected double getPreco() {
        return preco;
    }

    protected void setPreco(double preco) {
        this.preco = preco;
    }

    protected boolean isLigado() {
        return ligado;
    }

    protected void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    protected boolean isMove() {
        return move;
    }

    protected void setMove(boolean move) {
        this.move = move;
    }
}
