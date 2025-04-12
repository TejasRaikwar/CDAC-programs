package day6;

class Address {
    private String street;
    private String city;
    private String zipCode;
    
    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }
    
    @Override
    public String toString() {
        return street + ", " + city + ", " + zipCode;
    }
}

class Employee {
    private String name;
    private int id;
    private Address address;
    
    public Employee(String name, int id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "Employee ID: " + id + "\nName: " + name + "\nAddress: " + address;
    }
}

class EmployeeDemo {
    public static void main(String[] args) {
        Address addr = new Address("123 Main St", "New York", "10001");
        Employee emp = new Employee("John Doe", 101, addr);
        
        System.out.println(emp);
    }
}