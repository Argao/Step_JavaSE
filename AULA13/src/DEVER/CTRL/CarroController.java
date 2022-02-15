package DEVER.CTRL;

import DEVER.MODEL.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CarroController {
    public static void Cadastra(ArrayList<Carro> carros){
        Scanner get = new Scanner(System.in);
        Carro c = new Carro();

        System.out.println("Cadastrar Carro");
        System.out.println("Modelo: ");
        c.setModelo(get.nextLine());
        System.out.println("Fabricante: ");
        c.setFabricante(get.nextLine());
        System.out.println("Ano: ");
        c.setAno(get.nextInt());
        System.out.println("Cavalos: ");
        c.setCavalos(get.nextInt());
        System.out.println("Cambio: ");
        c.setCambio(get.nextLine());

        System.out.println("Preço: ");
        c.setPreco(get.nextDouble());

        carros.add(c);
    }

    public static void imprime(Carro carro){
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Fabricante: " + carro.getFabricante());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Cavalos: " + carro.getCavalos());
        System.out.println("Cambio: " + carro.getCambio());
        System.out.println("Preço: R$" + carro.getPreco());
    }

    public static void testDrive(ArrayList<Carro> carros){
        Scanner get = new Scanner(System.in);
        boolean continua = true;
        int n;
        for (int i = 0; i < carros.size();i++){
            System.out.println("N° " + (i+1));
            imprime(carros.get(i));
        }


        do {
            System.out.println("Escolha o N° de um dos carros acima para fazer o teste.");
            n = get.nextInt() - 1;
            if (n > carros.size()){
                System.out.println("Digite uma opção valida");
            }
        }while (n > carros.size());

        while (continua){

            System.out.println("Teste drive menu");
            System.out.println("(1) Ligar/Desligar o Veiculo");
            System.out.println("(2) Andar/Parar ");
            System.out.println("(3) Sair");

            System.out.println("Escolha uma das opções: ");
            int opcao = get.nextInt();

            switch (opcao){
                case 1:
                    carros.get(n).ligaDesliga();
                    break;
                case 2:
                    carros.get(n).andaPara();
                    break;
                case 3:
                    continua = false;
                    break;
                default:
                    System.out.println("Escolha uma opção valida!");

            }
        }

    }
}
