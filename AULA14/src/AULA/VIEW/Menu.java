package AULA.VIEW;

import AULA.Controller.BarcoController;
import AULA.Controller.CarroController;
import AULA.Controller.MotoController;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void inicio(ArrayList<CarroController> carros,
                              ArrayList<MotoController> motos,
                              ArrayList<BarcoController> barcos){
        Scanner get = new Scanner(System.in);
        int op = 0;
        System.out.println("=====CADASTRO DE VEICULOS=====");
        System.out.println("(1)Cadastrar");
        System.out.println("(2)Consulta");
        System.out.println("(3)Test Drive");
        System.out.println("(0)SAIR");
        System.out.print("Qual opção: Nº ");

        op = get.nextInt();

        switch (op){
            case 1:
                cadastrar(carros, motos, barcos);
                break;
            case 2:
                consultar(carros, motos, barcos);
                break;
            case 3:
                testDrive(carros, motos, barcos);
                break;
            case 0:
                System.out.println("SAINDO");
                System.exit(1);
                break;
            default:
                System.out.println("Opção inválida");

        }
    }

    public static void cadastrar(ArrayList<CarroController> carros,
                                 ArrayList<MotoController> motos,
                                 ArrayList<BarcoController> barcos){
        Scanner get = new Scanner(System.in);
        int op = 0;
        System.out.println("=====CADASTRAR VEICULOS=====");
        System.out.println("(1)CARRO");
        System.out.println("(2)MOTO");
        System.out.println("(3)BARCO");
        System.out.print("Qual opção: Nº ");

        op = get.nextInt();

        switch (op){
            case 1:
                CarroController carro = new CarroController();
                carro.cadastra();
                carros.add(carro);
                break;
            case 2:
                MotoController moto = new MotoController();
                moto.cadastra();
                motos.add(moto);
                break;
            case 3:
                BarcoController barco = new BarcoController();
                barco.cadastra();
                barcos.add(barco);
                break;
            default:
                System.out.println("Opção inválida");

        }
    }
    public static void consultar(ArrayList<CarroController> carros,
                                 ArrayList<MotoController> motos,
                                 ArrayList<BarcoController> barcos){
        Scanner get = new Scanner(System.in);
        int op = 0;
        System.out.println("=====CONSULTAR VEICULOS=====");
        System.out.println("(1)CARRO");
        System.out.println("(2)MOTO");
        System.out.println("(3)BARCO");
        System.out.print("Qual opção: Nº ");

        op = get.nextInt();

        switch (op){
            case 1:
                System.out.println("CARROS-----------------");
                for(CarroController c: carros){
                    c.imprime();
                    System.out.println("-------------");
                }
                break;
            case 2:
                System.out.println("MOTOS------------------");
                for(MotoController m: motos){
                    m.imprime();
                    System.out.println("--------------");
                }
                break;
            case 3:
                System.out.println("BARCOS-----------------");
                for(BarcoController b: barcos){
                    b.imprime();
                    System.out.println("----------------");
                }
        }
    }

    public static void testDrive(ArrayList<CarroController> carros,
                                 ArrayList<MotoController> motos,
                                 ArrayList<BarcoController> barcos){
        Scanner get = new Scanner(System.in);
        int op = 0;
        System.out.println("=====TESTAR VEICULOS=====");
        System.out.println("(1)CARRO");
        System.out.println("(2)MOTO");
        System.out.println("(3)BARCO");
        System.out.print("Qual opção: Nº ");

        op = get.nextInt();
        int index = 1;
        switch (op){
            case 1:
                System.out.println("CARROS-----------------");
                for(CarroController c: carros){
                    System.out.println("Nº " +index);
                    index++;
                    c.imprime();
                    System.out.println("-------------");
                }
                System.out.print("Carro nº ");
                index = get.nextInt()-1;
                carros.get(index).liga();
                carros.get(index).move();
                carros.get(index).liga();
                break;
            case 2:
                System.out.println("Motos-----------------");
                for(MotoController c: motos){
                    System.out.println("Nº " +index);
                    index++;
                    c.imprime();
                    System.out.println("-------------");
                }
                System.out.print("Moto nº ");
                index = get.nextInt()-1;
                motos.get(index).liga();
                motos.get(index).move();
                motos.get(index).liga();
                break;
            case 3:
                System.out.println("Barcos-----------------");
                for(BarcoController c: barcos){
                    System.out.println("Nº " +index);
                    index++;
                    c.imprime();
                    System.out.println("-------------");
                }
                System.out.print("Barco nº ");
                index = get.nextInt()-1;
                barcos.get(index).liga();
                barcos.get(index).move();
                barcos.get(index).liga();
                break;

        }
    }
}
