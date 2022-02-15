package TEMA;

import java.sql.SQLOutput;
import java.util.Scanner;

public class  Servico {
    private static int qtdCarroCadastrado = 0;

    public static void menu(Carro [] carros){
        while(0==0){
            Scanner get = new Scanner(System.in);

            System.out.println("===================================");
            System.out.println("======SISTEMA DE VEÍCULOS==========");
            System.out.println("===================================");
            System.out.println("(1)Cadastrar");
            System.out.println("(2)Imprimir");
            System.out.println("(3)## SAIR ##");
            System.out.print("Escolha uma opção acima: ");
            int opcao = get.nextInt();

            switch(opcao){
                case 1://cadastar
                    cadastraCarro(carros);
                    break;

                case 2://Consultar
                    imprimeCarros(carros);
                    break;

                case 3://sair
                    System.exit(0);
                    break;

                default://errrrou
                    System.out.println("\nErrou! \nTente de novo!");
                    break;
            }

        }
    }//FIM menu

    private static void cadastraCarro(Carro [] carros){
            if(qtdCarroCadastrado != carros.length) {

                Scanner get = new Scanner(System.in);
                carros[qtdCarroCadastrado] = new Carro();

                System.out.println("Cadastrar carro:");

                System.out.print("Modelo: ");
                carros[qtdCarroCadastrado].setModelo(get.nextLine());

                System.out.print("Fabricante: ");
                carros[qtdCarroCadastrado].setFabricante(get.nextLine());

                System.out.print("Ano: ");
                carros[qtdCarroCadastrado].setAno(get.nextInt());

                qtdCarroCadastrado++;
            }else{
                System.out.println("\nEstoque lotado! Não é possível cadastrar.\n\n");
            }

    }//FIM CadastraCarro

    private static void imprimeCarros(Carro[] lista){
        System.out.println("\nCarros cadastrados:\n");

        for(int i = 0 ; i < lista.length ; i++){
            if(lista[i] != null){
                lista[i].imprime();
                System.out.println("======================");
            }else{
                break;
            }
        }
    }//FIM IMPRIMECARRO
}
