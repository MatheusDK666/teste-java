package Program;

import java.util.Locale;
import java.util.Scanner;

import Entites.Product;

public class AplicationProduct {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Product: ");
        String name = sc.nextLine().toUpperCase();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        System.out.println("Update data product: " + product.toString());
        System.out.print("Add product quantity: ");

        product.addQuantity(sc.nextInt());

        System.out.println("Update data product: " + product.toString());
        System.out.print("Remove product quantity: ");

        product.removeQuantity(sc.nextInt());

        System.out.println("Update data product: " + product.toString());

        sc.close();   
    }
}
