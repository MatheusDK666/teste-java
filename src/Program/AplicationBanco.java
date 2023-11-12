package Program;

import java.util.Locale;
import java.util.Scanner;

import Entites.Conta;

public class AplicationBanco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta contaCliente1;

        System.out.print("Enter account number: ");
        int contaBanco = sc.nextInt();

        System.out.print("Enter account holfer: ");
        sc.nextLine();
        String nomeCliente = sc.nextLine();

        System.out.print("Is there na initial deposit? (y/n) ");
        char deposit = sc.next().toLowerCase().charAt(0);
        
        if ( deposit != 'n') {
            System.out.println("Enter initial deposit value: ");
            double value = sc.nextDouble();
            contaCliente1 = new Conta(contaBanco, nomeCliente, value);
        } else {
            contaCliente1 = new Conta(contaBanco, nomeCliente);
        }
        System.out.println("Account data:");
        System.out.println("Account: " + contaCliente1.toString());
        System.out.print("Enter a deposit value: ");

        contaCliente1.addConta(sc.nextDouble());

        System.out.println("Update account data:");
        System.out.println("Account: " + contaCliente1.toString());
        System.out.print("Enter a withdraw value: ");

        contaCliente1.saqueConta(sc.nextDouble());


        System.out.println("Update account data:");
        System.out.println("Account: " + contaCliente1.toString());

        sc.close();
    }
}
