import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;
}

    public Employee(String name, double salary, int year, int month, int day) {
        name = this.name;
        salary = this.salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

public LocalDate getHireDay() {
    return hireDay;
}
