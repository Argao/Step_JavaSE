package DEVER.Controller;

import DEVER.Model.Fruta;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FrutaController{

    public static void cadastra(ArrayList<Fruta> frutas) throws IOException {
        Scanner get = new Scanner(System.in);
        Fruta f = new Fruta();

        System.out.println("\n=====Cadastro======\n");

        System.out.println("Nome: ");
        f.setNome(get.nextLine());
        System.out.println("Preço: ");
        f.setPreco(get.nextDouble());

        frutas.add(f);

        escreveArquivo(frutas);
    }

    public static void exclui(ArrayList<Fruta> frutas) throws IOException {
        Scanner get = new Scanner(System.in);
        System.out.println("Escolha o N° da fruta que deseje excluir: ");

        for (int i = 0; i < frutas.size(); i++){
            System.out.println("\nN° " + (i+1));
            System.out.println("Nome: " + frutas.get(i).getNome());
            System.out.println("Preço: " + frutas.get(i).getPreco());
        }

        System.out.println("Escolha o N°: ");
        int index = get.nextInt() -1;

        frutas.remove(index);
        System.out.println("Fruta excluida com sucesso!");

        escreveArquivo(frutas);

    }

    public static void relatorio(ArrayList<Fruta> frutas) throws IOException {

        FileReader arquivoLeitura = new FileReader("C:\\SaidaJava\\hortifruti.txt");
        BufferedReader leitorArquivo = new BufferedReader(arquivoLeitura);

        String linha;

        while ((linha = leitorArquivo.readLine()) != null){
            System.out.println(linha);
        }
        arquivoLeitura.close();
    }


    private static void escreveArquivo(ArrayList<Fruta> frutas) throws IOException {
        FileWriter arquivo = new FileWriter("C:\\SaidaJava\\hortifruti.txt");
        PrintWriter escreveArquivo = new PrintWriter(arquivo);

        escreveArquivo.println("\n====Relatorio de Frutas=====");

        for (int i = 0; i < frutas.size(); i++){
            escreveArquivo.println("\nN° " + (i+1));
            escreveArquivo.println("Nome: " + frutas.get(i).getNome());
            escreveArquivo.println("Preço: " + frutas.get(i).getPreco());
        }
        escreveArquivo.close();
    }


}
