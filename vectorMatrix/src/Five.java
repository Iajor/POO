/*5 - Fazer um algoritmo que leia trinta números reais armazenando-os em um vetor e após escreva a posição de cada número menor que zero desse vetor. Exemplo:
a. lê: |5.1|0|-3.6|4.1|-2.5|-1.3|-4|1.39|-128|-6.9|8.2|9|154|-88|6.4|7.1|...|
b. escreve: |3|5|6|7|9|10|14|. . . */

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[30];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Informe um numero");
            numbers[i] = input.nextDouble();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) System.out.println(i);
        }
        input.close();
    }
}
