/*11 - Escreva um programa em Java que gera números entre 1000 e 1999 e mostra aqueles que divididos por 11 dão resto 5. */

public class Loop11 {
    public static void main(String[] args) {
        for (int i = 1000; i < 2000; i++) {
            if (i % 11 == 5) {
                System.out.println(i);
            }
        }
    }
}
