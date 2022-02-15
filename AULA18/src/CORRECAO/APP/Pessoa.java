package CORRECAO.APP;

public class Pessoa {
    private String nome, sexo;
    private int idade;

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public Pessoa() {
    }

    public void imprime(){
        System.out.println("Nome: " + getNome());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Idade: " + getIdade());
    }

    public String toString(){
        return (this.getNome() + "###" + this.getSexo() + "###" + this.getIdade());
    }

    public void StringParse(String a){
        String[] dados = a.split("###");

        this.setNome(dados[0]);
        this.setSexo(dados[1]);
        this.setIdade(Integer.parseInt(dados[2]));
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {

        if(idade < 0){
            try {
                throw new IdadeNegativa();
            } catch (IdadeNegativa e) {
                System.out.println(e);
            }
        }
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
/*
em um projeto novo, receba do usuário uma frase que obrigatóriamente tenha um
número.
Crie a exception semNumeros

Minha casa é bonitinha. -> semnumeros
MinhaCasa 2 é bonintinha - tem números
 */