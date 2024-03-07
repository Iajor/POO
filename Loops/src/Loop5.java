/*5 - Escreva um programa Java que use um laço para calcular o fatorial de um número inteiro. */

package Loops.src;

import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro:");
        int numero = entrada.nextInt();
        int fatorial = 1;

        for (int i = numero; i > 0; i--) {
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);
        
        entrada.close();
    }
}
