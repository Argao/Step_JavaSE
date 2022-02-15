package DEVER.CTRL;

import DEVER.MODEL.Barco;


import java.util.ArrayList;
import java.util.Scanner;

public class BarcoController {
    public static void Cadastra(ArrayList<Barco> barcos){
        Scanner get = new Scanner(System.in);
        Barco b = new Barco();

        System.out.println("Cadastrar Barco");
        System.out.println("Modelo: ");
        b.setModelo(get.nextLine());
        System.out.println("Fabricante: ");
        b.setFabricante(get.nextLine());
        System.out.println("Ano: ");
        b.setAno(get.nextInt());
        System.out.println("Pes: ");
        b.setPes(get.nextInt());
        System.out.println("Preço: ");
        b.setPreco(get.nextDouble());

        barcos.add(b);
    }

    public static void imprime(Barco barco){
        System.out.println("Modelo: " + barco.getModelo());
        System.out.println("Fabricante: " + barco.getFabricante());
        System.out.println("Ano: " + barco.getAno());
        System.out.println("Pés: " + barco.getPes());
        System.out.println("Preço: R$" + barco.getPreco());
    }

    public static void testDrive(ArrayList<Barco> barcos){
        Scanner get = new Scanner(System.in);
        boolean continua = true;
        int n;
        for (int i = 0; i < barcos.size();i++){
            System.out.println("N° " + (i+1));
            imprime(barcos.get(i));
        }


        do {
            System.out.println("Escolha o N° dos barcos acima para fazer o teste.");
            n = get.nextInt() - 1;
            if (n > barcos.size()){
                System.out.println("Digite uma opção valida");
            }
        }while (n > barcos.size());

        while (continua){

            System.out.println("Teste drive menu");
            System.out.println("(1) Ligar/Desligar o Veiculo");
            System.out.println("(2) Andar/Parar ");
            System.out.println("(3) Sair");

            System.out.println("Escolha uma das opções: ");
            int opcao = get.nextInt();

            switch (opcao){
                case 1:
                    barcos.get(n).ligaDesliga();
                    break;
                case 2:
                    barcos.get(n).andaPara();
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
