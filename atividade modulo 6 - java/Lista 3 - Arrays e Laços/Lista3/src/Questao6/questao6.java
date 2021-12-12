/*OBS: Na resolção dessa questão foi considerado que o primeiro caractere
é a primeira letra da palavra*/

package Questao6;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner lerNome = new Scanner(System.in);

        String nomeModificado = "";

        System.out.printf("Digite um nome: ");
        String nome = lerNome.next();

        char[] letras = nome.toCharArray();

        for (int i=0; i< letras.length;i++){
            if(i % 2 == 0){
                nomeModificado += Character.toUpperCase(letras[i]);
            }else{
                nomeModificado += Character.toLowerCase(letras[i]);
            }
        }

        System.out.printf("A palavra modificada é: %s",nomeModificado);
    }
}
