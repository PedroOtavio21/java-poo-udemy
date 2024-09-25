package exercicios.ex02.entities;

public class Funcionario {
    private String name;
    private double grossSalary;
    private double tax;

    public Funcionario(String name, double grossSalary, double tax){
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return this.getName() + ", $ " + this.netSalary();
    }

    public double netSalary(){
        return this.getGrossSalary() - this.getTax();
    }

    public void increaseSalary(double percentage){
        this.grossSalary = this.getGrossSalary() + (this.getGrossSalary() * percentage / 100.0);
    }
}
