package exercicios.ex04.entities;

public class Conta{
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public Conta(int numeroConta, String nomeTitular, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        deposito(depositoInicial);
    }

    public Conta(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valorDeposito){
        saldo += valorDeposito;
    }

    public void saque(double valorSaque){
        if(saldo > 0){
            if(valorSaque > 0){
                saldo -= valorSaque + 5.00;
            }
            else {
                System.out.println("Valor de saque desejado inválido.");
            }
        }
        System.out.println("Saldo indisponível para saque.");
    }

    @Override
    public String toString() {
        return "Número conta: " + getNumeroConta() + ", Nome titular: " + getNomeTitular() +
                ", Saldo: R$ " + getSaldo();
    }
}