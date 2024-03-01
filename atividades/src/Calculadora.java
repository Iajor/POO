// 1 - Faça um programa para leitura de dois números e após faça as quatro operações matemáticas (Soma, Subtração, Multiplicação e divisão)

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        double numero1 = entrada.nextDouble();
        
        System.out.println("Informe o segundo número:");
        double numero2 = entrada.nextDouble();

        System.out.println("A soma é " + (numero1+numero2));
        System.out.println("A subtração pode ser " + (numero1-numero2) + " ou " + (numero2-numero1));
        System.out.println("A multiplicação é " + (numero1*numero2));
        System.out.println("A divisão pode ser " + (numero1/numero2) + " ou " + (numero2/numero1));
        
        
        entrada.close();
    }
}
