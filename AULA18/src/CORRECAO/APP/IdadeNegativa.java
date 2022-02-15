package CORRECAO.APP;

public class IdadeNegativa extends Exception{
    @Override
    public String getMessage(){
        return "A idade informada é negativa!";
    }
}
