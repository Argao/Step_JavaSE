package DEVER;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer> mapTree = new TreeMap<>();
        List<String> textos =  new ArrayList<>();
        Random aleatorio = new Random();
        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 200; i++){
                            mapTree.put(i,aleatorio.nextInt());
                        }
                    }
                }
        );

        Thread t2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 200; i++){
                          int tamanho = aleatorio.nextInt(20) + 1;
                          String string = "";
                          for (int j =0; j < tamanho; j ++){
                              string +=  (char) (aleatorio.nextInt(93) + 33) ;
                          }
                          textos.add(string);
                        }
                    }
                }
        );

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("=========Strings Aleatorias=============\n");
        for (String s : textos){
            System.out.println(s);
        }

        System.out.println("\n============Inteiros Aleatorios===========\n");

        for (int i = 0; i < mapTree.size(); i++){
            System.out.println(mapTree.get(i));
        }
    }


}
