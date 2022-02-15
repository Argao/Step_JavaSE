package DEVER;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Calendar data1 = Calendar.getInstance();
        Calendar data2 = Calendar.getInstance();
        Scanner get = new Scanner(System.in);

        System.out.println("\nDigite 2 datas.\n");
        System.out.println("===================================");

        System.out.println("Digite o dia da data 1: ");
        data1.set(Calendar.DAY_OF_MONTH, get.nextInt());
        System.out.println("Digite o mes da data 1: ");
        data1.set(Calendar.MONTH, get.nextInt() - 1);
        System.out.println("Digite o ano da data 1: ");
        data1.set(Calendar.YEAR, get.nextInt());

        System.out.println("\n===================================\n");

        System.out.println("Digite o dia da data 2: ");
        data2.set(Calendar.DAY_OF_MONTH, get.nextInt());
        System.out.println("Digite o mes da data 2: ");
        data2.set(Calendar.MONTH, get.nextInt() - 1);
        System.out.println("Digite o ano da data 2: ");
        data2.set(Calendar.YEAR, get.nextInt());


    }
}
