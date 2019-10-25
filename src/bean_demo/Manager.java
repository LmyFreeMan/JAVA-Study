package bean_demo;

import java.time.LocalDate;

public class Manager extends Employee  {


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double salary, LocalDate hireDsay, double bonus) {
        super(name, salary, hireDsay);
        this.bonus = bonus;
    }

    private double bonus;
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    public static void main(String[] args) {

    }
}
