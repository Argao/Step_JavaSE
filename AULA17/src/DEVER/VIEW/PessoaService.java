package DEVER.VIEW;

import DEVER.CONTROLLER.PessoaController;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PessoaService {
    public static void cadPessoa(ArrayList<PessoaController> pessoas) throws IOException {
        PessoaController pessoa = new PessoaController();
        pessoa.cadastra();

        FileWriter file = new FileWriter("C:\\SaidaJava\\pessoa.txt",true);
        BufferedWriter buff = new BufferedWriter(file);

        buff.write(pessoa.getNome() + ";" + pessoa.getSexo() + ";"  + pessoa.getIdade() + "\n");

        buff.close();
        file.close();
        pessoas.add(pessoa);

        System.out.println("Usuário Cadastrado com Sucesso!");
    }

    public static void carregaArray(ArrayList<PessoaController> pessoas) throws IOException {

        FileReader file = new FileReader("C:\\SaidaJava\\pessoa.txt");
        BufferedReader buff = new BufferedReader(file);

        String row = "";

        while ((row = buff.readLine()) != null){
            String[] aux = row.split(";");
            pessoas.add(new PessoaController(aux[0],aux[1],Integer.parseInt(aux[2])));
        }

    }

    public static void atualizaArquivo(ArrayList<PessoaController> pessoas) throws IOException {
        FileWriter file = new FileWriter("C:\\SaidaJava\\pessoa.txt",false);
        BufferedWriter buff = new BufferedWriter(file);

        for (PessoaController p: pessoas){
            buff.write(p.getNome() + ";" + p.getSexo() + ";"  + p.getIdade() + "\n");
        }
        buff.close();
        file.close();
    }

    public static void relatorioPessoas(ArrayList<PessoaController> pessoas){
        System.out.println("\n=======Relatorio de Pessoas========\n");

        if (pessoas.size() != 0){
            for (PessoaController p: pessoas){
                p.imprime();
                System.out.println("==================\n");
            }
        }else {
            System.out.println("Nenhuma Pessoa Cadastrada!");
        }

    }

    public static boolean excluiPessoa(ArrayList<PessoaController> pessoas) throws IOException {
        boolean retorno = true;
        if (pessoas.size() != 0){
            Scanner get = new Scanner(System.in);

            System.out.println("Escolha a pessoa abaixo que deseja excluir: \n");

            for (int i = 0; i < pessoas.size(); i++){
                System.out.println("Nº " + (i+1));
                pessoas.get(i).imprime();
                System.out.println("==================\n");
            }

            System.out.println("Digite o Nº da pessoa que deseja excluir");
            try {
                int index = get.nextInt() - 1;

                if (index < 0 || index > pessoas.size()){
                    System.out.println("Pessoa não encontrada!");
                    retorno = false;
                }else {
                    pessoas.remove(index);
                    atualizaArquivo(pessoas);
                }
            }catch (InputMismatchException e){
                System.out.println("Erro! Digite apenas numeros!");
                retorno = false;
            }


        }else {
            System.out.println("Nenhuma Pessoa Cadastrada!");
            retorno = false;
        }

        return retorno;


    }


}
