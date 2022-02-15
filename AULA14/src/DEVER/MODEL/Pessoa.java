package DEVER.MODEL;

public abstract class Pessoa {
    private String nome,cpf,telefone,sangue;

    protected Pessoa(String nome,String cpf, String telefone, String sangue) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.sangue = sangue;
    }

    protected Pessoa() {
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getCpf() {
        return cpf;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }

    protected String getTelefone() {
        return telefone;
    }

    protected void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    protected String getSangue() {
        return sangue;
    }

    protected void setSangue(String sangue) {
        this.sangue = sangue;
    }
}
