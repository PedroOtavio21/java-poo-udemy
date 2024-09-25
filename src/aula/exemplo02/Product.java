package aula.exemplo02;

public class Product {
    private String name;
    private double price;
    private int quantities;

    public Product(String name, double price, int quantities){
        this.name = name;
        this.price = price;
        this.quantities = quantities;
    }

    public double totalValueInStock(){
        return price * quantities;
    }

    public void addProducts(int quantities){
        this.quantities += quantities;
    }

    public void removeProducts(int quantities){
        this.quantities -= quantities;
    }

    public void show(){
        System.out.println("Nome: " + this.getName());
        System.out.println("Preço: " + this.getPrice());
        System.out.println("Quantidade: " + this.getQuantities());
        System.out.println("Valor total em produtos: " + this.totalValueInStock());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantities() {
        return quantities;
    }

    public void setQuantities(int quantities) {
        this.quantities = quantities;
    }
}
