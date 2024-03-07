/*8 - Escreva um programa Java que use um laço para ler vários nomes de cidades do usuário até que o nome "São Paulo" seja lido.*/

package Loops.src;

import java.util.Scanner;

public class Loop8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cidade;

        do {
            System.out.println("Informe o nome da cidade:");
            cidade = entrada.nextLine();
            
        } while (!cidade.equals("Sao Paulo"));

        entrada.close();
    }
}
