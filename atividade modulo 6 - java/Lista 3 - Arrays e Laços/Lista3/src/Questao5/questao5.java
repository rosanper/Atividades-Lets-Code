package Questao5;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner lerNomes = new Scanner(System.in);

        String[] nomes = new String[5];
        String nome;
        int tamanhoNome = 0;
        String maiorNome = nomes[0];
        int tamanhoMaiorNome = 0;

        System.out.println("Digite cinco nomes: ");

        for(int i=0;i< nomes.length;i++){
            nome = lerNomes.next();
            nomes[i] = nome;
            tamanhoNome = nome.length();
            if(tamanhoNome>tamanhoMaiorNome){
                maiorNome = nome;
                tamanhoMaiorNome = tamanhoNome;
            }
        }

        System.out.printf("O maior nome digitado foi: %s", maiorNome);

    }
}
