import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int escolha, exit = 0;

        do {

            System.out.println("Escolha entre as opções: ");
            System.out.println("Dobro[1]: ");
            System.out.println("Triplo[2]: ");
            System.out.println("Metade[3]: ");
            System.out.println("Quadrado[4]: ");
            System.out.println("Cubo[5]: ");
            System.out.println("Raiz quadrada[6]: ");
            System.out.println("Raiz cúbica[7]: ");
            System.out.println("Módulo[8]: ");
            System.out.println("Inverso[9]: ");
            System.out.println("Sair do programa[0]: ");

            escolha = input.nextInt();

            switch (escolha) {

                case 1:
                    dobroNumero();
                    break;

                case 2:
                    triploNumero();
                    break;

                case 3:
                    metadeNumero();
                    break;

                case 4:
                    quadradoNumero();
                    break;

                case 5:
                    cuboNumero();
                    break;

                case 6:
                    raizQuadradaNumero();
                    break;

                case 7:
                    raizCubicaNumero();
                    break;

                case 8:
                    modulo();
                    break;

                case 9:
                    inverso();
                    break;

                default:
                    System.out.println("Fim do programa");
            }

        }while (exit != 0);
    }


    public static void dobroNumero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int dobro = input.nextInt();
        int calculoDobro = dobro * 2;
        System.out.println("Dobro de " + dobro + " é " + calculoDobro);

    }

    public static void triploNumero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int triplo = input.nextInt();
        int  calculoTriplo = triplo * 3;
        System.out.println("O triplo de " + triplo + " é " + calculoTriplo);

    }

    public static void metadeNumero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int metade = input.nextInt();
        double calculoMetade = metade / 2;
        System.out.println("Metade de " + metade + " é " + calculoMetade);
    }

    public static void quadradoNumero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int quadrado = input.nextInt();
        int calculoQuadrado = quadrado * quadrado;
        System.out.println("O quadrado de " + quadrado + " é " + calculoQuadrado);
    }

    public static void cuboNumero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int cubo = input.nextInt();
        int calculoCubo = cubo * cubo * cubo;
        System.out.println("Cubo de " + cubo + " é " + calculoCubo);
    }

    public static void raizQuadradaNumero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int raizQuadrada = input.nextInt();
        double calculoRaizQuadrada = Math.sqrt(raizQuadrada);
        System.out.println("Raiz quadrada de " + raizQuadrada + " é " + calculoRaizQuadrada);
    }

    public static void raizCubicaNumero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int raizCubica = input.nextInt();
        double calculoRaizCubica = Math.pow(raizCubica, 1.0 / 3.0);
        System.out.println("Raiz cúbica de " + raizCubica + " é " + calculoRaizCubica);
    }

    public static void modulo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int modulo = input.nextInt();
        int calculoModulo = Math.abs(modulo);
        System.out.println("O módulo de " + modulo +  " é " + calculoModulo);
    }

    public static void inverso() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int inverso = input.nextInt();
        int calculoInverso = inverso * (-1);
        System.out.println("O inverso de " + inverso + " é " + calculoInverso);
    }
}
