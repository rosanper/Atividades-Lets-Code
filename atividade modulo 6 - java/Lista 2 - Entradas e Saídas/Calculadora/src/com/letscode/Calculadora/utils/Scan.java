package com.letscode.Calculadora.utils;

import java.util.Scanner;

public class Scan {
    static Scanner lerNumeros = new Scanner(System.in);

    public static int numero(){
        int numero = lerNumeros.nextInt();
        return numero;
    }
}
