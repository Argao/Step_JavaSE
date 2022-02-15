package SERVICES;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Get {
    public static int inteiro(){
        int valor = 0;
        while(0==0)
            try{
            Scanner get = new Scanner(System.in);
            valor = get.nextInt();
            break;//parar o WHILE caso receba o inteiro
            }catch (InputMismatchException e){
                System.err.println("\nApenas valores inteiros!");
                System.out.println("Ex: 123654");
                System.out.print("Tente novamente: ");
            }
        return  valor;
    }
    public static double Double(){
        double valor = 0;
        while(0==0)
            try{
                Scanner get = new Scanner(System.in);
                valor = get.nextDouble();
                break;//parar o WHILE caso receba o inteiro
            }catch (InputMismatchException e){
                System.err.println("\nApenas valores decimais!");
                System.out.println("Não use pontos no milhar!");
                System.out.println("Ex: 456152,0");
                System.out.print("Tente novamente: ");
            }
        return  valor;
    }
    public static String texto() {
        Scanner get = new Scanner(System.in);
        return get.nextLine();
    }

}
