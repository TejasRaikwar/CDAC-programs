package day3;

public class Employee {
	private static long nextEmpNo = 123456;
	private final long empNo;
	private String name;
	private double salary; 

	public Employee() {
		this.empNo = nextEmpNo++;
		this.name = "";
		this.salary = 0.0;
	}

	public Employee(String name, double salary) {
		this.empNo = nextEmpNo++;
		this.name = name;
		this.salary = salary;
	}

	public long getEmpNo() {
		return empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String printData() {
		return "Employee [ Employee No. : " + empNo + ", Name : "+name+", salary : " + salary + " ]"; 
	}

}
