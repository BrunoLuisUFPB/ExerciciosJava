import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int escolha = 0;
        double resultado;

        do {

            System.out.println("Digite o seu peso: ");
            double peso = input.nextDouble();

            System.out.println("Digite a sua altura: ");
            double altura = input.nextDouble();

            resultado = IMC(peso, altura);

            System.out.println("O seu IMC é: " + resultado);

            System.out.println("Digite [0] para sair do programa ou qualquer outro número para continuar:");
            escolha = input.nextInt();


        } while (escolha != 0);
    }

    public static double IMC(double peso, double altura) {

        return peso / (altura * altura);
    }
}
