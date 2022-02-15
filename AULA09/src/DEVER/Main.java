package DEVER;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia =  new Scanner(System.in);
        int dia, mes, ano;

        System.out.print("Dia da data 1: ");
        dia = leia.nextInt();

        System.out.print("Mês: ");
        mes = leia.nextInt();

        System.out.print("Ano(ex: 2020): ");
        ano = leia.nextInt();

        LocalDate data1 =  LocalDate.of(ano, mes, dia);

        System.out.print("Dia da data 2: ");
        dia = leia.nextInt();

        System.out.print("Mês: ");
        mes = leia.nextInt();

        System.out.print("Ano(ex: 2020): ");
        ano = leia.nextInt();

        LocalDate data2 =  LocalDate.of(ano, mes, dia);
        boolean isEqual = false;

        if (data1.isBefore(data2)){
            System.out.println("A data 1 é anterior à data 2.");
        }else if (data1.isEqual(data2)){
            System.out.println("A data 1 é igual à data 2.");
            isEqual = true;
        }else{
            System.out.println("A data 2 é anterior à data1.");

            LocalDate aux = data1;
            data1 = data2;
            data2 = aux;
        }

        if(isEqual){
            System.out.println("Não há intervalo ou diferença de dias.");
        } else {
            Period intervalo = Period.between(data1,data2);

            System.out.println("São " + intervalo.getYears() + " anos, "+
                               intervalo.getMonths() + " mêses," +
                                intervalo.getDays() + " dias entre as duas datas");
            System.out.println("Data 1 + 3 semanas: " + data1.plusWeeks(3));
            System.out.println("Data 2 + 3 semanas: " + data2.plusWeeks(3));
            System.out.println("Diferença de dias: " + ChronoUnit.DAYS.between(data1,data2));
        }

    }
/*
EXERCÍCIO

Crie um sistema de cadastro de Alunos. Aluno tem nome, data de nascimento e sexo

Relatórios:
Alunos dimaió
Alunos dimenó
Alunos dimenó menino
Alunos dimenó menina

-- carlino.junior@itstep.org
ASSUNTO: 20WPS5
 */
}
/*
Crie um sistema que receba duas datas e imprima:

- A data anterior
- a diferença entre as duas datas
- as datas somados 3 semanas
- quantos dias tem entre uma data e outra. ++++
 */