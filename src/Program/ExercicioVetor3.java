package Program;

import java.util.Locale;
import java.util.Scanner;

import Entites.Pessoas;

public class ExercicioVetor3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Pessoas[] pessoa = new Pessoas[n];

        for (int i=0; i<pessoa.length; i++){
            sc.nextLine();
            System.out.printf("Dado da %da pessoa:\n", i + 1);
            System.out.print("Nome:");
            String nome = sc.nextLine().toLowerCase();

            System.out.print("Idade:");
            int idade = sc.nextInt();

            System.out.print("Altura:");
            double altura = sc.nextDouble();
            
            pessoa[i] = new Pessoas(nome, idade, altura);
        }

        double somaAltura = 0.0;
        for (int i=0; i<pessoa.length; i++){
            somaAltura += pessoa[i].getAltura();
        }
        double media = somaAltura / pessoa.length;
        System.out.printf("Altura média: %.2f%n", media);


        int pessoamenor = 0;
        double porcentagem;

        for (int i=0; i<pessoa.length; i++){
            if(pessoa[i].getIdade() < 16){
                pessoamenor++;
            }
        }
        porcentagem = ((double)pessoamenor / n) / 100.0;

        System.out.printf("Pessoas com menos de 16 anos: %.1fn%\n", porcentagem);
        for (int i=0; i<pessoa.length; i++){
            if (pessoa[i].getIdade() < 16){
                System.out.println(pessoa[i].getNome());
            }
        }
        sc.close();
    }
}