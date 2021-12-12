package com.letscode.piramide;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lerNumero = new Scanner(System.in);

        System.out.printf("digite um numero:");
        int numero = lerNumero.nextInt();

        int altura = numero;
        int base = numero + (numero - 1);

        char[][] piramide = new char[altura][base];

        int n = 0;     // utilizado para fazer o calculo e criar o formato da piramide.
        for(int i = altura - 1; i >= 0; i--){
            for(int j = 0; j < piramide[i].length; j++){
                int linhaPar = i % 2;
                int alturaPar = j % 2;
                if(j < n || j > base-1-n){
                    piramide[i][j]=' ';
                }else {
                    if (numero % 2 == 0) {     // quando a base é par
                        if (linhaPar == 0) {               // quando a linha é par
                            if (alturaPar == 0) {
                                piramide[i][j] = ' ';
                            } else {
                                piramide[i][j] = '*';
                            }

                        } else {                            // quando a linha é impar
                            if (alturaPar == 0) {
                                piramide[i][j] = '*';
                            } else {
                                piramide[i][j] = ' ';
                            }
                        }
                    } else {                  // mesma lógica quando a base é impar
                        if (linhaPar == 0) {
                            if (alturaPar == 0) {
                                piramide[i][j] = '*';
                            } else {
                                piramide[i][j] = ' ';
                            }

                        } else {
                            if (alturaPar == 0) {
                                piramide[i][j] = ' ';
                            } else {
                                piramide[i][j] = '*';
                            }
                        }
                    }
                }
            }
            n++;

        }

        for(int i = 0; i < piramide.length; i++){
            System.out.printf("\n");
            for(int j = 0; j < piramide[i].length; j++){
                System.out.print(piramide[i][j]);
            }
        }
        System.out.printf("\n");
    }
}
