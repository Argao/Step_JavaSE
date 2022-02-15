package AULA.MODEL;


import java.time.LocalDate;

public class Matricula implements Comparable<Matricula>{
    private Aluno aluno;
    private Turma turma;
    private LocalDate data =  LocalDate.now();

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public int compareTo(Matricula matricula) {
        return this.aluno.getNome().compareTo(matricula.aluno.getNome());
    }
}