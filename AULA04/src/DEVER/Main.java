package DEVER;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[10];
        Scanner get = new Scanner(System.in);
        int contagem = 0;

        System.out.println("Cadastro de Lutadores:");
        for (int i = 0; i < 10; i++){
            int continua;
            do {
                System.out.println("Deseja cadastrar um novo lutador? Digite 1 para sim e 2 para não:");
                continua = get.nextInt();
                if (!(continua == 2 || continua == 1)){
                    System.out.println("Digite um numero valido!");
                }
            }while (!(continua == 2 || continua == 1));

            if (continua == 2){
                break;
            }else {
                lutadores[i] = new Lutador();

                get.nextLine();
                System.out.println("Digite o nome do Lutador(a): ");
                lutadores[i].setNome(get.nextLine());

                System.out.println("Digite o sexo do lutador(a).Digite m ou f: ");
                while (lutadores[i].getSexo() == null){
                    lutadores[i].setSexo(get.next());
                }

                System.out.println("Digite a idade do lutador(a): ");
                lutadores[i].setIdade(get.nextInt());
                System.out.println("Digite o peso do lutador(a): ");
                lutadores[i].setPeso(get.nextFloat());
                System.out.println("Digite a altura do lutador(a): ");
                lutadores[i].setAltura(get.nextFloat());
                contagem ++;

            }
        }

        System.out.println("================Categorias================");

        System.out.println("Masculino sub-18: ");
        for (int i = 0; i < contagem; i++){
            lutadores[i].imprimeHomensMenores();
        }
        System.out.println();

        System.out.println("Feminino sub-18: ");
        for (int i = 0; i < contagem; i++){
            lutadores[i].imprimeMulheresMenores();

        }
        System.out.println();

        System.out.println("Masculino: ");
        for (int i = 0; i < contagem; i++){
            lutadores[i].imprimeHomensMaiores();
        }
        System.out.println();

        System.out.println("Feminino: ");
        for (int i = 0; i < contagem; i++){
            lutadores[i].imprimeMulheresMaiores();
        }
        System.out.println();



    }
}
