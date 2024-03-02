/*3 - Faça um algoritmo para ler um número e verificar se ele é par ou ímpar.*/

import java.util.Scanner;


public class ParImpar {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número:");
        int numero = entrada.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número informado é par!");
        }
        else{
            System.out.println("O número informado é ímpar!");
        }

        entrada.close();
    }
}
