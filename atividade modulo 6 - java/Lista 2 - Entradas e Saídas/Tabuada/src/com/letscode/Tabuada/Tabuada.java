package com.letscode.Tabuada;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner lerNumero = new Scanner(System.in);

        System.out.print("Digite um numero inteiro para ver sua tabuada: ");
        int numero = lerNumero.nextInt();

        int numeroVezesUm = numero * 1;
        int numeroVezesDois = numero * 2;
        int numeroVezestres = numero * 3;
        int numeroVezesQuatro = numero * 4;
        int numeroVezesCinco = numero * 5;
        int numeroVezesSeis = numero * 6;
        int numeroVezesSete = numero * 7;
        int numeroVezesOito = numero * 8;
        int numeroVezesNove = numero * 9;
        int numeroVezesDez = numero * 10;

        System.out.println("Tabuada do numero inserido:");
        resultados(numero, numeroVezesUm, numeroVezesDois, numeroVezestres, numeroVezesQuatro,
                numeroVezesCinco, numeroVezesSeis, numeroVezesSete, numeroVezesOito, numeroVezesNove,
                numeroVezesDez);

    }

    private static void resultados(int numero, int numeroVezesUm, int numeroVezesDois, int numeroVezestres,
                                   int numeroVezesQuatro, int numeroVezesCinco, int numeroVezesSeis,
                                   int numeroVezesSete, int numeroVezesOito, int numeroVezesNove, int numeroVezesDez) {

        System.out.printf("%d * 1 = %d \n", numero, numeroVezesUm);
        System.out.printf("%d * 2 = %d \n", numero, numeroVezesDois);
        System.out.printf("%d * 3 = %d \n", numero, numeroVezestres);
        System.out.printf("%d * 4 = %d \n", numero, numeroVezesQuatro);
        System.out.printf("%d * 5 = %d \n", numero, numeroVezesCinco);
        System.out.printf("%d * 6 = %d \n", numero, numeroVezesSeis);
        System.out.printf("%d * 7 = %d \n", numero, numeroVezesSete);
        System.out.printf("%d * 8 = %d \n", numero, numeroVezesOito);
        System.out.printf("%d * 9 = %d \n", numero, numeroVezesNove);
        System.out.printf("%d * 10 = %d \n", numero, numeroVezesDez);
    }



}
