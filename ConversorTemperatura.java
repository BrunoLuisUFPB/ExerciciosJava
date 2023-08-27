import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int escolha, exit = 0;

        do {

            System.out.println("Escolha a opção de conversão:");

            System.out.println("Escolha [1] para conversão F -> C: ");

            System.out.println("Escolha [2] para conversão C -> F: ");

            System.out.println("Escolha [3] para conversão C -> K: ");

            System.out.println("Escolha [4] para conversão K -> C: ");

            System.out.println("Escolha [5] para conversão K -> F: ");

            System.out.println("Escolha [6] para conversão F -> K: ");

            System.out.println("Digite [0] para sair do programa: ");

            escolha = input.nextInt();

            switch (escolha) {

                case 1:
                    fahrenheittoCelsius();
                    break;

                case 2:
                    celsiusToFahrenheit();
                    break;

                case 3:
                    celsiusToKelvin();
                    break;

                case 4:
                    kelvinToCelsius();
                    break;

                case 5:
                    kelvinToFahrenheit();
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (exit != 0);

    }

    public static void fahrenheittoCelsius() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da temperatura em Fahrenheit: ");
        double Fahrenheit = input.nextDouble();
        double Celsius = (Fahrenheit - 32) / 1.8;
        System.out.println("Temperatura em Celsius: " + Celsius + "°C");

    }

    public static void celsiusToFahrenheit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da temperatura em Celsius: ");
        double Celsius = input.nextDouble();
        double Fahrenheit = (Celsius * 1.8) + 32;
        System.out.println("Temperatura em Fahrenheit : " + Fahrenheit + "°F");

    }

    public static void celsiusToKelvin() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da temperatura em Celsius: ");
        double Celsius = input.nextDouble();
        double Kelvin = Celsius + 273;
        System.out.println("Temperatura em Kelvin: " + Kelvin + "K");

    }

    public static void kelvinToCelsius() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da temperatura em Kelvin: ");
        double Kelvin = input.nextDouble();
        double Celsius = Kelvin - 273;
        System.out.println("Temperatura em Celsius: " + Celsius + "°C");
    }

    public static void kelvinToFahrenheit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da temperatura em Kelvin: ");
        double Kelvin = input.nextDouble();
        double Fahrenheit = ((Kelvin - 273) * 1.8) + 32;
        System.out.println("Temperatura em Fahrenheit: " + Fahrenheit + "°F");

    }
}
