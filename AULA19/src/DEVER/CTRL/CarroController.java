package DEVER.CTRL;

import DEVER.MODEL.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CarroController {
    public static void Cadastra(ArrayList<Carro> carros){
        Scanner get = new Scanner(System.in);
        Carro c = new Carro();

        System.out.printf("Cadastrar Carro\n");
        System.out.printf("Modelo: \n");
        c.setModelo(get.nextLine());
        System.out.printf("Fabricante: \n");
        c.setFabricante(get.nextLine());
        System.out.printf("Ano: \n");
        c.setAno(get.nextInt());
        System.out.printf("Cavalos: \n");
        c.setCavalos(get.nextInt());
        System.out.printf("Preço: \n");
        c.setPreco(get.nextDouble());
        get = new Scanner(System.in);
        System.out.printf("Cambio: \n");
        c.setCambio(get.nextLine());

        carros.add(c);
    }

    public static void imprime(Carro carro){
        System.out.printf("Modelo: %s\n", carro.getModelo());
        System.out.printf("Fabricante: %s\n", carro.getFabricante());
        System.out.printf("Ano: %d\n", carro.getAno());
        System.out.printf("Cavalos: %d\n", carro.getCavalos());
        System.out.printf("Cambio: %s\n", carro.getCambio());
        System.out.printf("Preço: R$ %2f\n", carro.getPreco());
    }

    public static void testDrive(ArrayList<Carro> carros){
        Scanner get = new Scanner(System.in);
        boolean continua = true;
        int n;
        for (int i = 0; i < carros.size();i++){
            System.out.printf("N° %d\n", (i+1));
            imprime(carros.get(i));
        }


        do {
            System.out.printf("Escolha o N° de um dos carros acima para fazer o teste.\n");
            n = get.nextInt() - 1;
            if (n > carros.size()){
                System.out.printf("Digite uma opção valida\n");
            }
        }while (n > carros.size());

        while (continua){

            System.out.printf("Teste drive menu\n");
            System.out.printf("(1) Ligar/Desligar o Veiculo\n");
            System.out.printf("(2) Andar/Parar \n");
            System.out.printf("(3) Sair\n");

            System.out.printf("Escolha uma das opções: \n");
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
                    System.out.printf("Digite uma opção valida\n");

            }
        }

    }
}
