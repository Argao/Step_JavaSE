package AULA.Controller;


import AULA.MODEL.Carro;

import java.util.Scanner;

public class CarroController extends Carro implements IVeiculo{

    @Override
    public void move() {
        if(this.isMove() && this.isLigado()){
            System.out.println("Parou");
            this.setMove(false);
        }else if(!this.isLigado()){
            System.out.println("Tá Desligado!");
        }else
            System.out.println("Se movendo!");
            this.setMove(true);
    }

    @Override
    public void liga() {
        if(this.isLigado()){
            System.out.println("Desligando!");
            this.setLigado(false);
        }else{
            System.out.println("Ligando!");
            this.setLigado(true);
        }
    }

    public void cadastra(){
        Scanner get = new Scanner(System.in);

        System.out.println("Modelo: ");
        this.setModelo(get.nextLine());

        System.out.println("Fabricante: ");
        this.setFabricante(get.nextLine());

        System.out.println("Ano: ");
        this.setAno(get.nextInt());

        System.out.println("Portas: ");
        this.setPortas(get.nextInt());

        System.out.println("Câmbio: ");
        this.setCambio(get.nextLine());

        System.out.println("\nCarro cadastrado com sucesso!\n");
    }

    public void imprime(){
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Fabricante: "+this.getFabricante());
        System.out.println("Ano: "+this.getAno());
        System.out.println("Portas: "+this.getPortas());
        System.out.println("Câmbio: "+this.getCambio());
    }
}
