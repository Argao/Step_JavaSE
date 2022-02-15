package TEMA;

import java.util.concurrent.Callable;

public class ExemploChamavel implements Callable<String> {
    private final long tempoDeEspera;

    public ExemploChamavel(int tempo){
        this.tempoDeEspera = tempo;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(tempoDeEspera);
        return Thread.currentThread().getName();
    }
}
