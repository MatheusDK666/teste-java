package Util;

public class CalcularDollar {

    public static double iof(double x, double y){
        double iof = 0.06;
        double valorTotal = x * y;
        double juros = valorTotal * iof;
        double totalValorDif = juros + valorTotal;
        return totalValorDif;
    }
}
