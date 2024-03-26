import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        Person p1 = new Person();
        System.out.println("Informe o nome");
        p1.name = input.nextLine();
        System.out.println("Informe a idade");
        p1.age = input.nextInt();
        // input.nextLine();

        Person p2 = new Person();
        System.out.println("Informe o nome");
        p2.name = input.nextLine();
        System.out.println("Informe a idade");
        p2.age = input.nextInt();
        // input.nextLine();

         

        input.close();

        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p2.name);
        System.out.println(p2.age);
        
    }
}
