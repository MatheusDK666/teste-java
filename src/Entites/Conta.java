package Entites;

public class Conta {
    private int numeroConta;
    private String titular;
    private double deposito;

    public Conta(int numeroConta, String titular){
        this.numeroConta = numeroConta;
        this.titular = titular;
    }
    public Conta(int numeroConta, String titular, double inicialDeposito){
        this.numeroConta = numeroConta;
        this.titular = titular;
        addConta(inicialDeposito);
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
    public void addConta(double valor){
        deposito += valor;
    }
    public void saqueConta(double valor) {
        this.deposito -= (valor + 5.0);
    }
    public double totalValor(){
        return this.deposito;
    }
    public String toString(){
        return this.numeroConta + ", Holder: " + this.titular + ", Balance: " + String.format("%.2f", totalValor());
    }
}
