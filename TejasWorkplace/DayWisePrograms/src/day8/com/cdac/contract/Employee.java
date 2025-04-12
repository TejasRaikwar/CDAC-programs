package com.cdac.contract;



public class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public double calculateSalary() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Employee [Name: " + name + ", ID: " + id + "]";
    }
}
