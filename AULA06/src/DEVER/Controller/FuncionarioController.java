package DEVER.Controller;

import DEVER.Model.ClienteModel;
import DEVER.Model.FuncionarioModel;

import java.util.ArrayList;
import java.util.Scanner;

public class FuncionarioController {
    public static void cadastra(ArrayList<FuncionarioModel> lista,int id){
        Scanner get = new Scanner(System.in);
        String nome,cargo,cpf;


        System.out.println("\n\n=====Cadastro de Funcionários=====");
        System.out.print("Nome do funcionário: ");
        nome = get.nextLine();
        System.out.print("Cargo do funcionário: ");
        cargo = get.nextLine();
        System.out.print("CPF do funcionário no formato \"xxx.xxx.xxx-xx\": ");
        cpf = get.nextLine();

        lista.add(new FuncionarioModel(nome,cargo,cpf,id));
    }

    public static void imprime(ArrayList<FuncionarioModel> lista){
        if(lista.size() == 0){
            System.out.println("\n\nLISTA VAZIA\n\n");
        }else{
            for(int i = 0; i < lista.size() ; i++){
                System.out.println("Nº " + (i+1));
                System.out.println("Nome: " + lista.get(i).getNome());
                System.out.println("Cargo: " + lista.get(i).getCargo());
                System.out.println("CPF: " + lista.get(i).getCpf());
                System.out.println("-----------------------------------");
            }
        }
    }

    public static void exclui(ArrayList<FuncionarioModel> lista){
        if(lista.isEmpty()){
            System.out.println("\n\nLISTA VAZIA\n\n");
        }else{
            Scanner get = new Scanner(System.in);

            imprime(lista);

            System.out.print("Qual funcionário deseja excluir? Nº ");
            int index = get.nextInt()-1;

            lista.remove(index);
            System.out.println("\nExluído com Sucesso\n");
        }
    }
}
