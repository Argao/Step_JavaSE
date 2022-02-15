package DEVER.MODEL;

public abstract class Veiculos {
    private boolean ligado,movendo;

    protected Veiculos(){
        this.ligado = false;
        this.movendo = false;
    }




    protected boolean isLigado() {
        return ligado;
    }

    protected void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    protected boolean isMovendo() {
        return movendo;
    }
    protected void setMovendo(boolean movendo) {
        this.movendo = movendo;
    }
}

interface PainelDeControle{
    void ligaDesliga();
    void andaPara();
}


