/*6 - Escreva um programa Java que use um vetor para ler 10 números inteiros lidos do usuário e depois imprima o maior e o menor valor. */

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Informe um numero:");
            numbers[i] = input.nextInt();
        }
        
        
        int biggest = numbers[0];
        int lowest = numbers[0];

        for (int i : numbers) {
            
            if (i > biggest) biggest = i;
            if (i < lowest) lowest = i;
        }

        System.out.println("maior -> " + biggest);
        System.out.println("menor -> " + lowest);
        input.close();
    }
}
