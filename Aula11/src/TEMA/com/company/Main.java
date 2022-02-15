package TEMA.com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(15);

        List<String> lista2 = new ArrayList<String>();
        lista2.add("João das Couves");
        lista2.add("Ana Bala");
        lista2.add("Zeca Bala");
        lista2.add("Tião Bala");

        Collections.sort(lista2);//ordem crescente
        System.out.println(lista2);

        Collections.shuffle(lista2);//embaralha
        System.out.println(lista2);

        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(new Aluno("Juca","java", 7));
        alunos.add(new Aluno("Ana","html", 10));
        alunos.add(new Aluno("tião","postgresql", 5));

        Aluno a = new Aluno("Juca", "Node",5);

        ComparaAluno compara = new ComparaAluno();
        Collections.sort(alunos, compara);

        for(Aluno aluno : alunos){
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Curso : " + aluno.getCurso());
            System.out.println("Nota: " + aluno.getNota());
            System.out.println("---------------------------");
        }
        //ordene por curso

    }
}

class Aluno implements Comparable<Aluno>{
    private String nome, curso;
    private double nota;

    public Aluno(String nome, String curso, double nota){
        this.nome = nome;
        this.nota = nota;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(Double.toString(aluno.getNota()));
    }
}

class ComparaAluno implements Comparator<Aluno>{

    public int compare(Aluno x, Aluno y){
        return Double.toString(x.getNota()).compareTo(Double.toString(y.getNota()));
    }

}