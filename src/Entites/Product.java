package Entites;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product (double price, int quantity) {
        this.name = "TV";
        this.price = price;
        this.quantity = quantity;
    }
    public double totalValorProduct(){
        return this.quantity * this.price;
    }
    public int addQuantity(int x){
        return this.quantity += x;
    }
    public int removeQuantity(int x){
        return this.quantity -= x;
    }
    public String toString(){
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, TOTAL: " + String.format("%.2f", totalValorProduct());
    }
}
