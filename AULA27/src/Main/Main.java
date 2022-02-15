package Main;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        List<GetPessoa> Pessoas = Arrays.asList(
                new GetPessoa(7000,"Antonio" , "Masculino", 77),
                new GetPessoa(4000,"Bernardo", "Masculino", 21),
                new GetPessoa(10000,"Carla", "Feminino", 49),
                new GetPessoa(12000,"Dante", "Masculino", 100)
        );
        ExecutorService pool = Executors.newFixedThreadPool(3);
        ExecutorCompletionService<Pessoa> completionService = new ExecutorCompletionService<>(pool);

        for (GetPessoa a : Pessoas){
            completionService.submit(a);
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
