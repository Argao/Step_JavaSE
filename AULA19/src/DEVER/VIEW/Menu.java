package DEVER.VIEW;

import DEVER.CTRL.BarcoController;
import DEVER.CTRL.CarroController;
import DEVER.CTRL.MotoController;
import DEVER.MODEL.Barco;
import DEVER.MODEL.Carro;
import DEVER.MODEL.Moto;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void principal(ArrayList<Carro> carros,
                                 ArrayList<Moto> motos,
                                 ArrayList<Barco> barcos){
        while (true){

            Scanner get = new Scanner(System.in);

            System.out.printf("Sistema Principal\n\n");
            System.out.printf("(1) Cadastrar um veiculo\n");
            System.out.printf("(2) Test-Drive\n");
            System.out.printf("(3) Sair\n");


            int opcao = get.nextInt();

            switch (opcao){
                case 1:
                    menuCadastro(carros,motos,barcos);
                    break;
                case 2:
                    menuTest(carros,motos,barcos);
                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    System.out.printf("Escolha uma opção válida!\n");
            }

        }

    }

    private static void menuCadastro(ArrayList<Carro> carros,
                                     ArrayList<Moto> motos,
                                     ArrayList<Barco> barcos){

        Scanner get = new Scanner(System.in);

        System.out.printf("Qual veiculo deseja cadastrar?\n\n");
        System.out.printf("(1) Carro\n");
        System.out.printf("(2) Moto\n");
        System.out.printf("(3) Barco\n");

        int opcao = get.nextInt();

        switch (opcao){
            case 1:
                CarroController.Cadastra(carros);
                break;
            case 2:
                MotoController.Cadastra(motos);
                break;
            case 3:
                BarcoController.Cadastra(barcos);
                break;
            default:
                System.out.printf("Escolha uma opção válida!\n");
        }

    }

    private static void menuTest(ArrayList<Carro> carros,
                                 ArrayList<Moto> motos,
                                 ArrayList<Barco> barcos){

        Scanner get = new Scanner(System.in);

        System.out.printf("Qual veiculo deseja testar?\n\n");
        System.out.printf("(1) Carro\n");
        System.out.printf("(2) Moto\n");
        System.out.printf("(3) Barco\n");

        int opcao = get.nextInt();

        switch (opcao){
            case 1:
                CarroController.testDrive(carros);
                break;
            case 2:
                MotoController.testDrive(motos);
                break;
            case 3:
                BarcoController.testDrive(barcos);
                break;
            default:
                System.out.printf("Escolha uma opção válida!\n");
        }

    }
}
