package exercicios.ex01.entities;

public class Retangulo {
    private double width;
    private double height;

    public Retangulo(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area(){
        return this.getWidth() * this.getHeight();
    }

    public double perimeter(){
        return (this.getWidth() * 2) + (this.getHeight() * 2);
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(this.getWidth(),2) + Math.pow(this.getHeight(),2));
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}