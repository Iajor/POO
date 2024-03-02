
/*4 - Escrever um algoritmo para ler quatro valores inteiros, calcular a sua média, e escrever na tela os que são superiores à média. */


import java.util.Scanner;


public class MediaMaior {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int numero1 = entrada.nextInt();

        System.out.println("Informe o segundo número:");
        int numero2 = entrada.nextInt();

        System.out.println("Informe o terceiro número:");
        int numero3 = entrada.nextInt();

        System.out.println("Informe o quarto número:");
        int numero4 = entrada.nextInt();

        int media = (numero1+numero2+numero3+numero4)/4;

        if (numero1 > media){
            System.out.println("O primeiro número é maior que a média");
        }
        if (numero2 > media){
            System.out.println("O segundo número é maior que a média");
        }
        if (numero3 > media){
            System.out.println("O terceiro número é maior que a média");
        }
        if (numero4 > media){
            System.out.println("O quarto número é maior que a média");
        }

        entrada.close();
    }
}
