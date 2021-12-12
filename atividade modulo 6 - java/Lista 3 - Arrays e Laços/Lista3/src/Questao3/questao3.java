package Questao3;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner lerNumero = new Scanner(System.in);

        int[] numeros = new int[5];
        int[] pares = new int[5];
        int[] impares = new int[5];
        int numero;

        System.out.println("Digite cinco numeros inteiros:");
        for(int i=0;i<numeros.length;i++){
            numero= lerNumero.nextInt();
            numeros[i] = numero;
            if(numero%2 == 0){
                pares[i]=numero;
            }else{
                impares[i]=numero;
            }
        }
        System.out.println("Os números pares são:");
        for(int elemento: pares){
            if(elemento!=0){
                System.out.printf("%d ",elemento);
            }

        }
        System.out.println("\nOs números impares são:");
        for(int elemento: impares){
            if(elemento!=0){
                System.out.printf("%d ",elemento);
            }

        }
    }
}
