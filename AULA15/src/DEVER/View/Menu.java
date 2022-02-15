package DEVER.View;

import DEVER.Controller.FrutaController;
import DEVER.Model.Fruta;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void principal(ArrayList<Fruta> frutas) throws IOException {

        while (true){
            Scanner get = new Scanner(System.in);
            int op = 0;
            System.out.println("=====HORTIFRUTI=====");
            System.out.println("(1)Cadastrar Frutas");
            System.out.println("(2)Relatorio de Frutas ");
            System.out.println("(3)Excluir ");
            System.out.println("(0)SAIR");

            op = get.nextInt();

            switch (op){
                case 1:
                    cadastraFrutas(frutas);
                    break;
                case 2:
                    relatorioFrutas(frutas);
                    break;
                case 3:
                    excluiFrutas(frutas);
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

    public static void cadastraFrutas(ArrayList<Fruta> frutas) throws IOException {
        FrutaController.cadastra(frutas);
    }

    public static void relatorioFrutas(ArrayList<Fruta> frutas) throws IOException {
        FrutaController.relatorio(frutas);
    }

    public static void excluiFrutas(ArrayList<Fruta> frutas) throws IOException {
        FrutaController.exclui(frutas);
    }

}
