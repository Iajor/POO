/* Crie uma classe (chamada RealizaConta) para realizar as quatros operações aritméticas (+,-,/,*) entre 2 valores. Cada operação aritmética deverá ter um método e retornar o valor do cálculo. Os dois valores deverão ser lidos utilizando o método de leitura de teclado. Além disso, essa leitura deverá ser realizada dentro da classe principal do programa, chamada Calculadora. Ou seja, a classe principal (Calculadora) lê os dois valores e os envia para a classe realizaConta. Esta, por sua vez, efetua os cálculos e retorna os valores para serem exibidos na classe principal. */

package atividades_26032024;

import java.util.Scanner;

class RealizaConta {
    public void somar(int a, int b){
        System.out.println("Soma: "+(a+b));
    }
    public void subtrair(int a, int b){
        System.out.println("Subtração: "+(a-b));
    }
    public void multiplicar(int a, int b){
        System.out.println("Multiplicação: "+(a*b));
    }
    public void dividir(double a, double b){
        try {
            if (b == 0) {
                throw new ArithmeticException("Divisao por zero impossivel. Valores invertidos para validar conta");
            }
            System.out.println("Divisão: "+(a/b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            if (a != 0) {
                System.out.println("Divisão: "+(b/a));
            } else {
                System.out.println("Ambos os números são zero, sendo a divisão impossível");
            }
        }
    }       
}
public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a e b: ");
        int a = input.nextInt(), b = input.nextInt();
        RealizaConta operacao = new RealizaConta();
        operacao.somar(a,b);
        operacao.subtrair(a,b);
        operacao.multiplicar(a,b);
        operacao.dividir(a,b);
        input.close();        
        
    }
}
