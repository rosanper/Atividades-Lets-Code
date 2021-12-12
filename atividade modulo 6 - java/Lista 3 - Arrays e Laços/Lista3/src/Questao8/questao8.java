package Questao8;

import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner lerInformacoes = new Scanner(System.in);

        String[] nomes = new String[5];
        float[] alturas = new float[5];
        float[] pesos = new float[5];
        String[] informacaoImc = new String[5];

        String nome;
        float altura;
        float peso;
        float imc;


        for(int i = 0; i< nomes.length;i++){
            System.out.printf("Digite o nome da pessoa: ");
            nome = lerInformacoes.next();
            System.out.printf("Digite a altura da pessoa: ");
            altura = lerInformacoes.nextFloat();
            System.out.printf("Digite o peso da pessoa: ");
            peso = lerInformacoes.nextFloat();

            nomes[i] = nome;
            alturas[i] = altura;
            pesos[i] = peso;

            imc = calcularImc(peso,altura);
            if(18.5 < imc && imc < 25 ){
                informacaoImc[i] = "ideal";
            }else{
                informacaoImc[i] = "fora do ideal";
            }
        }


        System.out.printf("Dados digitados: ");
        for (int i=0;i< nomes.length;i++){
            System.out.printf("\nnome: %s | altura: %.2f | peso: %.2f", nomes[i], alturas[i],pesos[i]);
        }

        System.out.printf("\nPessoas com IMC fora do ideal: ");
        for (int i=0;i<informacaoImc.length;i++){
            if(informacaoImc[i] != "ideal"){
                System.out.printf("%s, ",nomes[i]);
            }
        }


    }

    public static float calcularImc(float peso, float altura){
        return peso / (altura*altura);
    }
}
