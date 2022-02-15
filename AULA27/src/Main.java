import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> listaTexto = new ArrayList<String>();
        Map<Integer, Integer> mapNumeros = new TreeMap<Integer,Integer>();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i < 20000 ; i++){
                    Random random = new Random();
                    int letra = random.nextInt(500);
                    listaTexto.add(Integer.toString(letra));
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++){
                    Random random = new Random();
                    mapNumeros.put(i, random.nextInt());
                }
            }
        }
        );

        t1.start();
        t2.start();


        try{
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Lista de Texto");
        for(String a : listaTexto){
            System.out.println(a);
            System.out.println("==============");
        }
        System.out.println("=============\n=============");


        try{
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Map de inteiros");
        for(int i = 0; i<200 ; i++){
            System.out.println(mapNumeros.get(i));
            System.out.println("==============");
        }
        System.out.println("=============\n=============");
    }
}

/*
DEVER DE CASA
-------------

Crie 2 thread que alimentem aleatoriamente uma collection cada.

Cada collection terá 200 itens, sendo uma Arraylist de Strings e
outra um mapTree de inteiros.

Ao final de cada thread imprima os resultados;
 */
