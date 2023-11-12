package Entites;

public class Conta {
    private int numeroConta;
    private String titular;
    private double deposito;

    public Conta(int numeroConta, String titular){
        this.numeroConta = numeroConta;
        this.titular = titular;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public String getTitular() {
        return titular;
    }
    public double getDeposito() {
        return deposito;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
    public double addConta(double valor){
        return this.deposito += valor;
    }
    public double saqueConta(double valor) {
        return this.deposito -= (valor + 5.00);
    }
    public double totalValor(){
        return this.deposito;
    }
    public String toString(){
        return this.numeroConta + ", Holder: " + this.titular + ", Balance: " + String.format("%.2f", totalValor());
    }
}
