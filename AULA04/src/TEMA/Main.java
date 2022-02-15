package TEMA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro c1 =  new Carro();

        c1.setModelo("Monza");
        c1.setAno(1986);
        c1.setCor("branco");

        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Ano: " + c1.getAno());
        System.out.println("Cor: " + c1.getCor());

        c1.imprime();
        //Possibilite cadastrar 5 carros e imprima ao final
        //todos os carros, carros anteriores à 2016, carros após 2016

        Carro[] carros = new Carro[5];
        System.out.println("\n\n===================\n");
        for(int i = 0 ; i < carros.length ; i++){
            Scanner get = new Scanner(System.in);
            carros[i] = new Carro();

            System.out.print("Modelo: ");
            carros[i].setModelo(get.nextLine());

            System.out.print("Cor: ");
            carros[i].setCor(get.nextLine());

            System.out.print("Ano: ");
            carros[i].setAno(get.nextInt());
        }
        System.out.println("\n\n======================Todos os carros");
        for(int i = 0 ; i< carros.length ; i++){
            carros[i].imprime();
        }

        System.out.println("\n\n======================<2016");
        for(int i = 0 ; i< carros.length ; i++){
            carros[i].getByToAno(2016);
        }

        System.out.println("\n\n======================<2016");
        for(int i = 0 ; i< carros.length ; i++){
            carros[i].getByAno(2016);
        }
    }
}

class Carro {
    private String modelo, cor;
    private int ano;
    public Carro(){}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void imprime(){
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Cor: " + this.getCor());
    }

    public void getByToAno(int ano){
        if(this.ano <= ano){
            this.imprime();
        }
    }

    public void getByAno(int ano){
        if(this.ano >= ano){
            this.imprime();
        }
    }

}
