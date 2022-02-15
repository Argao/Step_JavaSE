package AULA;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner get = new Scanner(System.in);
        int index = 1, numero;

        System.out.println("Qual a tabuada: Nº ");
        numero = get.nextInt();

        String path ="C:\\SAIDAJAVA\\tabuada de "+numero+".txt";

        FileWriter arquivo = new FileWriter(path);
        //Lembre de criar a pasta em um lugar que tenha
        //permissão de leitura e gravação e que exista
        //na máquina do usuário

        PrintWriter escreveArquivo = new PrintWriter(arquivo);
        //criando um escritor de arquivos para aquele arquivo

        escreveArquivo.println("Tabuada de " + numero);
        escreveArquivo.println("----------------");

        for(index = 1; index <= 10; index++){
            escreveArquivo.println(index + " x " + numero + " = " + (index * numero));
        }
        escreveArquivo.println("===============");

        arquivo.close();//sempre fechar o arquivo!!!!!!

        System.out.println("Arquivo gerado com sucesso!");

        //--------leitura de dados do arquivo

        FileReader arquivoLeitura = new FileReader(path);
        BufferedReader leitorArquivo = new BufferedReader(arquivoLeitura);

        String linha;

        while ((linha = leitorArquivo.readLine()) != null){
            System.out.println(linha);
        }
        System.out.println("\n\n===== FIM DE ARQUIVO =====\n\n");
    }
}
/* EXEMPLO de importação de usuários

conteúdo do arquivo lista.txt
Juca;jbala@gmail.com
Zeca;zbala@gmail.com
Bela;belabala@gmail.com


código:
FileReader arquivoLeitura = new FileReader("c:\\importações\\usuarios.txt");
        BufferedReader leitorArquivo = new BufferedReader(arquivoLeitura);

        String linha;
        ArrayList<Usuario> users = new ArrayList();
        //faz de conta que já criou classe Usuario

        while ((linha = leitorArquivo.readLine()) != null){
            users.add(new Usuario(linha.split(";")[0],linha.split(";")[1]));

            // ou detalhando mais:

            String [] recebe = linha.split(";")
            users.add(new Usuario(recebe[0], recebe[1]);
        }
        System.out.println("\n\n===== FIM DE ARQUIVO =====\n\n");
    }

 */
