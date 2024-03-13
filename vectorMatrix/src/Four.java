/*4 - Fazer um algoritmo que leia dez números inteiros armazenando-os em um vetor e escreva primeiramente todos os números pares lidos e após todos os ímpares. Exemplo:
a. lê: |7|40|3|9|21|0|63|31|7|22|
b. escreve: |40|0|22|7|3|9|21|63|31|7| */

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite um numero ");
            numbers[i]=sc.nextInt();   
        }

        for (int i : numbers) if (i%2==0) System.out.println(i);
        
        for (int i : numbers) if (i%2!=0) System.out.println(i);   

        sc.close();
    }
}
