package exercicios.ex02.application;

import exercicios.ex02.entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as informações necessários do usuário abaixo:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Gross Salary: ");
        double grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        double tax = sc.nextDouble();

        Funcionario funcionario = new Funcionario(name, grossSalary, tax);

        System.out.println("Employee: " + funcionario);

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

        funcionario.increaseSalary(percentage);
        System.out.println("Updated data: " + funcionario);
    }
}
