package AULA.MODEL;

import java.time.LocalDate;

public class Turma {
    private String nome, turno;
    private LocalDate inicio, fim;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        String [] data = new String[1];
        if(inicio.contains("/"))
            data = inicio.split("/");

        if(inicio.contains("-"))
            data = inicio.split("-");


        this.inicio = LocalDate.of(Integer.parseInt(data[2]),
                Integer.parseInt(data[1]),
                Integer.parseInt(data[0]));
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(String fim) {
        String [] data = new String[1];
        if(fim.contains("/"))
            data = fim.split("/");

        if(fim.contains("-"))
            data = fim.split("-");


        this.fim = LocalDate.of(Integer.parseInt(data[2]),
                Integer.parseInt(data[1]),
                Integer.parseInt(data[0]));
    }

}
