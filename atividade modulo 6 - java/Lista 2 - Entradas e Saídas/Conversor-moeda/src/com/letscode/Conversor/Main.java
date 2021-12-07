package com.letscode.Conversor;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lerNumeros = new Scanner(System.in);

        Locale localeUS = new Locale("en","US");
        NumberFormat formatoDolar = NumberFormat.getCurrencyInstance(localeUS);

        System.out.printf("Digite a contação atual do Dolar: ");
        float cotacaoAtualDolar = lerNumeros.nextFloat();
        System.out.printf("Digite o valor em Real: ");
        float valorEmReal = lerNumeros.nextFloat();

        float valorEmDolar = valorEmReal/cotacaoAtualDolar;
        System.out.printf("O valor em Dolar é %s", formatoDolar.format(valorEmDolar));
    }
}
