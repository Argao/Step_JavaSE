package DEVER;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double n1,n2,n3,n4,media,total;
        Scanner read = new Scanner(System.in);

        System.out.println("Digite 4 notas para fazer uma média.");

        System.out.println("Digite a nota 1: ");
        n1 = read.nextDouble();
        System.out.println("Digite a nota 2: ");
        n2 = read.nextDouble();
        System.out.println("Digite a nota 3: ");
        n3 = read.nextDouble();
        System.out.println("Digite a nota 4: ");
        n4 = read.nextDouble();


        total = (n1+n2+n3+n4);
        media = total/4;

        System.out.println("O Total das notas é de " + total +" e a media das notas é de " + media + ".");

    }
}
