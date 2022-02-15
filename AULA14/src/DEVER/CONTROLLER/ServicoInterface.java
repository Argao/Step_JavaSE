package DEVER.CONTROLLER;

import java.util.ArrayList;
import java.util.Scanner;

public interface ServicoInterface {
    public static void excluiDoador(ArrayList<DoadorController> doadores) {
        Scanner get = new Scanner(System.in);

        System.out.println("----Excluir Doadores----");

        for (int i =0 ;i< doadores.size(); i++ ){
            System.out.println("N° " + (i+1));
            doadores.get(i).imprime();
            System.out.println("----------------");
        }

        System.out.println("Escolha o N° de quem deseja excluir:");

        int n = get.nextInt() - 1;
        doadores.remove(n);

        System.out.println("Pessoa excluida com sucesso!");

    }

    public static void excluiNaoDoador(ArrayList<NaoDoadorController> ndoador) {
        Scanner get = new Scanner(System.in);

        System.out.println("----Excluir Não Doadores----");

        for (int i =0 ;i< ndoador.size(); i++ ){
            System.out.println("N° " + (i+1));
            ndoador.get(i).imprime();
            System.out.println("----------------");
        }

        System.out.println("Escolha o N° de quem deseja excluir:");

        int n = get.nextInt();
        ndoador.remove(n);

        System.out.println("Pessoa excluida com sucesso!");

    }
}
