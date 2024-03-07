/*6- Escreva um programa Java que use um laço para ler uma sequência de números inteiros do usuário até que o número 0 seja lido. */

package Loops.src;

import java.util.Scanner;

public class Loop6 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        do {
        
            System.out.println("Informe um número:");
            numero = entrada.nextInt();
                
        } while (numero != 0);
        
        entrada.close();
    }
}
