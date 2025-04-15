package day8.com.cdac.contract;



public class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return "ContractEmployee [Name: " + name + ", ID: " + id +
               ", Hourly Rate: " + hourlyRate + ", Hours Worked: " + hoursWorked +
               ", Salary: " + calculateSalary() + "]";
    }
}

