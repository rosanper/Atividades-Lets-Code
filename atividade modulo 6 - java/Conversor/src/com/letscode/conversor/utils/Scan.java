package com.letscode.conversor.utils;

import java.util.Scanner;

public class Scan {
    static Scanner leituraDados = new Scanner(System.in);

    public static double temperaturaEmCelsius(){
        double temperaturaCelsius = leituraDados.nextDouble();
        return temperaturaCelsius;
    }

    public static char respostaConverterNovamente(){
        char resposta = leituraDados.next().charAt(0);
        return resposta;
    }

}
