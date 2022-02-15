package DEVER.CTRL;

import DEVER.MODEL.Barco;


import java.util.ArrayList;
import java.util.Scanner;

public class BarcoController {
    public static void Cadastra(ArrayList<Barco> barcos){
        Scanner get = new Scanner(System.in);
        Barco b = new Barco();

        System.out.printf("Cadastrar Barco\n");
        System.out.printf("Modelo: \n");
        b.setModelo(get.nextLine());
        System.out.printf("Fabricante: \n");
        b.setFabricante(get.nextLine());
        System.out.printf("Ano: \n");
        b.setAno(get.nextInt());
        System.out.printf("Pes: \n");
        b.setPes(get.nextInt());
        System.out.printf("Preço: \n");
        b.setPreco(get.nextDouble());

        barcos.add(b);
    }

    public static void imprime(Barco barco){
        System.out.printf("Modelo: %s\n", barco.getModelo());
        System.out.printf("Fabricante: %s\n", barco.getFabricante());
        System.out.printf("Ano: %d\n", barco.getAno());
        System.out.printf("Pés: %d\n", barco.getPes());
        System.out.printf("Preço: R$ %2f\n", barco.getPreco());
    }

    public static void testDrive(ArrayList<Barco> barcos){
        Scanner get = new Scanner(System.in);
        boolean continua = true;
        int n;
        for (int i = 0; i < barcos.size();i++){
            System.out.printf("N° %d\n", (i+1));
            imprime(barcos.get(i));
        }


        do {
            System.out.printf("Escolha o N° de um dos barcos acima para fazer o teste.\n");
            n = get.nextInt() - 1;
            if (n > barcos.size()){
                System.out.printf("Digite uma opção valida\n");
            }
        }while (n > barcos.size());

        while (continua){

            System.out.printf("Teste drive menu\n");
            System.out.printf("(1) Ligar/Desligar o Veiculo\n");
            System.out.printf("(2) Andar/Parar \n");
            System.out.printf("(3) Sair\n");

            System.out.printf("Escolha uma das opções: \n");
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
                    System.out.printf("Digite uma opção valida\n");
            }
        }

    }
}
