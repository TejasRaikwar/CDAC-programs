package day3;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Employee[] eArr = new Employee[] {
			new Employee("Tejas",30000),
			new Employee("Shilpa",35000),
			new Employee("Karan",31000),
			new Employee("Shanti",30000),
			new Employee("Atharva",30000)
		};
		
		Arrays.stream(eArr).forEach(e -> System.out.println(e.printData()));
		
	}
}
