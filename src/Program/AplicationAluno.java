package Program;

import java.util.Locale;
import java.util.Scanner;

import Entites.Alunos;

public class AplicationAluno {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Alunos alunos = new Alunos();
        alunos.name = sc.nextLine();
        alunos.nota1 = sc.nextDouble();
        alunos.nota2 = sc.nextDouble();
        alunos.nota3 = sc.nextDouble();

        if (alunos.finalGrade() > 60.00) {
            System.out.printf("FINAL GRADE = %.2f%n", alunos.finalGrade());
            System.out.println("PASS");
        } else {
            System.out.printf("FINAL GRADE = %.2f%n", alunos.finalGrade());
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f%n", alunos.missingPoints());
        }


        sc.close();
    }
}
