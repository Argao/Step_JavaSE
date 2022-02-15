package DEVER.VIEW;

import DEVER.CONTROLLER.PessoaController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void principal(ArrayList<PessoaController> pessoas) throws IOException {


        while (true){
            Scanner get = new Scanner(System.in);
            System.out.println("========SISTEMA==========\n\n");
            System.out.println("====================================");
            System.out.println("(1)Cadastrar Pessoa");
            System.out.println("(2)Relatorio de Pessoas");
            System.out.println("(3)Excluir Pessoas");
            System.out.println("(0)Sair");
            System.out.println("====================================");
            System.out.println("Escolha uma das opções acima: ");
            String opcao = get.nextLine();

            switch (opcao){
                case "1":
                    PessoaService.cadPessoa(pessoas);
                    break;
                case "2":
                    PessoaService.relatorioPessoas(pessoas);
                    break;
                case "3":
                    if (PessoaService.excluiPessoa(pessoas)){
                        System.out.println("Pessoa excluida com sucesso!");
                    }
                    break;
                case "0":
                    System.exit(1);
                    break;
                default:
                    System.out.println("Digite uma opção valida!");
            }
        }
    }


}
