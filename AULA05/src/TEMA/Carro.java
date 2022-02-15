package TEMA;

public class Carro {
    private String modelo, fabricante;
    private int ano;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void imprime(){
        System.out.println("Modelo: "       + this.modelo);
        System.out.println("Fabricante: "   + this.fabricante);
        System.out.println("Ano: "          + this.ano);
    }
}
