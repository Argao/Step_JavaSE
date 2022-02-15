package DEVER.Controller;

import DEVER.Model.LivroModel;

import java.util.ArrayList;
import java.util.Scanner;

public class LivroController {
    public static void cadastra(ArrayList<LivroModel> lista,int id){
        Scanner get = new Scanner(System.in);
        String nome, autor, genero;
        double preco;

        System.out.println("\n\n=====Cadastro de Livro=====");
        System.out.print("Nome do livro: ");
        nome = get.nextLine();
        System.out.print("Nome do Autor: ");
        autor = get.nextLine();
        System.out.print("Gênero do livro: ");
        genero = get.nextLine();
        System.out.print("Preço: ");
        preco = get.nextDouble();

        lista.add(new LivroModel(nome,autor,genero,preco,id));
    }

    public static void imprime(ArrayList<LivroModel> lista){
        if(lista.size() == 0){
            System.out.println("\n\nLISTA VAZIA\n\n");
        }else{
            for(int i = 0; i < lista.size() ; i++){
                System.out.println("Nº " + (i+1));
                System.out.println("Nome: " + lista.get(i).getNome());
                System.out.println("Autor: " + lista.get(i).getAutor());
                System.out.println("Gênero: " + lista.get(i).getGenero());
                System.out.println("Preço: " + lista.get(i).getPreco());
                System.out.println("-----------------------------------");
            }
        }
    }

    public static void exclui(ArrayList<LivroModel> lista){
        if(lista.isEmpty()){
            System.out.println("\n\nLISTA VAZIA\n\n");
        }else{
            Scanner get = new Scanner(System.in);

            imprime(lista);

            System.out.print("Qual livro deseja excluir? Nº ");
            int index = get.nextInt()-1;

            lista.remove(index);
            System.out.println("\nExluído com Sucesso\n");
        }
    }
}
