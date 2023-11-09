package Entites;

public class Retangle {
    public double width;
    public double height;

    public double area(){
        return this.width * this.height;
    }
    public double parameter(){
        return (this.width + this.height) * 2;
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(height, 2) + (Math.pow(width, 2)));
    }
    public String toStringArea(){
        return String.format("%.2f", area());
    }
    public String toStringParameter(){
        return String.format("%.2f", parameter());
    }
    public String toStringDiagonal(){
        return String.format("%.2f", diagonal());
    }
}
