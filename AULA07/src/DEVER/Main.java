package DEVER;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
/*
Crie um sistema que receba duas datas e imprima:

-A data anterior
- a diferença entre as duas datas
- as datas somados 3 semanas
- quantos dias tem entre uma data e outra. ++++
 */
public class Main {
    public static void main(String[] args) {
        //variaveis
        Scanner get = new Scanner(System.in);
        DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Date dataprint = new Date();
        Period periodo = Period.ZERO;
        Date dataPrint = new Date();
        long diferencaDias;




        //Recebe as datas
        System.out.println("\nDigite 2 datas.\n");
        System.out.println("===================================");

        System.out.println("Digite o dia da data 1: ");
        int dia1 = get.nextInt();
        System.out.println("Digite o mes da data 1: ");
        int mes1 = get.nextInt() ;
        System.out.println("Digite o ano da data: ");
        int ano1 = get.nextInt();

        System.out.println("\n===================================\n");

        System.out.println("Digite o dia da data 2: ");
        int dia2 = get.nextInt();
        System.out.println("Digite o mes da data 2: ");
        int mes2 = get.nextInt();
        System.out.println("Digite o ano da data 2: ");
        int ano2 = get.nextInt();

        LocalDate data1 = LocalDate.of(ano1,mes1,dia1);
        LocalDate data2 = LocalDate.of(ano2,mes2,dia2);

        //Data anterior

        if (data1.isBefore(data2)){
            System.out.println("\nA data 1 é anterior a data 2");
            periodo = Period.between(data1, data2);
            diferencaDias = ChronoUnit.DAYS.between(data1,data2);
        }else if (data1.isAfter(data2)){
            System.out.println("\nA data 2 é anterior a data 1");
            periodo = Period.between(data2, data1);
            diferencaDias = ChronoUnit.DAYS.between(data2,data1);
        }else {
            System.out.println("\nAs datas são iguais");
            diferencaDias = ChronoUnit.DAYS.between(data2,data1);
        }
        System.out.println("\n===================================\n");

        //Diferença entre as datas
        System.out.println("A diferença entre as datas é de: " + periodo.getYears() + " anos "
                            + periodo.getMonths() + " meses " + periodo.getDays() + " dias");
        System.out.println("\n===================================\n");

        //Somando 3 semanas

        System.out.println("Data 1 somando 3 semanas: " + data1.plusWeeks(3).format(formataData));
        System.out.println("Data 2 somando 3 semanas: " + data2.plusWeeks(3).format(formataData));

        //diferença das datas em dias
        System.out.println("A diferença entra a data 1 e a data2 é de " + diferencaDias + " dias." );

















    }
}
