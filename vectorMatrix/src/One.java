/*/*1 - Fazer um algoritmo que leia dez números e escreva-os na ordem contrária à ordem de leitura.
Exemplo:
a. lê: |7|40|3|9|21|0|63|31|7|22|
b. escreve: |22|7|31|63|0|21|9|3|40|7| */

import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println("Digite o numero ");
            numbers[i] = sc.nextInt();
        }

        for (int i : numbers) System.out.println(i);

        sc.close();
    }
}
