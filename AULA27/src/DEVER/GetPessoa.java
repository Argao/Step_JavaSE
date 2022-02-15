package DEVER;

import java.util.concurrent.Callable;

public class GetPessoa implements Callable<Pessoa> {
    private Pessoa pessoa;

    public GetPessoa(String nome,String sexo, int idade){

        pessoa = new Pessoa(nome,sexo,idade);
    }
    @Override
    public Pessoa call() throws Exception {

        return pessoa;
    }
}
