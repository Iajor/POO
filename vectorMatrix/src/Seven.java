/*7 - Escreva um programa Java que use uma matriz para armazenar as notas de 3 alunos em 4 disciplinas e depois imprima na tela a nota mais alta e a nota mais baixa em cada disciplina. */

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[][] grades = new float[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("informe a nota " + j + " do aluno " + i);
                grades[i][j] = input.nextFloat();
            }
    
        }
        
        for (float[] student : grades) {
            float biggestGrade, lowestGrade;
            lowestGrade = student[0];
            biggestGrade = student[0];
            for (float grade : student) {
                if (grade > biggestGrade) biggestGrade = grade;
                if (grade < lowestGrade) lowestGrade = grade;        
            }
            System.out.println("As maiores e menores do aluno -> ");
            System.out.println("A maior nota -> " + biggestGrade);
            System.out.println("A menor nota -> " + lowestGrade);
        }
        input.close();
    }

}
