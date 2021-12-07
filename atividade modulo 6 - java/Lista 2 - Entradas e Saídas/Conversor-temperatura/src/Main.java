import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        char resposta;

        do{
            System.out.printf("Entre com uma temperatura em Celsius(°C):");
            float temperaturaCelsius = lerDados.nextFloat();

            final float CONSTANTE_FAHRENHEIT_MULTIPLICACAO = 1.8f;
            final float CONSTANTE_FAHRENHEIT_ADICAO = 32f;
            float temperaturaFahrenheit = (temperaturaCelsius * CONSTANTE_FAHRENHEIT_MULTIPLICACAO)
                    + CONSTANTE_FAHRENHEIT_ADICAO;

            System.out.printf("A temperatura em Fahrenheit é de: %.2f",temperaturaFahrenheit);

            System.out.printf("\nDesesja converter outra temperatura?(S/N):");
            resposta = lerDados.next().charAt(0);
        } while(resposta == 'S' || resposta == 's');


    }
}
