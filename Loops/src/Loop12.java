import java.util.Scanner;

/*12 - Faça um programa em Java que leia um número inteiro n, inteiro e positivo e mostre a seguinte soma: S = 1 + 1/2 + 1/3 + 1/4 + 1/5 .... 1/n */

public class Loop12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {

            System.out.println("Informe um número inteiro e positivo");
            int numero = entrada.nextInt();
            double total = 1.0;

            if (numero < 0) {
                System.out.println("Você informou um número negativo");
            } else {
                for (double i = 2; i <= numero; i++) {
                    total = total + (1 / i);
                }
                System.out.println(total);
                break;
            }
        }

        entrada.close();

    }
}
