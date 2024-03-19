/*9 - Escreva um programa em Java que faça leitura dos valores de uma matriz 5x5. Em seguida apresente os valores da diagonal principal. Na sequência, apresente os valores da diagonal secundária */

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Informe o numero da posição " + i + "|" + j);
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Diagonal principal ->");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) if (i==j) System.out.println(matrix[i][j]);
        }
        System.out.println("Diagonal secundaria ->");
        for (int k = 0; k < 5; k++) {
            for (int j = 0; j < 5; j++) if (k+j==4) System.out.println(matrix[k][j]);
        }

        input.close();
    }
}
