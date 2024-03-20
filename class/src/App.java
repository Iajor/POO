import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        Pessoa p1 = new Pessoa();
        System.out.println("Informe o nome");
        p1.nome = input.nextLine();
        System.out.println("Informe a idade");
        p1.idade = input.nextInt();
        // input.nextLine();

        Pessoa p2 = new Pessoa();
        System.out.println("Informe o nome");
        p2.nome = input.nextLine();
        System.out.println("Informe a idade");
        p2.idade = input.nextInt();
        // input.nextLine();

         

        input.close();

        System.out.println(p1.nome);
        System.out.println(p1.idade);
        System.out.println(p2.nome);
        System.out.println(p2.idade);
        
    }
}
