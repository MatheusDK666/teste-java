package Program;

import java.util.Scanner;

public class ExercicioVetor4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        int quantidade = 0;
        for (int i = 0; i<vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("Numeros pares:");
        for (int i = 0; i<vect.length; i++){
            if(vect[i] % 2 == 0){
                quantidade++;
                System.out.print(" " + vect[i]);
            }
        }
        System.out.println("\nQuantidade de pares = " + quantidade);
        sc.close();
    }
}
