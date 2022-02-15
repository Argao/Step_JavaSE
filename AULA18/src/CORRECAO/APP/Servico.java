package CORRECAO.APP;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Servico {

    public static int getInt(){
        Scanner get = new Scanner(System.in);

        int aux = 0;

        while(0==0){
            try{
                aux = get.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Apenas números inteiros serão aceitos.");
                System.out.print("Tente novamente: ");
            } catch (Exception e){
                System.out.println("##Erro não esperado##:\n " + e);
                System.out.println("\nCaso persista, envie um print para o suporte");
                System.out.print("Tente novamente: ");
            }
        }
        return aux;
    }

    public static void cadPessoa(){
        Scanner get = new Scanner(System.in);
        Pessoa a = new Pessoa();

        System.out.println("+++CADASTRAR PESSOAS+++");
        System.out.print("Nome: ");
        a.setNome(get.nextLine());
        System.out.print("Sexo: ");
        a.setSexo(get.nextLine());
        System.out.print("Idade: ");
        a.setIdade(getInt());

        /////////////////
        try{
            FileWriter file = new FileWriter("c:\\saida java\\pessoas.dat");
            BufferedWriter buff = new BufferedWriter(file);
            buff.write(a.toString());
            file.close();
            buff.close();
        } catch (IOException e) {
            System.out.println("#####Erro ao abrir o arquivo####");
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("##Erro não esperado##:\n " + e);
            System.out.println("\nCaso persista, envie um print para o suporte");
        }
    }

    public static void getPessoas(){
        System.out.println("=====RELATÓRIO DE PESSOAS=====");
        try{
            FileReader file = new FileReader("C:\\saida java\\pessoas.dat");
            BufferedReader buff = new BufferedReader(file);

            String row = "";
            while((row = buff.readLine()) != null){
                Pessoa a = new Pessoa();
                a.StringParse(row);
                a.imprime();
                System.out.println("------------------------------");
            }

            file.close();
            buff.close();
        } catch (FileNotFoundException e) {
            System.out.println("#ERRO#: Arquivo/pasta não encontrado!\n " + e);
        } catch (IOException e) {
            System.out.println("Erro inesperado!\n" + e );
        }
    }
}
