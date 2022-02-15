package DEVER;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

        public static void main(String[] args) {
            List<GetPessoa> Pessoas = Arrays.asList(
                    new GetPessoa("Pedro" , "Masculino", 27),
                    new GetPessoa("João", "Masculino", 21),
                    new GetPessoa("Bia", "Feminino", 30),
                    new GetPessoa("Carol", "Feminino", 15)
            );
            ExecutorService pool = Executors.newFixedThreadPool(4);
            ExecutorCompletionService<Pessoa> completionService = new ExecutorCompletionService<>(pool);

            for (GetPessoa p : Pessoas){
                completionService.submit(p);
            }
            System.out.println("Terefas Iniciadas");

            for(int i = 0; i < Pessoas.size(); i ++){
                try{
                    completionService.take().get().imprime();
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
            pool.shutdown();
        }
    }

