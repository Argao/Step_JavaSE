package AULA;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) throws IOException {
        FileWriter arquivo = new FileWriter("c:\\saidajava\\importação.txt", true);
        BufferedWriter buffer = new BufferedWriter(arquivo);
        PrintWriter escritor = new PrintWriter(buffer);

        while(0==0){
            Scanner get = new Scanner(System.in);

            System.out.println("===CADASTRO DE USUARIOS===");
            System.out.println("(1)CADASTRAR");
            System.out.println("(0)SAIR");
            System.out.print("ESCOLHA UMA OPÇÃO: Nº ");
            int op = get.nextInt();

            switch(op){
                case 1:
                    System.out.println("Cadastrando Usuário+++++");
                    System.out.print("Login: ");
                    String login = get.nextLine();
                    System.out.print("Senha: ");
                    String senha = get.nextLine();

                    escritor.println(login + ";" + senha);
                    System.out.println("\nUsuário cadastrado com sucesso!\n");
                    break;
                case 2:
                    arquivo.close();
                    System.exit(1);
                default:
                    System.out.println("\nOpção Inválida!\n");
            }
        }




    }
}
