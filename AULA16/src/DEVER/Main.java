package DEVER;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String login, senha;
        int op;

        while (true){
            Scanner get = new Scanner(System.in);
            System.out.println("====Login====");

            System.out.println("Login: ");
            login =get.nextLine();

            System.out.println("Senha: ");
            senha = get.nextLine();

            if (login.equals("root") && senha.equals("root123")){
                sistema(login);
            }else {
                login(login,senha);
            }


            System.out.println("Digite 1 para tentar de novo ou 2 para sair");
            op = get.nextInt();

            switch (op){
                case 1:
                    break;
                case 2:
                    System.exit(1);
                    break;
            }

        }
    }

    public static void login(String login, String senha) throws IOException {
        FileReader arquivoLeitura = new FileReader("C:\\saidajava\\login.txt");
        BufferedReader leitorArquivo = new BufferedReader(arquivoLeitura);
        String linha;
        boolean encontrou = false;
        while ((linha = leitorArquivo.readLine()) != null){
            String [] loginSenha = linha.split(";");

            if (Objects.equals(login, loginSenha[0]) && Objects.equals(senha, loginSenha[1])){
                encontrou = true;
                sistema(login);
                break;
            }

        }

        if (!encontrou){
            System.out.println("login ou senha incorretos");
        }
    }




    public static void sistema(String login) throws IOException {
        Scanner get = new Scanner(System.in);
        System.out.println("Bem vindo " + login + "!\n");
        int op;

        while (true){
            System.out.println("===============================");
            System.out.println("(1)Cadastrar novo usuario.");
            System.out.println("(2)Sair.");
            System.out.println("===============================");
            System.out.println("\nEscolha uma opção: ");
            op = get.nextInt();

            switch (op){
                case 1:
                    cadastra();
                    break;
                case 2:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Digite uma opção válida!");

            }
        }

    }

    public static void cadastra() throws IOException {
        FileWriter arquivo = new FileWriter("c:\\saidajava\\login.txt", true);

        PrintWriter escritor = new PrintWriter(arquivo);

        Scanner get = new Scanner(System.in);
        String login,senha;

        System.out.println("Login do novo usuário: ");
        login = get.nextLine();
        System.out.println("Senha do novo usuário: ");
        senha = get.nextLine();

        escritor.println(login + ";" + senha);
        System.out.println("\nUsuário cadastrado com sucesso!\n");
        arquivo.close();

    }



}
