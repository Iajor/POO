import java.util.Scanner;

/*10 - Escreva um programa Java que use um laço para calcular a média de vários números reais lidos do usuário até que seja lido o número 0. */

public class Loop10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double total = 0;
        double contador = 0;

        while (true) {

            System.out.println("Informe um número ou 0(zero) para encerrar:");
            double numero = entrada.nextDouble();
            if (numero == 0) {
                break;
            }
            total += numero;
            contador++;
        }

        double media = total / contador;

        System.out.println(media);
        entrada.close();
    }
}
