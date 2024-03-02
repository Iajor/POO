/*10 - Altere o exercício 1 e faça um menu utilizando switch case para que seja possível ler a operação pelo teclado, e então calcule o resultado e mostre na tela. A leitura da operação a ser executada pode ser feita com números inteiros, por exemplo, 1 – soma, 2 – subtração, 3 – multiplicação e 4 – divisão, ou com a leitura de um caractere, ou seja, ‘+’ – soma, ‘-‘ – subtração, ‘x’ - multiplicação e ‘/’ – divisão. */


import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        double numero1 = entrada.nextDouble();
        
        System.out.println("Informe o segundo número:");
        double numero2 = entrada.nextDouble();

        System.out.println("Qual a operaçã desejada? informe o número ou símbolo:");
        System.out.println("1 ou (+) -> Soma");
        System.out.println("2 ou (-) -> Subtração");
        System.out.println("3 ou (x) -> Multiplicação");
        System.out.println("4 ou (/) -> Divisão");
        
        char operacao = entrada.next().charAt(0);
        
        switch (operacao) {
            case '1':
            case '+':
                System.out.println("Resultado é " + (numero1+numero2));
                break;
            case '2':
            case '-':
                System.out.println("Resultado pode ser " + (numero1-numero2) + " ou " + (numero2-numero1));
                break;
            case '3':
            case 'x':
                System.out.println("Resultado é " + (numero1*numero2));
                break;
            case '4':
            case '/':            
                if (numero1 == 0 && numero2 == 0){
                    System.out.println("Divisão inválida");
                }else if (numero1 == 0){
                    System.out.println("Resultado válido apenas pode ser " + (numero1/numero2));
                }else if (numero2 == 0){
                    System.out.println("Resultado válido apenas pode ser " + (numero2/numero1));
                }else {
                    System.out.println("Resultado pode ser " + (numero1/numero2) + " ou " + (numero2/numero1));
                }
                break;
            default:
                break;
        }
        
        entrada.close();
    }
}
