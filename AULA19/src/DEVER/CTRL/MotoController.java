package DEVER.CTRL;

import DEVER.MODEL.*;

import java.util.ArrayList;
import java.util.Scanner;

public class MotoController {
    public static void Cadastra(ArrayList<Moto> motos){
        Scanner get = new Scanner(System.in);
        Moto m = new Moto();

        System.out.printf("Cadastrar Moto\n");
        System.out.printf("Modelo: \n");
        m.setModelo(get.nextLine());
        System.out.printf("Fabricante: \n");
        m.setFabricante(get.nextLine());
        System.out.printf("Ano: \n");
        m.setAno(get.nextInt());
        System.out.printf("Cilindradas: \n");
        m.setCilindrada(get.nextInt());
        System.out.printf("Preço: \n");
        m.setPreco(get.nextDouble());

        motos.add(m);
    }

    public static void imprime(Moto motos){
        System.out.printf("Modelo: %s\n", motos.getModelo());
        System.out.printf("Fabricante: %s\n",  motos.getFabricante());
        System.out.printf("Ano: %d\n", motos.getAno());
        System.out.printf("Cilindrada: %d\n", motos.getCilindrada());
        System.out.printf("Preço: R$ %2f\n", motos.getPreco());
    }


    public static void testDrive(ArrayList<Moto> motos){
        Scanner get = new Scanner(System.in);
        boolean continua = true;
        int n;
        for (int i = 0; i < motos.size();i++){
            System.out.printf("N° %d\n", (i+1));
            imprime(motos.get(i));
        }


        do {
            System.out.printf("Escolha o N° de uma das motos acima para fazer o teste.\n");
            n = get.nextInt() - 1;
            if (n > motos.size()){
                System.out.printf("Digite uma opção valida\n");
            }
        }while (n > motos.size());

        while (continua){

            System.out.printf("Teste drive menu\n");
            System.out.printf("(1) Ligar/Desligar o Veiculo\n");
            System.out.printf("(2) Andar/Parar \n");
            System.out.printf("(3) Sair\n");

            System.out.printf("Escolha uma das opções: \n");
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
                    System.out.printf("Escolha uma opção valida!\n");

            }
        }

    }
}
