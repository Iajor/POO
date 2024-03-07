/*4 - Escreva um programa Java que use um laço para somar os números de 1 a 100. */

package Loops.src;

public class Loop4 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i < 101; i++) {
            total = total + i;
        }
        System.out.println(total);
    }
}
