package Main;

import java.util.concurrent.Callable;

public class GetPessoa implements Callable<Pessoa> {
    private final long tempoDeEspera;
    private Pessoa pessoa;

    public GetPessoa(int tempo,String nome,String sexo, int idade){
        this.tempoDeEspera = tempo;
        pessoa = new Pessoa(nome,sexo,idade);
    }
    @Override
    public Pessoa call() throws Exception {


        return pessoa;
    }
}