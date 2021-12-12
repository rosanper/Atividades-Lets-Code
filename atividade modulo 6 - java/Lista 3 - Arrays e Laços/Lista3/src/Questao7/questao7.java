package Questao7;

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner lerInformacoes = new Scanner(System.in);

        String[] nomes = new String[5];
        int[] idades = new int[5];

        String nome;
        String maisVelho;
        String maisNovo;
        int idade;
        int idadeMaisVelha = 0;    // valor arbitrário para iniciar (ninguém tem menos de 0 anos)
        int idadeMaisNova = 200;   // valor arbitrário para iniciar (ninguém tem mais de 200 anos)
        int indexMaisVelho = 0;
        int indexMaisNovo = 0;
        int soma = 0;
        float media;

        for(int i = 0; i< nomes.length;i++){
            System.out.printf("Digite o nome da pessoa: ");
            nome = lerInformacoes.next();
            System.out.printf("Digite a idade da pessoa: ");
            idade = lerInformacoes.nextInt();

            nomes[i] = nome;
            idades[i] = idade;
            soma += idade;

            if(idade>idadeMaisVelha){
                indexMaisVelho = i;
                idadeMaisVelha = idade;
            }
            if(idade<idadeMaisNova){
                indexMaisNovo = i;
                idadeMaisNova = idade;
            }
        }


        maisVelho = nomes[indexMaisVelho];

        maisNovo = nomes[indexMaisNovo];

        media = (float) soma/idades.length;

        System.out.printf("Dados digitados: ");
        for (int i=0;i< nomes.length;i++){
            System.out.printf("\nnome: %s | idade: %d", nomes[i], idades[i]);
        }

        System.out.printf
                ("\nA pessao mais velha é %s (%d anos), a mais nova é %s(%d anos), e a media das idades é %.2f",
                maisVelho,idadeMaisVelha,maisNovo,idadeMaisNova,media);

    }
}
