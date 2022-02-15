package DEVER_SALA.MODEL;

import java.time.LocalDate;

public class Aluno {
    private String nome, sexo, turno;
    private LocalDate nascimento;

    public Aluno(){}

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

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
        this.sexo = sexo;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        String [] data = new String[1];
        if(nascimento.contains("/"))
            data = nascimento.split("/");

        if(nascimento.contains("-"))
            data = nascimento.split("-");


        this.nascimento = LocalDate.of(Integer.parseInt(data[2]),
                                        Integer.parseInt(data[1]),
                                        Integer.parseInt(data[0]));
    }
}
