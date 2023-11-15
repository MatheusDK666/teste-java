package Program;

import java.util.Locale;
import java.util.Scanner;

import Entites.ProductVetor;

public class VetorObjetos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ProductVetor[] vect = new ProductVetor[n];

        for (int i=0; i<vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine().toUpperCase();
            double price = sc.nextDouble();
            vect[i] = new ProductVetor(name, price);
        }

        double sum = 0.0;

        for (int i=0; i<vect.length; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("MEDIA VALOR: %.2f%n", avg);
        sc.close();
    }
}
