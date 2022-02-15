package DEVER.MODEL;

public class Moto extends Veiculos implements PainelDeControle {
    int cilindrada;
    private String fabricante,modelo,tipo;
    private double preco;
    private int ano;


    public Moto() {
        super();
        this.tipo = "Moto";
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

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


    @Override
    public void ligaDesliga() {
        if(super.isLigado()){
            super.setLigado(false);
            System.out.printf("O Veiculo foi Desligado!\n");
        }else{
            super.setLigado(true);
            System.out.printf("O Veiculo foi Ligado!\n");
        }
    }

    @Override
    public void andaPara() {
        if (super.isLigado()){
            if(super.isMovendo()){
                super.setMovendo(false);
                System.out.printf("O Veiculo Parou!\n");
            }else{
                super.setMovendo(true);
                System.out.printf("O veiculo começou a de mover!\n");
            }
        }else {
            System.out.printf("Ligue o veiculo antes de mover\n");
        }
    }
}
