/*10 – No exercício anterior altere para que verifique se a soma dos elementos da diagonal principal é igual a soma dos elementos da diagonal secundária. */

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Informe o numero da posição " + i + "|" + j);
                matrix[i][j] = input.nextInt();
            }
        }
        
        int mainDiagonal = 0;
        int antiDiagonal = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==j) mainDiagonal=mainDiagonal+matrix[i][j];
                
                if (i+j==4) antiDiagonal=antiDiagonal+matrix[i][j];
            }
        }
        if (mainDiagonal==antiDiagonal) System.out.println("a soma das diagonais tem resultados iguais");
        else System.out.println("A soma das diagonais tem resultados diferentes");


        input.close();
    }
}
