package DEVER.MODEL;

public class Barco extends Veiculos implements PainelDeControle {
    private int pes;
    private String fabricante,modelo,tipo;
    private double preco;
    private int ano;

    public Barco(){
        super();
        this.tipo = "Barco";

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

    public int getPes() {
        return pes;
    }

    public void setPes(int pes) {
        this.pes = pes;
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
                System.out.println("O veiculo começou a de mover!");
            }else{
                super.setMovendo(true);
                System.out.println("O Veiculo Parou!");
            }
        }else {
            System.out.println("Ligue o veiculo antes de mover");
        }
    }
}
