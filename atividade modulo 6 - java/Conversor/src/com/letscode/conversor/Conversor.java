package com.letscode.conversor;

import com.letscode.conversor.Service.Calculadora;
import com.letscode.conversor.utils.Print;
import com.letscode.conversor.utils.Scan;

import java.util.Scanner;


public class Conversor {
    public static void main(String[] args) {

        Scanner leituraDados = new Scanner(System.in);

        char resposta;
        double temperaturaCelsius;
        double temperaturaKevin;
        double temperaturaFahrenheit;
        double temperaturaRankini;
        double temperaturaReaumur;

        do {

            Print.mensagemEntradaTemperatura();
            temperaturaCelsius = Scan.temperaturaEmCelsius();

            temperaturaKevin = Calculadora.converterKelvin(temperaturaCelsius);
            temperaturaFahrenheit = Calculadora.converterFahrenheit(temperaturaCelsius) ;
            temperaturaRankini = Calculadora.converterRankini(temperaturaCelsius);
            temperaturaReaumur = Calculadora.converterReaumur(temperaturaCelsius);

            Print.mensagensResultadosConversao
                    (temperaturaFahrenheit,temperaturaKevin,temperaturaRankini,temperaturaReaumur);

            Print.mensagemConverterNovamente();
            resposta = Scan.respostaConverterNovamente();
            System.out.printf("\n");

        }while(resposta == 's' || resposta == 'S');

        if(resposta != 's' || resposta != 'S'){
            Print.mensagemEncerramentoPrograma();
        }
    }
}
