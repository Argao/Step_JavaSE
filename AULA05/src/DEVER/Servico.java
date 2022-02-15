package DEVER;

import TEMA.Carro;

import java.util.Scanner;

public class Servico {
    private static int contadorLivros = 0;

    public static void menu(Livro[] livros ){
        while (true){
            Scanner get = new Scanner(System.in);
            System.out.println("\n===================================");
            System.out.println("======SISTEMA DA LIVRARIA ==========");
            System.out.println("===================================");
            System.out.println("(1)Cadastrar");
            System.out.println("(2)Imprimir");
            System.out.println("(3)## SAIR ##");
            System.out.print("Escolha uma opção acima: ");
            int opcao = get.nextInt();

            switch (opcao){
                case 1:
                    cadastraLivros(livros);
                    break;
                case 2:
                    imprimeLivros(livros);
                    break;
                case 3:
                    System.exit(2);
                    break;
                default:
                    System.out.println("\nDigite uma opção válida!");
                    break;
            }

        }

    }

    private static void cadastraLivros(Livro[] livros){
        if (contadorLivros != livros.length){
            Scanner get = new Scanner(System.in);
            livros[contadorLivros] = new Livro();

            System.out.println("Cadastro de livro.\n");

            System.out.println("Nome: ");
            livros[contadorLivros].setNome(get.nextLine());

            System.out.println("Autor: ");
            livros[contadorLivros].setAutor(get.nextLine());

            System.out.println("Gênero: ");
            livros[contadorLivros].setGenero(get.nextLine());

            System.out.println("Preço: ");
            livros[contadorLivros].setPreco(get.nextDouble());

            contadorLivros++;
        }else {
            System.out.println("\nEstoque lotado!\n");
        }

    }

    private static void imprimeLivros(Livro[] livros){

        if (contadorLivros > 0){
            System.out.println("\nLivros cadastrados.\n");

            for (int i = 0; i < livros.length; i++){
                if (livros[i] != null){
                    livros[i].imprime();
                    System.out.println("++++++++++++++++++++++++");
                }else {
                    break;
                }
            }
        }else {
            System.out.println("\nNenhum livro cadastrado!\n");
        }

    }

}
