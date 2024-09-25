package exercicios.ex03.entities;

public class Aluno {
    private String nome;
    private double n1;
    private double n2;
    private double n3;
    private double notaFinal;

    public Aluno(String name, double n1, double n2, double n3) {
        this.nome = name;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.calcularNotaFinal();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void calcularNotaFinal(){
        this.notaFinal = this.getN1() + this.getN2() + this.getN3();
    }

    public String verificaAprovado(){
        if(this.getNotaFinal() >= 60.00){
            return "FINAL GRADE = " + this.getNotaFinal() + "\nPASS";
        }
        else {
            double restante = 60.00 - this.getNotaFinal();
            return "FINAL GRADE = " + this.getNotaFinal() + "\nFAILED" + "\nMISSING " + restante + " POINTS";
        }
    }
}
