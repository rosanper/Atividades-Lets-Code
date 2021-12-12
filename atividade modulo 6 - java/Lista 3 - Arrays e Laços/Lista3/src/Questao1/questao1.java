package Questao1;

import java.util.Arrays;
import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner lerFruta = new Scanner(System.in);
        String[] listaFrutas = new String[5];

        System.out.println("Digite cinco frutas: ");
        for(int i = 0;i<listaFrutas.length;i++){
            listaFrutas[i] = lerFruta.next();
        }

        System.out.printf("Lista de frutas: ");
        for(String fruta : listaFrutas){
            System.out.printf("%s ",fruta);
        }

//        System.out.println(Arrays.toString(listaFrutas));
    }
}
