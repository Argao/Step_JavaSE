package DEVER;

import DEVER.CONTROLLER.PessoaController;
import DEVER.VIEW.Menu;
import DEVER.VIEW.PessoaService;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<PessoaController> pessoas = new ArrayList<>();

        try {
            PessoaService.carregaArray(pessoas);
        }catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado!");
            boolean continua = true;
            do {
                System.out.println("Deseja criar um novo arquivo? Digite 1 para sim e 2 para não:");
                Scanner get = new Scanner(System.in);
                String opcao = get.nextLine();


                switch (opcao){
                    case "1":
                        try {
                            FileWriter file = new FileWriter("C:\\SaidaJava\\pessoa.txt",true);
                            file.close();
                            PessoaService.carregaArray(pessoas);
                            System.out.println("Arquivo Criado Com Sucesso!");
                        }catch (FileNotFoundException e2){
                            System.out.println("Não foi possivel criar o arquivo pois a pasta SaidaJava não existe!");
                            System.out.println("Crie a pasta SaidaJava na raiz do disco C e tente rodar o programa novamente.");
                            System.exit(2);
                        }
                        continua = false;
                        break;
                    case "2":
                        System.out.println("Não é possivel continuar o programa.");
                        System.out.println("Crie o arquivo pessoa.txt no na pasta C:\\SaidaJava antes de executar o programa novamente! ");
                        System.exit(2);
                        break;
                    default:
                        System.out.println("Digite uma opção valida!");
                }
            }while (continua);

        }
        Menu.principal(pessoas);
    }
}
