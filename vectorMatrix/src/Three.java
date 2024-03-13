/*3 - Escreva um algoritmo que leia valores para dois vetores de 20 elementos e então realize a soma dos elementos da mesma posição, armazenando o resultado em um outro vetor. */

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers1 = new int[20];
        int[] numbers2 = new int[20];
        int[] sum = new int[20];

        for (int i = 0; i < numbers1.length; i++) {
            System.out.println("Digite os numeros do primeiro vetor ");
            numbers1[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("Digite os numeros do segundo vetor ");
            numbers2[i] = sc.nextInt();
        }

        for (int i = 0; i < sum.length; i++) sum[i] = numbers1[i]+numbers2[i];

        for (int i : sum) System.out.println("O total -> " + i);

        sc.close();
    }
}
