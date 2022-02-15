package AULA.MODEL;

public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(String fabricante, String modelo, int ano, int tipo, double preco, int cilindrada) {
        super(fabricante, modelo, ano, tipo, preco);
        this.cilindrada = cilindrada;
    }

    public Moto() {}

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
