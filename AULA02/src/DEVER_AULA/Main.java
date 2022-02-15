package DEVER_AULA;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Variaveis
        int [][] matriz = new int[5][5]; //Botei [5][5] para ter um numero no meio
        int [][] diagonais = new  int[5][5];
        int percorreVetor = 0;
        Random sorteia = new Random();

        //Preenche a matriz
        for (int i = 0;i < matriz.length;i++){
            for (int j = 0; j < matriz[i].length;j++){
                matriz[i][j] = sorteia.nextInt(100) + 1;
            }
        }

        //Imprime formatado
        System.out.println("--------------");
        for (int i = 0; i < matriz.length;i++){
            for (int j = 0; j < matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------");

        //Imprime diagonais
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < matriz.length;i++){
            diagonais[i][i] = matriz[i][i];
            System.out.print(matriz[i][i] + " ");
        }

        System.out.print("\nDiagonal secundaria: ");
        for (int i = matriz.length; i > 0;i--){
            diagonais[i-1][percorreVetor] = matriz[i-1][percorreVetor];
            System.out.print(matriz[i-1][percorreVetor] + " ");
            percorreVetor ++;
        }

        //Imprime as diagonais formatadas
        System.out.println("\n-------------------");
        for (int i = 0; i < diagonais.length;i++){
            for (int j = 0; j < diagonais[i].length;j++){
                if (diagonais[i][j] != 0){
                    System.out.print(diagonais[i][j] + "\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        };
        System.out.println("-------------------");

    }
}
