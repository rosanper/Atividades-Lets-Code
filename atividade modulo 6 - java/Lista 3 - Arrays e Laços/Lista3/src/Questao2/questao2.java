package Questao2;


import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner lerPalavra = new Scanner(System.in);
        System.out.printf("Digite uma palavra: ");
        String palavra = lerPalavra.next();
        char[] letras = palavra.toCharArray();
        String palavraAoContrario = "";

        for(int i= letras.length-1; i>=0;i--){
            palavraAoContrario += letras[i];
        }

        System.out.printf("%s ao contrário é %s", palavra, palavraAoContrario);
    }



}
