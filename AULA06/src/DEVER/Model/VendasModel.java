package DEVER.Model;

public class VendasModel {
    private int idCliente,idLivro,idFuncionario;

    public VendasModel(){}
    public VendasModel(int idCliente,int idLivro,int idFuncionario){
        this.setIdCliente(idCliente);
        this.setIdLivro(idLivro);
        this.setIdFuncionario(idFuncionario);
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
}
