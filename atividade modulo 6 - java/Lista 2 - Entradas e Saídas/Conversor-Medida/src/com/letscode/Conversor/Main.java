package com.letscode.Conversor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);

        int resposta;
        float numeroPolegadas;
        float numeroCentimetros;
        final float CONSTANTE_CONVERSAO = 2.54f;

        System.out.printf
                ("Escolha a conversão que você deseja: 1- Polegadas para Centimetro; 2 - Centimetro para Polegadas : ");
        resposta = lerDados.nextInt();

        switch (resposta){
            case 1:
                System.out.printf("Digite o valor em Polegadas: ");
                numeroPolegadas = lerDados.nextFloat();
                numeroCentimetros = numeroPolegadas * CONSTANTE_CONVERSAO;
                System.out.printf("O valor em centimetros é de %.2f",numeroCentimetros);
                break;
            case 2:
                System.out.printf("Digite o valor em Centimetros: ");
                numeroCentimetros = lerDados.nextFloat();
                numeroPolegadas = numeroCentimetros / CONSTANTE_CONVERSAO;
                System.out.printf("O valor em Polegadas é de %.2f",numeroPolegadas);
                break;
            default:
                System.out.printf("Valor inválido! Digite 1 ou 2 da próxima vez!");
                break;
        }

    }
}
