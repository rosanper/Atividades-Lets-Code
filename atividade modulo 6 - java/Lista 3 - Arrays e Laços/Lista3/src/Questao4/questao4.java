package Questao4;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner lerNumero = new Scanner(System.in);

        int[] numeros = new int[5];
        int maiorNumero = numeros[0];
        int menorNumero = numeros[0];
        int soma = 0;
        float media;
        int numero;

        System.out.println("Digite cinco numeros inteiros:");
        for(int i=0;i<numeros.length;i++){
            numero= lerNumero.nextInt();
            numeros[i] = numero;
            soma += numero;
            if(numero>maiorNumero){
                maiorNumero = numero;
            }
            if(numero<menorNumero){
                menorNumero = numero;
            }
        }

        media = (float) soma/numeros.length;
        System.out.printf("O maior número digitado foi %d, o menor foi %d e a media dos números digitados %.2f",
                maiorNumero, menorNumero, media);
    }
}
