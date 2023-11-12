package Program;

import java.util.Locale;
import java.util.Scanner;

import Entites.Conta;

public class AplicationBanco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int contaBanco = sc.nextInt();

        System.out.print("Enter account holfer: ");
        String nomeCliente = sc.next();

        Conta contaCliente1 = new Conta(contaBanco, nomeCliente);

        System.out.print("Is there na initial deposit? (y/n) ");
        char deposit = sc.next().toLowerCase().charAt(0);
        char noDeposit = 'n';
        if ( deposit != noDeposit) {
            System.out.println("Enter initial deposit value: ");
            double value = sc.nextDouble();
            contaCliente1.setDeposito(value);
        } else {
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
