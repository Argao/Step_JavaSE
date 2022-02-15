package DEVER.Controller;

import DEVER.Model.ClienteModel;
import TEMA.Model.LivroModel;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteController {
    public static void cadastra(ArrayList<ClienteModel> lista,int id){
        Scanner get = new Scanner(System.in);
        String nome,cpf,email,endereco;


        System.out.println("\n\n=====Cadastro de Clientes=====");
        System.out.print("Nome do cliente: ");
        nome = get.nextLine();
        System.out.print("CPF do cliente no formato \"xxx.xxx.xxx-xx\": ");
        cpf = get.nextLine();
        System.out.print("E-mail do cliente: ");
        email = get.nextLine();
        System.out.print("Endereço do cliente: ");
        endereco = get.nextLine();

        lista.add(new ClienteModel(nome,cpf,email,endereco,id));
    }

    public static void imprime(ArrayList<ClienteModel> lista){
        if(lista.size() == 0){
            System.out.println("\n\nLISTA VAZIA\n\n");
        }else{
            for(int i = 0; i < lista.size() ; i++){
                System.out.println("Nº " + (i+1));
                System.out.println("Nome: " + lista.get(i).getNome());
                System.out.println("CPF: " + lista.get(i).getCpf());
                System.out.println("E-mail: " + lista.get(i).getEmail());
                System.out.println("Endereço: " + lista.get(i).getEndereco());
                System.out.println("-----------------------------------");
            }
        }
    }

    public static void exclui(ArrayList<ClienteModel> lista){
        if(lista.isEmpty()){
            System.out.println("\n\nLISTA VAZIA\n\n");
        }else{
            Scanner get = new Scanner(System.in);

            imprime(lista);

            System.out.print("Qual cliente deseja excluir? Nº ");
            int index = get.nextInt()-1;

            lista.remove(index);
            System.out.println("\nExluído com Sucesso\n");
        }
    }
}
