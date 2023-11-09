package Program;

import java.util.Locale;
import java.util.Scanner;

import Entites.Product;

public class AplicationProduct {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Product: ");
        product.name = sc.nextLine().toUpperCase();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println("Update data product: " + product.toString());
        System.out.println("Add product quantity: ");

        product.addQuantity(sc.nextInt());

        System.out.println("Update data product: " + product.toString());
        System.out.println("Remove product quantity: ");

        product.removeQuantity(sc.nextInt());

        System.out.println("Update data product: " + product.toString());

        sc.close();   
    }
}
