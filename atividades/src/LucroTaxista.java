/*2 - Um motorista de taxi deseja calcular o rendimento de seu carro na praça. Sabendo-se que o preço do combustível é de R$4,90, escreva um algoritmo para ler a marcação do odômetro (marcador de quilometragem) no início do dia, a marcação no final do dia, o número de litros de combustível gasto e o valor total (R$) recebido dos passageiros. Calcule e escreva a média do consumo em Km/l e o lucro líquido do dia.
Fórmulas: Total quilometragem = marcação odômetro final do dia - marcação odômetro do dia
Média do consumo = Total quilometragem/quantidade de combustível gasto
Lucro do dia = Valor total recebido -(quantidade de combustível gasto * 4,90) */

import java.util.Scanner;

public class LucroTaxista {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a marcação do odômetro no início do dia:");
        double odoInicio = entrada.nextDouble();

        System.out.println("Informe a marcação do odômetro no final do dia:");
        double odoFinal = entrada.nextDouble();

        System.out.println("Informe o número de litros de combustível gasto:");
        double litros = entrada.nextDouble();

        System.out.println("Informe o total de R$ recebido:");
        double totalRs = entrada.nextDouble();

        double media = (odoFinal-odoInicio)/litros;
        double lucro = totalRs - (litros*4.90);

        System.out.println("A média do consumo foi " + media + ", e o lucro do dia foi " + lucro);

        entrada.close();
    }
}
