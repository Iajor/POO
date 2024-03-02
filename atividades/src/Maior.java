/*6 - Escreva um algoritmo que leia 3 valores pelo teclado e então informe qual o maior deles. */

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primero número:");
        int numero1 = entrada.nextInt();
        System.out.println("Informe o segundo número:");
        int numero2 = entrada.nextInt();
        System.out.println("Informe o terceiro número:");
        int numero3 = entrada.nextInt();

        if ((numero1 == numero2) && (numero1 == numero3)){
            System.out.println("Os três números são iguais!");
        }else if ((numero1 == numero2) && (numero1 > numero3)){
            System.out.println("O primeiro e segundo números são iguais e maiores que o terceiro");
        }else if ((numero1 == numero2) && (numero1 < numero3)) {
            System.out.println("O terceiro número é maior");
        }else if ((numero1 == numero3) && (numero1 > numero2)){
            System.out.println("O primeiro e terceiro números são iguais e maiores que o segundo");
        }else if ((numero1 == numero3) && (numero1 < numero2)){
            System.out.println("O segundo número é maior");
        }else if ((numero2 == numero3) && (numero2 > numero1)){
            System.out.println("O segundo e terceiro números são iguais e maiores que o primeiro");
        }else if ((numero2 == numero3) && (numero2 < numero1)){
            System.out.println("O primeiro número é maior");
        }else if ((numero1 > numero2) && (numero1 > numero3)){
            System.out.println("O primeiro número é maior");
        }else if ((numero1 < numero2) && (numero2 > numero3)){
            System.out.println("O segundo número é maior");
        }else{
            System.out.println("O terceiro número é maior");
        }
        
        entrada.close();

    }
}
