package com.letscode.Calculadora.utils;

public class Print {
    public static void mensagemEntradaNumeros(){
        System.out.println("Digite dois números inteiros:");
    }

    public static void resultados
            (float resultadoSoma,float resultadoSubtracao,float resultadoMultiplicacao,float resultadoDivisao){

        System.out.printf("A soma desses dois números é %.2f ",resultadoSoma);
        System.out.printf("\nA subtração desses dois números é %.2f ",resultadoSubtracao);
        System.out.printf("\nA multiplicação desses dois números é %.2f ",resultadoMultiplicacao);
        System.out.printf("\nA divisão desses dois números é %.2f ",resultadoDivisao);
    }


}
