/*9 – Escreva um algoritmo para ler a idade de uma pessoa e mostrar qual sua situação de eleitor, conforme as seguintes condições:·
Se a idade for menor que 16 anos, informar que a pessoa não está apta a votar.·
Se a idade for maior ou igual a 16 anos e menor que 18 anos ou superior a 70 anos, informar que o voto é facultativo.·
Caso contrário, informar que o voto é obrigatório. */

import java.util.Scanner;

public class Eleitor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a idade:");
        int idade = entrada.nextInt();

        if (idade < 16) {
            System.out.println("Não está apta a votar");
        }else if (((idade >= 16) && (idade < 18)) || (idade > 70)){
            System.out.println("Voto facultativo");
        }else{
            System.out.println("Voto obrigatório");
        }

        entrada.close();
    }
}
