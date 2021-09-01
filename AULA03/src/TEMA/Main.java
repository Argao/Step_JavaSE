package TEMA;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Juca Bala";
        p1.genero = "outro";
        p1.idade = 18;

        Animal dog = new Animal("Totó","late");
        Animal gato = new Animal(12);
        Animal generico = new Animal();


        System.out.println(gato.nome);
        System.out.println(gato.som);
        System.out.println(generico.nome);
        System.out.println(generico.som);

        Veiculo carro = new Veiculo();
    }
}

class Pessoa{
    String nome = "Player", genero;
    int idade;
}

class Animal{
    String nome, som;

    Animal(String nome, String som){
        this.nome = nome;
        this.som = som;
    }
    Animal(){}
    Animal(int opcao){
        this.nome = "Garfield";
        this.som = "reclama da segunda-feira";
    }
}
class Casa{
    Pessoa dono = new Pessoa();
    Animal [] mascote = new Animal[3];
    String address;

    Casa(){
        this.dono.idade = 30;
        this.dono.genero = "Não declarado";
        this.dono.nome = "Juca Bala";
        this.address = "Rua dos bobos, 0";
        for(int i= 0; i<this.mascote.length ; i++){
            mascote[i] = new Animal(1);
        }
    }
}