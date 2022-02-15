package DEVER.Controller;

import DEVER.Model.ClienteModel;
import DEVER.Model.FuncionarioModel;
import DEVER.Model.LivroModel;
import DEVER.Model.VendasModel;

import java.util.ArrayList;
import java.util.Scanner;

public class VendasController {
    public static void cadastraVenda(ArrayList<LivroModel> livros,
                               ArrayList<ClienteModel> clientes,
                               ArrayList<FuncionarioModel> funcionarios,
                               ArrayList<VendasModel> vendas){

        Scanner get = new Scanner(System.in);
        int identCliente,identFuncionario,identLivro;

        System.out.println("=======Vendas=========");
        System.out.println("\nQuem ira comprar? nº: ");
        ClienteController.imprime(clientes);

        System.out.println("Digite o Nº do cliente");
        identCliente = get.nextInt() -1;

        System.out.println("\nQual livro deseja comprar? nº: ");
        LivroController.imprime(livros);

        System.out.println("Digite o Nº do livro");
        identLivro = get.nextInt() -1;

        System.out.println("\nQual funcionário realizou  a venda? nº: ");
        FuncionarioController.imprime(funcionarios);

        System.out.println("Digite o Nº do funcionário");
        identFuncionario = get.nextInt() -1;


        vendas.add(new VendasModel(identCliente,identLivro,identFuncionario));
        System.out.println("Compra ralizada com sucesso!");
    }

    public static void imprime(ArrayList<LivroModel> livros,
                               ArrayList<ClienteModel> clientes,
                               ArrayList<FuncionarioModel> funcionarios,
                               ArrayList<VendasModel> vendas){
        if(vendas.size() == 0){
            System.out.println("\n\nLISTA VAZIA\n\n");
        }else{
            for(int i = 0; i < vendas.size() ; i++){
                System.out.println("Nº " + (i+1));
                System.out.println("Comprador: " + clientes.get(vendas.get(i).getIdCliente()).getNome());
                System.out.println("Livro: " + livros.get(vendas.get(i).getIdLivro()).getNome());
                System.out.println("Vendedor: " + funcionarios.get(vendas.get(i).getIdFuncionario()).getNome());
                System.out.println("Ganhos: R$ " + livros.get(vendas.get(i).getIdLivro()).getPreco());
                System.out.println("-----------------------------------");
            }
        }

    }
}
