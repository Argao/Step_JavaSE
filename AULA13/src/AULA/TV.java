package AULA;

public abstract class TV {
    private int canal;
    private int volume;
    private boolean on;
    private int tela;
    private boolean mutado;

    protected TV(int tela) {
        this.canal = 11;
        this.volume = 50;
        this.on = false;
        this.tela = tela;
        this.mutado = false;
    }

    protected boolean isMutado() {
        return mutado;
    }

    protected void setMutado(boolean mutado) {
        this.mutado = mutado;
    }

    protected int getCanal() {
        return canal;
    }

    protected void setCanal(int canal) {
        this.canal = canal;
    }

    protected int getVolume() {
        return volume;
    }

    protected void setVolume(int volume) {
        this.volume = volume;
    }

    protected boolean isOn() {
        return on;
    }

    protected void setOn(boolean on) {
        this.on = on;
    }

    protected int getTela() {
        return tela;
    }
}

interface ControleRemoto{
    void mudarCanal(int canal);
    void mudarVolume(int tantinho);
    void ligaDesliga();
    void mutar();
}

class TvModeloCCE01 extends TV implements ControleRemoto{
    private String modelo = "Tv-001MX";

    public TvModeloCCE01(int tela) {
        super(tela);
    }

    public String getModelo(){
        return this.modelo;
    }

    @Override
    public void mudarCanal(int canal) {
        if(isOn())
            super.setCanal(canal);
    }

    @Override
    public void mudarVolume(int tantinho) {
        if(isOn())
            if(super.getVolume() + tantinho > 100)
                super.setVolume(100);
            else if(super.getVolume() + tantinho < 0)
                super.setVolume(0);
            else
                super.setVolume(super.getVolume() + tantinho);
    }

    @Override
    public void ligaDesliga() {
        if(super.isOn()){
            super.setOn(false);
        }else{
            super.setOn(true);
        }
    }

    @Override
    public void mutar() {
        if(isOn())
            if(isMutado())
                super.setMutado(false);
            else
                super.setMutado(true);
    }
}

//----- crie um PSVM e instancie uma tve:
//  ligue, mude canal, abaixe o volume e desligue

class Roda{
    public static void main(String[] args) {
        TvModeloCCE01 minhaTvezinha = new TvModeloCCE01(50);

        minhaTvezinha.ligaDesliga();

        minhaTvezinha.mudarCanal(7);
        System.out.println("Canal " + minhaTvezinha.getCanal());

        minhaTvezinha.mudarVolume(-15);
        System.out.println("Vol " + minhaTvezinha.getVolume());
        minhaTvezinha.mutar();
        System.out.println(minhaTvezinha.isMutado() ?
                                "Mudo" :
                                "Volume" + minhaTvezinha.getVolume());
        minhaTvezinha.ligaDesliga();
    }
}
