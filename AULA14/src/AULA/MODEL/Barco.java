package AULA.MODEL;

public class Barco extends Veiculo{
    private int pes;

    public Barco(String fabricante, String modelo, int ano, int tipo, double preco, int pes) {
        super(fabricante, modelo, ano, tipo, preco);
        this.pes = pes;
    }

    public Barco() {}

    public int getPes() {
        return pes;
    }

    public void setPes(int pes) {
        this.pes = pes;
    }
}
