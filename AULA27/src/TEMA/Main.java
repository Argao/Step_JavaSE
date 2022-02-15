package TEMA;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        List<ExemploChamavel> tarefas = Arrays.asList(
                new ExemploChamavel(7000),
                new ExemploChamavel(5000),
                new ExemploChamavel(10000)
        );

        ExecutorService pool = Executors.newFixedThreadPool(3);
        ExecutorCompletionService<String> completionService =
                new ExecutorCompletionService<>(pool);

        for(ExemploChamavel a : tarefas){
            completionService.submit(a);
        }
        System.out.println("Tarefas INICIADAS");

        for(int i = 0; i< tarefas.size();i++){
            try{
                System.out.println(completionService.take().get());
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        pool.shutdown();
    }
}
