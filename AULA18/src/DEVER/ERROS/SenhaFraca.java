package DEVER.ERROS;

public class SenhaFraca extends Exception{
    @Override
    public String getMessage(){
        return "A senha tem que ter pelo menos um numero e um caractere especial!";
    }
}
