package Algebra;

import java.util.Scanner;

public class Main {

    public static int[][] matrixMultiply(int[][] A, int[][] B) throws Exception {
        int rowA = A.length;
        int columnA = A[0].length;
        int rowB = B.length;
        int columnB = B[0].length;

        if (columnA != rowB) {
            throw new Exception("A multiplicação de matrizes não é possível: o número de colunas de A deve ser igual ao número de linhas de B.");
        }

        int[][] result = new int[rowA][columnB];

        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnB; j++) {
                for (int k = 0; k < rowA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] readMatrix(int rows, int columns) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[rows][columns];

        System.out.println("Digite os elementos da matriz " + rows + "x" + columns + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        return matriz;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz A: ");
        int rowA = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz A: ");
        int columnA = scanner.nextInt();
        int[][] A = readMatrix(rowA, columnA);

        System.out.print("Digite o número de linhas da matriz B: ");
        int rowB = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz B: ");
        int columnB = scanner.nextInt();
        int[][] B = readMatrix(rowB, columnB);

        try {
            int[][] result = matrixMultiply(A, B);
            System.out.println("Resultado da multiplicação: ");
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}