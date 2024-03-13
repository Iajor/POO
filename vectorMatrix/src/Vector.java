import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        int [] numbers = new int[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite o elemento " + i);
            numbers[i] = sc.nextInt();
        }

        for (int i : numbers) System.out.println(i);

        numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite o elemento " + i);
            numbers[i] = sc.nextInt();
        }

        for (int i : numbers) System.out.println(i);

        
        System.out.println("Digite o tamanho do vetor ");
        int n = sc.nextInt();
        
        numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite o elemento " + i);
            numbers[i] = sc.nextInt();
        }

        for (int i : numbers) System.out.println(i);


        sc.close();
    }
}
