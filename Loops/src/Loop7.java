/*7 - Escreva um programa Java que use um laço para ler a nota de vários alunos até que seja lida a nota -1. */

package Loops.src;

import java.util.Scanner;

public class Loop7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota;
        do {
            System.out.println("Informe a nota:");
            nota = entrada.nextFloat();
        } while (nota != -1);
        entrada.close();
    }
}
