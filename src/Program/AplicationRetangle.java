package Program;

import java.util.Locale;
import java.util.Scanner;

import Entites.Retangle;

public class AplicationRetangle {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangle retangle = new Retangle();
        System.out.println("Enter the retangle number width and height: ");
        retangle.width = sc.nextDouble();
        retangle.height = sc.nextDouble();

        System.out.println("AREA = " + retangle.toStringArea());
        System.out.println("PARAMETER = " + retangle.toStringParameter());
        System.out.println("DIAGONAL = " + retangle.toStringDiagonal());

        sc.close();
    }
}
