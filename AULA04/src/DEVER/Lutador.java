package DEVER;



public class Lutador {
    private String nome,sexo;
    private int idade;
    private float peso, altura;

    public Lutador (){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
      if (sexo.toLowerCase().equals("m") || sexo.toLowerCase().equals("f")){
          this.sexo = sexo.toLowerCase();
      }else {
          System.out.println("Erro! Digite apenas m ou f!");
      }

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String switchSexo(){
        switch (this.sexo){
            case "m":
                return "Masculino";
            case "f":
                return "Feminino";
            default:
                return this.sexo;
        }
    }

    public void imprimeMulheresMenores(){
        if (this.sexo.toLowerCase().equals("f") && this.idade < 18){
            System.out.println();
            System.out.println("\tNome: \t" + nome);
            System.out.println("\tSexo: \t" + switchSexo());
            System.out.println("\tIdade: \t" + idade);
            System.out.println("\tPeso: \t"  + peso);
            System.out.println("\tAltura: " + altura);
        }
    }
    public void imprimeHomensMenores(){
        if (this.sexo.toLowerCase().equals("m") && this.idade < 18){
            System.out.println();
            System.out.println("\tNome: \t" + nome);
            System.out.println("\tSexo: \t" + switchSexo());
            System.out.println("\tIdade: \t" + idade);
            System.out.println("\tPeso: \t"  + peso);
            System.out.println("\tAltura: " + altura);
        }
    }

    public void imprimeHomensMaiores(){
        if (this.sexo.toLowerCase().equals("m") && this.idade >= 18){
            System.out.println();
            System.out.println("\tNome: \t" + nome);
            System.out.println("\tSexo: \t" + switchSexo());
            System.out.println("\tIdade: \t" + idade);
            System.out.println("\tPeso: \t"  + peso);
            System.out.println("\tAltura: " + altura);
        }
    }
    public void imprimeMulheresMaiores(){
        if (this.sexo.toLowerCase().equals("m") && this.idade >= 18){
            System.out.println();
            System.out.println("\tNome: \t" + nome);
            System.out.println("\tSexo: \t" + switchSexo());
            System.out.println("\tIdade: \t" + idade);
            System.out.println("\tPeso: \t"  + peso);
            System.out.println("\tAltura: " + altura);
        }
    }

}
