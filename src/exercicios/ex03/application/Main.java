package exercicios.ex03.application;

import exercicios.ex03.entities.Aluno;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        Aluno aluno = new Aluno(nome, n1, n2, n3);

        System.out.println(aluno.verificaAprovado());

        sc.close();
    }
}
