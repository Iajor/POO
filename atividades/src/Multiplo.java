/*8 - Escreva um algoritmo que leia dois valores pelo teclado e informe se os mesmos são múltiplos um do outro ou não. */

import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primero número:");
        int numero1 = entrada.nextInt();
        System.out.println("Informe o segundo número:");
        int numero2 = entrada.nextInt();

        if ((numero1 % numero2 == 0) || (numero2 % numero1 == 0)){
            System.out.println("Os números são múltiplos");
        }else{
            System.out.println(("Os números não são múltiplos"));
        }
        entrada.close();
    }
}
