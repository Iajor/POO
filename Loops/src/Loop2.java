/*2 - Escreva um programa Java que use um laço para imprimir os números pares de 2 a 20. */

package Loops.src;

public class Loop2 {
    public static void main(String[] args) {
        for (int i = 2; i < 21; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
