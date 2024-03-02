/*5 - Escreva um algoritmo que leia um ponto (x,y) pelo teclado e informe em qual quadrante o ponto se encontra no plano cartesiano ou se o ponto está sobre um dos eixos. */



import java.util.Scanner;

public class PlanoCartesiano {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o ponto x:");
        int pontoX = entrada.nextInt();

        System.out.println("Informe o ponto y:");
        int pontoY = entrada.nextInt();

        if (pontoX > 0 && pontoY > 0) {
            System.out.println("O ponto está no primeiro quadrante.");
        } else if (pontoX < 0 && pontoY > 0) {
            System.out.println("O ponto está no segundo quadrante.");
        } else if (pontoX < 0 && pontoY < 0) {
            System.out.println("O ponto está no terceiro quadrante.");
        } else if (pontoX > 0 && pontoY < 0) {
            System.out.println("O ponto está no quarto quadrante.");
        } else if (pontoX == 0 && pontoY != 0) {
            System.out.println("O ponto está sobre o eixo das ordenadas (y).");
        } else if (pontoX != 0 && pontoY == 0) {
            System.out.println("O ponto está sobre o eixo das abcissas (x).");
        } else {
            System.out.println("O ponto está na origem.");
        }

        entrada.close();

    }
}
