import java.util.Scanner;

/*1 - Crie uma classe chamada Carro que possua 3 atributos: marca, modelo e anoFabricacao.
Além disso, crie uma classe executável para criar 2 objetos do tipo Carro e exibir na tela os
valores dos atributos criados.
• Esses valores devem ser solicitados ao usuário, por linha de execução. */

public class One {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        Scanner input = new Scanner(System.in);
        System.out.println("Informe a marca do carro");
        car1.brand = input.nextLine();
        System.out.println("Informe o modelo do carro");
        car1.model = input.nextLine();
        System.out.println("Informe o ano de fabricação do carro");
        car1.year = input.nextInt();
        input.nextLine();

        System.out.println("Informe a marca do carro");
        car2.brand = input.nextLine();
        System.out.println("Informe o modelo do carro");
        car2.model = input.nextLine();
        System.out.println("Informe o ano de fabricação do carro");
        car2.year = input.nextInt();
        input.nextLine();

        System.out.println("A marca do carro 1 -> "+car1.brand);
        System.out.println("O modelo do carro 1 -> "+car1.model);
        System.out.println("O ano de fabricação do carro 1 -> "+car1.year);
        System.out.println("A marca do carro 2 -> "+car2.brand);
        System.out.println("O modelo do carro 2 -> "+car2.model);
        System.out.println("O ano de fabricação do carro 2 -> "+car2.year);

        input.close();
    }
}
