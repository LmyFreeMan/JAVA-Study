package bean_demo;
import java.time.LocalDate;
public class Employee extends Person {
    private double salary;
    private LocalDate hireDsay;
    public LocalDate getHireDsay() {
        return hireDsay;
    }
    public void setHireDsay(LocalDate hireDsay) {
        this.hireDsay = hireDsay;
    }
    @Override
    public String getDescription() {
        return "a employee";
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Employee(String name, double salary, LocalDate hireDsay) {
        super(name);
        this.salary = salary;
        this.hireDsay = hireDsay;
    }
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 80000, today);
        staff[1] = new Employee("Harry Hacker", 50000, today);
        staff[2] = new Employee("Tony Tester", 40000, today);
        for (Employee e : staff)
            System.out.println(e.getName() + " " + e.getSalary());
    }
}