package TEMA;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //SUBSTRINGS

        String frase = "Essa frase é exemplo de escrita única";

        System.out.println(frase.length());
        System.out.println(frase.charAt(1));

        char caracteres [] = {'s','e','n','h','a'};
        String palavra = new String(caracteres);

        System.out.println(palavra);

        System.out.println(palavra.codePointAt(0));
        //codigo UNICODE ASCII

        boolean condicao = true;

        int sexo = 1;

        System.out.println(sexo == 1 ? "Feminino" : "Masculino");
        //Expressão ternária

        condicao = sexo == 1 ? true : false;

        System.out.println(frase.startsWith("escola"));
        System.out.println(frase.endsWith("escola"));

        for(char letra : frase.toCharArray()){
            System.out.println("Letra: "+letra);
        }

        System.out.println(frase.trim());

        System.out.printf("Estou chegando ao número %d entre %d.\n", 171, 200);
        System.out.printf("Valor: R$ %.2f\n", 1725.46548);
        double total = 2.0/7.0;
        System.out.printf("2/7 = %2f\n",total);

        System.out.printf ( "A frase \"%s\" foi usada como exemplo\n", frase );

        System.out.println(frase.substring(12));

        System.out.println(frase.substring(0,11));

        System.out.println(frase.substring(frase.toLowerCase().indexOf("exemplo")));
    }
}
