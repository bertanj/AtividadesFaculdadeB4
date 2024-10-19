package Algebra;

import java.util.Scanner;

public class CalculoDeterminante {
    public static void main(String[] args) {
        int detA= 1;
        int matrizLinha;
        int matrizColuna;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite quantas linhas a matriz terá:");
            matrizLinha = scanner.nextInt();
            System.out.println("Digite quantas colunas a matriz terá:");
            matrizColuna = scanner.nextInt();
        }while(matrizLinha != matrizColuna);

        int[][] matriz = new int[matrizLinha][matrizColuna];


        System.out.println("Agora preencha os valores de sua matriz triangular");

        for (int i = 0; i < matrizLinha; i++) {
            for (int j = 0; j < matrizColuna; j++) {
                System.out.println("Preencha os valores da matriz. Qual será o valor da linha " + (i + 1) + " coluna " + (j + 1) + "?");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrizLinha; i++) {
            for (int j = 0; j < matrizColuna; j++) {
                System.out.print(matriz[i][j]);
                detA *= matriz[i][i];
            }
            System.out.println();
        }
        System.out.println(detA);
    }
}