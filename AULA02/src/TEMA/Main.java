package TEMA;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] meuVetor = new int[4];
        int[][] minhaMatriz = new int[4][4];
        Random sorteia = new Random();

        for (int i = 0; i < meuVetor.length; i++) {
            meuVetor[i] = sorteia.nextInt(10);
            //para número negativos multiplique por -1
        }
        for (int i = 0; i < meuVetor.length; i++) {
            System.out.println(meuVetor[i]);
        }

        int[] novoVetor = new int[7];
        System.arraycopy(meuVetor, 0, novoVetor, 0, meuVetor.length);

        for (int i = 0; i < novoVetor.length; i++) {
            System.out.println(novoVetor[i]);
        }

        String[] vetor = new String[8];
        vetor[1] = "Juca Bala";
        vetor[0] = "Joyce Bala";
        vetor[3] = "Java Bala";

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null)
                System.out.println(vetor[i]);
        }

        /*
        preencha o minhaMatriz com números aleatórios e imprima como
        abaixo:

        --------------
        7   8   15  21
        2   7   5   32
        1   4   8   9
        25  30  40  55
        --------------
        */
        for(int i = 0 ; i < minhaMatriz.length ; i++){
            for (int j = 0; j < minhaMatriz[i].length; j++){
                minhaMatriz[i][j] = sorteia.nextInt(50);
            }
        }
        System.out.println("----------------");
        for(int i = 0 ; i < minhaMatriz.length ; i++){
            for (int j = 0; j < minhaMatriz[i].length; j++) {
                System.out.print(minhaMatriz[i][j] + "\t");
            }
            System.out.println();//encerrei a linha
        }
        System.out.println("----------------");
    }
}
