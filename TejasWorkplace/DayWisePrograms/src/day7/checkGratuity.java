package day7;

import java.time.LocalDate;
import java.time.Period;

enum Dept {
    HR, FINANCE, DEVELOPMENT, MARKETING
}

class Employee {
    private String empId;
    private String name;
    private LocalDate dateOfBirth;
    private LocalDate dateOfJoining;
    private Dept department;

    public Employee(String empId, String name, LocalDate dateOfBirth, LocalDate dateOfJoining, Dept department) {
        this.empId = empId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
        this.department = department;
    }

    public boolean isEligibleForGratuity() {
        LocalDate now = LocalDate.now();
        Period servicePeriod = Period.between(dateOfJoining, now);
        return servicePeriod.getYears() >= 5;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfJoining=" + dateOfJoining +
                ", department=" + department +
                '}';
    }
}

class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("E1001", "John", 
                                   LocalDate.of(1985, 10, 15), 
                                   LocalDate.of(2015, 6, 1), 
                                   Dept.DEVELOPMENT);

        System.out.println(emp);
        System.out.println("Eligible for gratuity: " + emp.isEligibleForGratuity());
    }
}
