/*2 - Escreva um algoritmo que leia os valores para um vetor de 10 elementos e então mostre na tela a quantidade de números pares e ímpares. */

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int odd = 0, even = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite o numero ");
            numbers[i] = sc.nextInt();
            if (numbers[i]%2==0) even++;
            else odd++;
        }
        System.out.println("Pares " + odd);
        System.out.println("Impares " + even);

        sc.close();
    }
}
