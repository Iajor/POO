/*12 -  Considere a tabela de Alíquota de Imposto de Renda (IR) a seguir. Desenvolva um algoritmo para ler um valor de salário mensal, mostrar o % da alíquota do imposto de Renda e o valor em R$ da alíquota.
Até 1.566,61 - Isento
De 1.566,62 até 2.347,85 - 7,5%
De 2.347,86 até 3.130,51 - 15,0%
De 3.130,52 até 3.911,63 - 22,5%
Acima de 3.911,64 - 27,5% */


import java.util.Scanner;

public class ImpostoRenda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do salário mensal:");
        double salario = entrada.nextDouble();
        double aliquota, valorAliquota;

        if (salario <= 1566.61) {
            aliquota = 0;
            valorAliquota = 0;
        } else if (salario <= 2347.85) {
            aliquota = 7.5;
            valorAliquota = salario * 0.075;
        } else if (salario <= 3130.51) {
            aliquota = 15;
            valorAliquota = salario * 0.15;
        } else if (salario <= 3911.63) {
            aliquota = 22.5;
            valorAliquota = salario * 0.225;
        } else {
            aliquota = 27.5;
            valorAliquota = salario * 0.275;
        }
        
        System.out.println("Alíquota do Imposto de Renda: " + aliquota + "%");
        System.out.println("Valor em R$ da alíquota: R$" + valorAliquota);

        entrada.close();
    }
}
