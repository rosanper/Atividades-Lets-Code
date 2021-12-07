package com.letscode.Calculadora;

import com.letscode.Calculadora.Service.Operacoes;
import com.letscode.Calculadora.utils.Print;
import com.letscode.Calculadora.utils.Scan;

public class Main {

    public static void main(String[] args){
        int primeiroNumero;
        int segundoNumero;

        Print.mensagemEntradaNumeros();
        primeiroNumero = Scan.numero();
        segundoNumero = Scan.numero();

        float resultadoSoma = Operacoes.Soma(primeiroNumero,segundoNumero);
        float resultadoSubtracao = Operacoes.subtracao(primeiroNumero,segundoNumero);
        float resultadoMultiplicacao = Operacoes.multiplicacao(primeiroNumero,segundoNumero);
        float resultadoDivisao = Operacoes.divisao(primeiroNumero,segundoNumero);

        Print.resultados(resultadoSoma,resultadoSubtracao,resultadoMultiplicacao,resultadoDivisao);


    }
}
