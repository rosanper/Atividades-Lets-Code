package com.letscode.conversor;

import java.io.IOException;
import java.util.Scanner;


public class Conversor {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        char resposta;

        do {

            System.out.println("Digite a temperatura que deseja converter em Celsius(°C):");


            double temperaturaCelsius = ler.nextDouble();

            final float CONSTANTE_KELVIN = 273.15f;
            final float CONSTANTE_REAUMUR = 0.8f;
            ;
            final float CONSTANTE_RANKINE_MULTIPLICACAO = 1.8f;
            final float CONSTANTE_RANKINE_ADICAO = 491.67f;
            final float CONSTANTE_FAHRENHEIT_MULTIPLICACAO = 1.8f;
            final float CONSTANTE_FAHRENHEIT_ADICAO = 32f;

            double temperaturaKevin = temperaturaCelsius + CONSTANTE_KELVIN;
            double temperaturaFahrenheit = (temperaturaCelsius * CONSTANTE_FAHRENHEIT_MULTIPLICACAO)
                    + CONSTANTE_FAHRENHEIT_ADICAO;
            double temperaturaRankini = (temperaturaCelsius * CONSTANTE_RANKINE_MULTIPLICACAO)
                    + CONSTANTE_RANKINE_ADICAO;
            double temperaturaReaumur = temperaturaCelsius * CONSTANTE_REAUMUR;

            System.out.printf("A temperatura em Fahrenheit é de %.2f \n", temperaturaFahrenheit);
            System.out.printf("A temperatura em Kelvin é de %.2f \n", temperaturaKevin);
            System.out.printf("A temperatura em Rankine é de %.2f \n", temperaturaRankini);
            System.out.printf("A temperatura em Reaumur é de %.2f \n", temperaturaReaumur);

            ler.nextLine();
            System.out.println("Deseja converter mais alguma temperatrua?(S/N)");

            resposta = (char) System.in.read();
            ler.nextLine();

        }while(resposta == 's' || resposta == 'S');
    }
}
