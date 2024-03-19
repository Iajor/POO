/*8 - Escreva um programa em Java que leia os valores de uma matriz 4x3, e em seguida mostre na tela apenas os valores cuja soma dos índices (i+j) seja um número par. */

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[4][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Informe o numero da posição " + i + "|" + j);
                matrix[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i+j)%2==0) System.out.println(matrix[i][j]);
            }
        }

        input.close();
    }
}
