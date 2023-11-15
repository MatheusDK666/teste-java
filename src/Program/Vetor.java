package Program;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vector = new double[n];

        for ( int i = 0; i < n; i++){
            vector[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for ( int i=0; i<n; i++){
            sum += vector[i];
        }
        double avg = sum / n;

        System.out.printf("AVAREGE HATE: %.2f%n", avg);
        sc.close();
    }
}
