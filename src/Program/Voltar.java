package Program;

import java.util.Scanner;

public class Voltar {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Vai voltar a estudar ou nao?");
        String texto = sc.nextLine().toLowerCase();

        if (texto == "sim") {
            System.out.println("Tristeza >:( ");
        }
        else {
            System.out.println("Entao foco e vai estudar!");
        }

        sc.close();
}
}