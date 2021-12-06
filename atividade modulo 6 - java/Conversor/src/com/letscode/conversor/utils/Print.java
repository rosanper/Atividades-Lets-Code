package com.letscode.conversor.utils;

public class Print {

    public static void mensagemEntradaTemperatura(){
        System.out.print("Digite a temperatura que deseja converter em Celsius(°C):");
    }

    public static void mensagensResultadosConversao
            (double temperaturaFahrenheit, double temperaturaKevin,double temperaturaRankini,double temperaturaReaumur){
        System.out.printf("- A temperatura em Fahrenheit é de %.2f \n", temperaturaFahrenheit);
        System.out.printf("- A temperatura em Kelvin é de %.2f \n", temperaturaKevin);
        System.out.printf("- A temperatura em Rankine é de %.2f \n", temperaturaRankini);
        System.out.printf("- A temperatura em Reaumur é de %.2f", temperaturaReaumur);
    }

    public static void mensagemConverterNovamente(){
        System.out.print("\n Deseja converter mais alguma temperatrua?(S/N)");
    }

    public static void mensagemEncerramentoPrograma(){
        System.out.println("Até a próxima :D");
    }

}
