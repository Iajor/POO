import java.util.Scanner;

public class Locadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a marca e o modelo do carro: ");
        Carro carro = new Carro(input.nextLine(), input.nextLine());

        System.out.println("Informe a marca, o modelo e cilindradas da moto 1: ");
        Moto moto1 = new Moto(input.nextLine(), input.nextLine(), input.nextLine());

        System.out.println("Informe a marca, o modelo e cilindradas da moto 2: ");
        Moto moto2 = new Moto(input.nextLine(), input.nextLine(), input.nextLine());
        input.close();

        System.out.println("Dados do carro: "+carro.getMarca()+carro.getModelo());
        System.out.println("Dados da moto 1: "+moto1.getMarca()+moto1.getModelo()+moto1.getCilindradas());
        System.out.println("Dados da moto 2: "+moto2.getMarca()+moto2.getModelo()+moto2.getCilindradas());
        
    }
}
