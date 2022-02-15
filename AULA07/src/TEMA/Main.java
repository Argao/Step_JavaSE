package TEMA;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println("Hoje é: " + data);


        Calendar data2 = Calendar.getInstance();
        System.out.println("Hoje é: " + data2);
        System.out.println("Hoje é: " + data2.getTime());
        System.out.println("Ano: " + data2.get(Calendar.YEAR) );
        System.out.println("Mês: " + data2.get(Calendar.MONTH) );
        System.out.println("dia: " + data2.get(Calendar.DAY_OF_MONTH) );
        System.out.println("Semana: " + data2.get(Calendar.DAY_OF_WEEK) );
        System.out.println("DIA: " + data2.get(Calendar.DAY_OF_YEAR) );

        data2.set(Calendar.YEAR, 1985);
        data2.set(Calendar.MONTH, 4);
        data2.set(Calendar.DAY_OF_MONTH, 7);

        System.out.println("Aniversário do professor: " + data2.getTime());

        int hora = data2.get(Calendar.HOUR_OF_DAY);



        if(hora < 12){
            System.out.println("Está de manhã");
        }if(hora < 18){
            System.out.println("Está de tarde");
        }else{
            System.out.println("Está de noite");
        }
    }
}
