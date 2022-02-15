package AULA.MODEL;

public class Carro extends Veiculo{
    private int portas;
    private String cambio;

    public Carro(String fabricante, String modelo, int ano, double preco, int portas, String cambio) {
        super(fabricante, modelo, ano, 1, preco);
        this.portas = portas;
        this.cambio = cambio;
    }

    public Carro() {
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }
}
