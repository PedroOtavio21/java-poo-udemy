package exercicios.ex01.applicaction;

import exercicios.ex01.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Retangulo retangulo = new Retangulo(width, height);

        System.out.println("AREA = " + retangulo.area());
        System.out.println("PERIMETER = " + retangulo.perimeter());
        System.out.println("DIAGONAL = " + retangulo.diagonal());
    }
}
