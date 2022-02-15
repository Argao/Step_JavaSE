package DEVER.View;

import DEVER.Controller.ClienteController;
import DEVER.Controller.LivroController;
import DEVER.Controller.FuncionarioController;
import DEVER.Controller.VendasController;
import DEVER.Model.ClienteModel;
import DEVER.Model.FuncionarioModel;
import DEVER.Model.LivroModel;
import DEVER.Model.VendasModel;


import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static int idCliente = 0,idLivro = 0, idFuncionario = 0;

    public static void principal(ArrayList<LivroModel> livros,
                                 ArrayList<ClienteModel> clientes,
                                 ArrayList<FuncionarioModel> funcionarios,
                                 ArrayList<VendasModel> vendas){
        while(true){
            Scanner get = new Scanner(System.in);
            int opcao = 0;

            System.out.println("=============================");
            System.out.println("====Biblioteca Municipal=====");
            System.out.println("=============================");
            System.out.println("(1)Cadastrar");
            System.out.println("(2)Consultar");
            System.out.println("(3)Excluir");
            System.out.println("(4)Comprar");
            System.out.println("(0)##SAIR##");
            System.out.print("Escolha uma opção: ");
            opcao = get.nextInt();

            switch (opcao){
                case 1://Cadastrar
                    cadastar(livros,clientes,funcionarios);
                    break;

                case 2://consultar
                    consulta(livros,clientes,funcionarios,vendas);
                    break;

                case 3: //excluir
                    excluir(livros,clientes,funcionarios);
                    break;
                case 4: //comprar
                    comprar(livros,clientes,funcionarios,vendas);
                    break;
                case 0://sair
                    System.exit(1);
                    break;
                default:
                    System.out.println("\n\nOpção inválida!\n\n");
            }
        }//FIM  WHILE
    }//FIM PRINCIPAL

    public static void cadastar(ArrayList<LivroModel> livros,
                                ArrayList<ClienteModel> clientes,
                                ArrayList<FuncionarioModel> funcionarios){

        Scanner get = new Scanner(System.in);
        int opcao = 0;


        System.out.println("=======CADASTRO=========");
        System.out.println("(1)Livro");
        System.out.println("(2)Cliente");
        System.out.println("(3)Funcuinário");
        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao){
            case 1://Livro
                LivroController.cadastra(livros,idLivro);
                idLivro++;
                break;
            case 2://Cliente
                ClienteController.cadastra(clientes,idCliente);
                idCliente++;
                break;
            case 3://Funcionários
                FuncionarioController.cadastra(funcionarios,idFuncionario);
                idFuncionario++;
            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }

    }//fim cadastra

    public static void consulta(ArrayList<LivroModel> livros,
                                ArrayList<ClienteModel> clientes,
                                ArrayList<FuncionarioModel> funcionarios,
                                ArrayList<VendasModel> vendas){

        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("=======CONSULTAS=========");
        System.out.println("(1)Livro");
        System.out.println("(2)Cliente");
        System.out.println("(3)Funcuinário");
        System.out.println("(4)Vendas");
        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao) {
            case 1://Livro
                LivroController.imprime(livros);
                break;
            case 2://Cliente
                ClienteController.imprime(clientes);
                break;
            case 3://Funcionário
                FuncionarioController.imprime(funcionarios);
                break;
            case 4://Vendas
                VendasController.imprime(livros,clientes,funcionarios,vendas);
                break;
            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }
    }//fim consulta

    public static void excluir(ArrayList<LivroModel> livros,
                               ArrayList<ClienteModel> clientes,
                               ArrayList<FuncionarioModel> funcionarios){

        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("=======Exclusão=========");
        System.out.println("(1)Livro");
        System.out.println("(2)Cliente");
        System.out.println("(3)Funcuinário");
        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao) {
            case 1://Livro
                LivroController.exclui(livros);
                break;
            case 2://Cliente
                ClienteController.exclui(clientes);
                break;
            case 3://Funcionário
                FuncionarioController.exclui(funcionarios);
                break;
            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }
    }//fim Excluir

    public static void comprar(ArrayList<LivroModel> livros,
                               ArrayList<ClienteModel> clientes,
                               ArrayList<FuncionarioModel> funcionarios,
                               ArrayList<VendasModel> vendas){

        VendasController.cadastraVenda(livros,clientes,funcionarios,vendas);
    }
}
