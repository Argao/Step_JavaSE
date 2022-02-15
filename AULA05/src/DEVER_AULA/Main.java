package DEVER_AULA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[10];
        Scanner get = new Scanner(System.in);
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++CADASTRO DE LUTADORES+++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++");

        for(int i = 0 ; i < lutadores.length ; i++){
            lutadores[i] = new Lutador();

            System.out.println("Deseja cadastrar um novo lutador? (0)Sim (1) Não");
            int opcao = get.nextInt();
            if(opcao == 1){
                break;
            }

            System.out.print("Nome do lutador: ");
            lutadores[i].setNome(get.nextLine());

            System.out.print("Sexo: ");
            lutadores[i].setSexo(get.nextLine());

            System.out.print("Idade: ");
            lutadores[i].setIdade(get.nextInt());

            System.out.print("Peso(Kg): ");
            lutadores[i].setPeso(get.nextDouble());

            System.out.print("Altura(m): ");
            lutadores[i].setAltura(get.nextDouble());


        }//fim FOR

        System.out.println("Lutadores cadastrados");
        System.out.println("Mulheres menores de idade:");
        for(int i = 0 ; i <lutadores.length ; i++){//feminino dimenó
            if(lutadores[i] == null){
                break;
            }
           lutadores[i].getMulherMenor();
        }

        System.out.println("-------------------------------\nMasculino menores de idade:");
        for(int i = 0 ; i <lutadores.length ; i++){//masculino dimenó
            if(lutadores[i] == null){
                break;
            }
            lutadores[i].getHomemMenor();
        }

        System.out.println("-------------------------------\nFeminino:");
        for(int i = 0 ; i <lutadores.length ; i++){//Femino
            if(lutadores[i] == null){
                break;
            }
            lutadores[i].getMulher();
        }

        System.out.println("-------------------------------\nMasculino:");
        for(int i = 0 ; i <lutadores.length ; i++){//Femino
            if(lutadores[i] == null){
                break;
            }
            lutadores[i].getHomem();
        }
    }
}
