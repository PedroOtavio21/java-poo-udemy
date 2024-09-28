package exercicios.ex04.application;

import exercicios.ex04.entities.Conta;

import java.util.Scanner;
import java.util.Locale;
public class Main{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta = null;
        int operacao = 0;

        System.out.println("Insira o seu nome de titular:");
        String nomeTitular = sc.nextLine();
        System.out.println("Insira o número de sua conta:");
        int numeroConta = sc.nextInt();

        System.out.println("Deseja inserir um depósito inicial? (1 - sim/2 - não)");
        operacao = sc.nextInt();

        if(operacao == 1){
            System.out.printf("Insira o valor inicial do depósito:");
            double valorDeposito = sc.nextDouble();
            conta = new Conta(numeroConta, nomeTitular, valorDeposito);
            System.out.println("Conta inicializada com sucesso.");
        }
        if(operacao == 2){
            conta = new Conta(numeroConta, nomeTitular);
            System.out.println("Conta inicializada com sucesso.");
        }

        System.out.println("Insira o valor desejado do depósito:");
        double deposito = sc.nextDouble();
        conta.deposito(deposito);
        System.out.println("Conta atualizada:");
        System.out.println(conta);

        System.out.println("Insira o valor desejado do saque:");
        double saque = sc.nextDouble();
        conta.saque(saque);
        System.out.println("Conta atualizada:");
        System.out.println(conta);

        sc.close();
    }
}