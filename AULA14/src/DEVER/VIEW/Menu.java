package DEVER.VIEW;

import DEVER.CONTROLLER.DoadorController;
import DEVER.CONTROLLER.NaoDoadorController;
import DEVER.CONTROLLER.Servico;
import DEVER.CONTROLLER.ServicoInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void pricipal(ArrayList<DoadorController> doadores,
                                ArrayList<NaoDoadorController> ndoadores){

        while (true){
            Scanner get = new Scanner(System.in);
            int op = 0;
            System.out.println("=====BANCO DE DOADORES=====");
            System.out.println("(1)Cadastrar Pessoas");
            System.out.println("(2)Consulta ");
            System.out.println("(3)Excluir ");
            System.out.println("(0)SAIR");

            op = get.nextInt();

            switch (op){
                case 1:
                    menuCadastro(doadores,ndoadores);
                    break;
                case 2:
                    menuConsulta(doadores,ndoadores);
                    break;
                case 3:
                    menuExclui(doadores,ndoadores);
                    break;
                case 0:
                    System.out.println("SAINDO");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        }

    }

    private static void menuCadastro(ArrayList<DoadorController> doadores,
                                     ArrayList<NaoDoadorController> ndoadores){

        Scanner get = new Scanner(System.in);
        int op = 0;
        System.out.println("=====Cadastro=====");
        System.out.println("(1)Cadastrar Doador");
        System.out.println("(2)Cadastrar Não Doador ");


        op = get.nextInt();

        switch (op){
            case 1:
                DoadorController d = new DoadorController();
                d.cadastra();
                doadores.add(d);
                break;
            case 2:
                NaoDoadorController nd = new NaoDoadorController();
                nd.cadastra();
                ndoadores.add(nd);
                break;
            default:
                System.out.println("Opção inválida");

        }
    }

    private static void menuConsulta(ArrayList<DoadorController> doadores,
                                     ArrayList<NaoDoadorController> ndoadores){

        Scanner get = new Scanner(System.in);
        int op = 0;
        System.out.println("=====Consultas=====");
        System.out.println("(1)Consultar Doadores");
        System.out.println("(2)Consultar Não Doadores ");

        op = get.nextInt();

        switch (op){
            case 1:
                for (DoadorController  d : doadores){
                    d.imprime();
                    System.out.println("======================");
                }
                break;
            case 2:
                for (NaoDoadorController  nd : ndoadores){
                    nd.imprime();
                    System.out.println("======================");
                }
                break;
            default:
                System.out.println("Opção inválida");

        }
    }

    private static void menuExclui(ArrayList<DoadorController> doadores,
                                   ArrayList<NaoDoadorController> ndoadores){
        Scanner get = new Scanner(System.in);
        int op = 0;
        System.out.println("=====Menu De Exclusão=====");
        System.out.println("(1)Excluir Doadores");
        System.out.println("(2)Excluir Não Doadores ");

        op = get.nextInt();

        switch (op){
            case 1:
                ServicoInterface.excluiDoador(doadores);
                break;
            case 2:
                ServicoInterface.excluiNaoDoador(ndoadores);
                break;
            default:
                System.out.println("Opção inválida");

        }

    }
}
