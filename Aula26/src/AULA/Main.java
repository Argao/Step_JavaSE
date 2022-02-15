package AULA;

import java.util.*;

public class Main {
    private static int shared = 0;
    private static final Integer qtd = 10000;//dez mil
    private static final List<Integer> valores = new ArrayList<>();

    public static void main(String[] args) {
        /*
        Thread t1 = new Thread(

                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0 ; i < qtd; i++){
                            valores.add(++shared);
                        }
                    }
                }
        );

        Thread t2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0 ; i < qtd; i++){
                            valores.add(++shared);
                        }
                    }
                }
        );

        Thread t3 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0 ; i < qtd; i++){
                            valores.add(++shared);
                        }
                    }
                }
        );

        //iniciar execução dos processos lado a lado
        t1.start();
        t2.start();
        t3.start();


        int soma = 0;

        for(Integer valor : valores){
            soma += valor;
        }

        System.out.println("Soma: " + soma);
        //deu zero por não esperar o loop acabar

        try {//aguarda finalização das tarefas
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        soma = 0;

        for(Integer valor : valores){
            soma += valor;
        }

        System.out.println("Soma: " + soma);
        //apresentou o valor após o loop
        */

        // Collections
        ArrayList<String> textos =  new ArrayList<>();
        List<String> textosList = new ArrayList<String>();
        //polifomorfismo - Uma classe que instância uma subclasse

        Set<Integer> numeros = new HashSet<Integer>();

        numeros.add(13);
        numeros.add(13);
        numeros.add(22);
        numeros.add(71);
        numeros.add(17);
        numeros.add(17);

        System.out.println(numeros);

        Map<String,String> carro = new TreeMap<String,String>();

        carro.put("a","Ford");
        carro.put("b","Fiat");
        carro.put("top","Ferrari");

        System.out.println(carro.get("top"));

        Collection<String> textosCollection = carro.values();
        for(String s : textosCollection){
            System.out.println(s);
        }
    }
}
