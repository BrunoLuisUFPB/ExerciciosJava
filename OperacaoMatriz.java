import java.util.Random;
import java.util.Scanner;

public class OperacaoMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        System.out.println("MATRIZ:");
        preencherMatriz(matriz);
        mostrarMatriz(matriz);

        double media = mediaAbaixoDiagonalPrincipal(matriz);
        System.out.println("\na média aritmética dos elementos abaixo da diagonal principal: " + media);

        int soma = somaAcimaDiagonalPrincipal(matriz);
        System.out.println("a soma dos elementos acima da diagonal principal: " + soma);

        int somaDiagonal = mediaDiagonalPrincipal(matriz);
        System.out.println("a média aritmética dos elementos da diagonal principal: " + somaDiagonal);

        int menor = MenorElementoMatriz(matriz);
        System.out.println("o menor elemento da matriz: " + menor);

        int matrizTotal = somaTotalMatriz(matriz);
        System.out.println("a soma dos elementos da matriz: " + matrizTotal);
    }

    public static void preencherMatriz(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10,100);
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double mediaAbaixoDiagonalPrincipal(int[][] matriz) {
        int soma = 0, cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i > j) {
                    cont++;
                    soma += matriz[i][j];
                }
            }
        }
        return (double) soma / cont++;
    }

    public static int somaAcimaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz[i].length; j++) {

                    soma += matriz[i][j];
            }
        }
        return soma;
    }
    public static int mediaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        return soma / matriz.length ;
    }

    public static int MenorElementoMatriz(int[][] matriz) {
        int menor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }

    public static int somaTotalMatriz(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
           for(int j = 0; j < matriz[i].length; j++) {
               soma += matriz[i][j];
           }
        }
        return soma;
    }
}
