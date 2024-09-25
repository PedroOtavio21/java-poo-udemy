package aula.exemplo02;

public class Main {
    public static void main(String[] args) {

        Product produto = new Product("Computador", 2100.00, 3);

        produto.show();

        produto.addProducts(5);
        produto.removeProducts(4);

        produto.show();
    }
}
