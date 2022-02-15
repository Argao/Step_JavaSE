package DEVER.MODEL;

public class Carro extends Veiculos implements PainelDeControle{
    private String fabricante,modelo,tipo,cambio;
    private double preco;
    private int ano, cavalos;

    public Carro(){
        super();
        this.tipo = "Carro";
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    @Override
    public void ligaDesliga() {
        if(super.isLigado()){
            super.setLigado(false);
            System.out.println("O Veiculo foi Desligado!");
        }else{
            super.setLigado(true);
            System.out.println("O Veiculo foi Ligado!");
        }
    }

    @Override
    public void andaPara() {
        if (super.isLigado()){
            if(super.isMovendo()){
                super.setMovendo(false);
                System.out.println("O Veiculo Parou!");

            }else{
                super.setMovendo(true);
                System.out.println("O veiculo começou a de mover!");

            }
        }else {
            System.out.println("Ligue o veiculo antes de mover");
        }
    }
}
