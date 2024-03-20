/*2 - Crie uma classe chama Computador que possua 4 atributos: marca, modelo, tipo (notebook,
netbook, tablet, etc) e preço.
• Essa classe Computador também deverá ser executável, entretanto crie uma outra classe
executável que irá instanciar a classe Computador, criando 2 objetos. O primeiro objeto deverá
ser criado através da solicitação dos valores ao usuário por linha de execução. Já, os valores do
segundo objeto, deverão ser definidos no código-fonte da classe que o criou. Exiba na tela os
resultados. */

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Computer computer1 = new Computer();
        System.out.println("Informe a marca do computador:");
        computer1.brand=input.nextLine();
        System.out.println("Informe o modelo do computador:");
        computer1.model=input.nextLine();
        System.out.println("Informe o tipo do computador:");
        computer1.type=input.nextLine();
        System.out.println("Informe o preço do computador:");
        computer1.price=input.nextInt();

        input.close();

        Computer computer2 = new Computer();

        System.out.println("A marca do computador 1 -> "+computer1.brand);
        System.out.println("O modelo do computador 1 -> "+computer1.model);
        System.out.println("O tipo do computador 1 -> "+computer1.type);
        System.out.println("O preço do computador 1 -> "+computer1.price);
        System.out.println("A marca do computador 2 -> "+computer2.brand);
        System.out.println("O modelo do  computador 2 -> "+computer2.model);
        System.out.println("O tipo do computador 2 -> "+computer2.type);
        System.out.println("O preço do computador 2 -> "+computer2.price);


    }
}
