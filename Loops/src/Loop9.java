/*9 - Escreva um programa Java que use um laço para imprimir os números primos de 1 a 50. */

package Loops.src;

public class Loop9 {
    public static void main(String[] args) {
        int numero = 2;
        
        do {
            int contador = 0;
            for (int i = 1; i != numero; i++) {
                if (numero%i==0){
                    contador++;
                }
            }
    
            if (contador == 1){
                System.out.println(numero);
            }
    
            numero++;

        } while (numero<=50);
        
    }
}
