/*7 - Ajuste o exercício 6 de maneira que mostre os valores informados em ordem crescente. */

import java.util.Scanner;

public class MaiorOrdem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primero número:");
        int numero1 = entrada.nextInt();
        System.out.println("Informe o segundo número:");
        int numero2 = entrada.nextInt();
        System.out.println("Informe o terceiro número:");
        int numero3 = entrada.nextInt();

        int menor, meio, maior;
        menor = Math.min(numero1, Math.min(numero2, numero3));
        maior = Math.max(numero1, Math.max(numero2, numero3));
        meio = (numero1 + numero2 + numero3) - menor - maior;
        
        System.out.println("Os números em ordem crescente são:");
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
        
        entrada.close();
    }
}
