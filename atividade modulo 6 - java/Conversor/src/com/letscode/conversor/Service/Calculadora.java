package com.letscode.conversor.Service;

public class Calculadora {
    private static final float CONSTANTE_KELVIN = 273.15f;
    private static final float CONSTANTE_REAUMUR = 0.8f;
    private static final float CONSTANTE_RANKINE_MULTIPLICACAO = 1.8f;
    private static final float CONSTANTE_RANKINE_ADICAO = 491.67f;
    private static final float CONSTANTE_FAHRENHEIT_MULTIPLICACAO = 1.8f;
    private static final float CONSTANTE_FAHRENHEIT_ADICAO = 32f;

    public static double converterKelvin(double temperatura){
        return temperatura + CONSTANTE_KELVIN;
    }

    public static double converterFahrenheit(double temperatura){
        return (temperatura * CONSTANTE_FAHRENHEIT_MULTIPLICACAO)
                + CONSTANTE_FAHRENHEIT_ADICAO;
    }

    public static double converterRankini(double temperatura){
        return (temperatura * CONSTANTE_RANKINE_MULTIPLICACAO)
                + CONSTANTE_RANKINE_ADICAO;
    }

    public static double converterReaumur(double temperatura){
        return temperatura * CONSTANTE_REAUMUR;
    }
}
