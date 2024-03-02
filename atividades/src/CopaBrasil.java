/*11 - Escreva um algoritmo que leia o placar de um jogo da primeira fase da copa do Brasil. Caso o time de fora tenha ganho o jogo por mais de 2 gols de diferença, mostre na tela uma mensagem indicando que o time de fora já se classificou para a próxima fase. Caso contrário, mostre uma mensagem indicando que os dois times irão se enfrentar novamente em um novo jogo.ex: time da casa 4 x 3 time de fora, mostra "Os dois times se enfrentarão em um novo jogo"ex2: time da casa 1 x 3 time de fora, mostra "O time de fora já se classificou"plus: caso ocorra um segundo jogo, leia o placar desse novo jogo e então diga quem passou de fase. EXTRA */


import java.util.Scanner;

public class CopaBrasil {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o placar do primeiro jogo:");
        System.out.println("Time da casa: ");
        int placarCasa = entrada.nextInt();
        System.out.println("Time de fora: ");
        int placarFora = entrada.nextInt();
        
        if (placarFora > (placarCasa + 2)) {
            System.out.println("O time de fora já se classificou.");
        } 
        else {
            System.out.println("Os dois times se enfrentarão em um novo jogo.");

            System.out.println("Placar do segundo jogo:");
            System.out.print("Time da casa: ");
            int placarCasa2 = entrada.nextInt();
            System.out.print("Time de fora: ");
            int placarFora2 = entrada.nextInt();

            if ((placarCasa + placarCasa2) > (placarFora + placarFora2)) {
                System.out.println("O time da casa passou de fase.");
            } else if ((placarCasa + placarCasa2) < (placarFora + placarFora2)) {
                System.out.println("O time de fora passou de fase.");
            } else {
                System.out.println("Houve empate. Será necessário um terceiro jogo para decidir.");
            }
        }

        entrada.close();
    }
}
