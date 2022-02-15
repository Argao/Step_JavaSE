package DEVER.CTRL;

import AULA.MODEL.Aluno;
import DEVER.MODEL.Pessoa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;

public class PessoaController {
    public static void cadastrar (ArrayList<Pessoa> pessoas){
        Scanner leia = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("++++Cadastro de pessoas++++");

        System.out.print("Nome: ");
        p.setNome(leia.nextLine());

        System.out.print("Sexo: ");
        p.setSexo(leia.nextLine());

        System.out.print("Idade");
        p.setIdade(leia.nextInt());

        pessoas.add(p);
        System.out.println("\nCadastro realizado com sucesso!\n");
    }

    static void imprime (Pessoa p){
        System.out.println("\nNome: " + p.getNome());
        System.out.println("Sexo: " + p.getSexo());
        System.out.println("Idade: " + p.getIdade() + "\n");
    }

    public static void imprimePorIdade(ArrayList<Pessoa>pessoas){

        Collections.sort(pessoas,new comparaIdade());

        for (Pessoa p : pessoas){
            imprime(p);
        }
    }

}

class comparaIdade implements Comparator<Pessoa>{
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        if (p1.getIdade() == p2.getIdade()){
            return 0;
        }else if (p1.getIdade() > p2.getIdade()){
            return 1;
        }else{
            return -1;
        }

    }
}