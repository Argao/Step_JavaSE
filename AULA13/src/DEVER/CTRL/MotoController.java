package DEVER.CTRL;

import DEVER.MODEL.*;

import java.util.ArrayList;
import java.util.Scanner;

public class MotoController {
    public static void Cadastra(ArrayList<Moto> motos){
        Scanner get = new Scanner(System.in);
        Moto m = new Moto();

        System.out.println("Cadastrar Moto");
        System.out.println("Modelo: ");
        m.setModelo(get.nextLine());
        System.out.println("Fabricante: ");
        m.setFabricante(get.nextLine());
        System.out.println("Ano: ");
        m.setAno(get.nextInt());
        System.out.println("Cilindradas: ");
        m.setCilindrada(get.nextInt());
        System.out.println("Preço: ");
        m.setPreco(get.nextDouble());

        motos.add(m);
    }

    public static void imprime(Moto motos){
        System.out.println("Modelo: " + motos.getModelo());
        System.out.println("Fabricante: " + motos.getFabricante());
        System.out.println("Ano: " + motos.getAno());
        System.out.println("Cilindrada: " + motos.getCilindrada());
        System.out.println("Preço: R$" + motos.getPreco());
    }


    public static void testDrive(ArrayList<Moto> motos){
        Scanner get = new Scanner(System.in);
        boolean continua = true;
        int n;
        for (int i = 0; i < motos.size();i++){
            System.out.println("N° " + (i+1));
            imprime(motos.get(i));
        }


        do {
            System.out.println("Escolha o N° de um dos motos acima para fazer o teste.");
            n = get.nextInt() - 1;
            if (n > motos.size()){
                System.out.println("Digite uma opção valida");
            }
        }while (n > motos.size());

        while (continua){

            System.out.println("Teste drive menu");
            System.out.println("(1) Ligar/Desligar o Veiculo");
            System.out.println("(2) Andar/Parar ");
            System.out.println("(3) Sair");

            System.out.println("Escolha uma das opções: ");
            int opcao = get.nextInt();

            switch (opcao){
                case 1:
                    motos.get(n).ligaDesliga();
                    break;
                case 2:
                    motos.get(n).andaPara();
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
