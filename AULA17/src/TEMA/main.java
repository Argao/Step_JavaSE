package TEMA;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {

        try {//comandos passíveis de merda
            FileReader file = new FileReader("c:\\Saida Java\\users.dat");
            BufferedReader buff = new BufferedReader(file);

            String row = "";
            while((row=buff.readLine())!=null){
                System.out.println(row);
            }
            buff.close();
            file.close();
        }catch (FileNotFoundException e){//erro previsto
            System.out.println("Arquivo não encontrado!");
        }catch (Exception e){//erro genérico
            System.out.println("###Erro####: Error found ###" + e + "###");
        } finally { //roda independente de erro!
            System.out.println("Entrei no Finally");
        }
        System.out.println("DEPOIS DO TRY CATCH");
    }
}
