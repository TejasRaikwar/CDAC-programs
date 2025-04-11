package day7;

import java.time.LocalDate;
import java.time.Period;

class Address {
	private String street;
	private String city;
	private String state;
	private String zipCode;

	public Address(String street, String city, String state, String zipCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return street + ", " + city + ", " + state + " " + zipCode;
	}
}

class Person {
	private String aadharNumber;
	private String name;
	private LocalDate dateOfBirth;
	private Address address;

	public Person(String aadharNumber, String name, LocalDate dateOfBirth, Address address) {
		this.aadharNumber = aadharNumber;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

	public boolean isBornBeforeIndependance() {
		LocalDate independanceDay = LocalDate.of(1947, 8, 15);
		return dateOfBirth.isBefore(independanceDay);
	}

	public int getAge() {
		return Period.between(dateOfBirth, LocalDate.now()).getYears();
	}

	public boolean isAgeAbove100() {
		return getAge() > 18;
	}

	@Override
	public String toString() {
		return "Person{" + "aadharNumber='" + aadharNumber + '\'' + ", name='" + name + '\'' + ", dateOfBirth="
				+ dateOfBirth + ", address=" + address + '}';
	}

}

public class personAndAgeCalculation {
	public static void main(String[] args) {
		Address address = new Address("123 Main St", "Mumbai", "Maharashtra", "400001");
		Person person = new Person("1234-5678-9012", "Ramesh", LocalDate.of(1940, 5, 10), address);
		
		System.out.println(person);
		System.out.println("Born before independance : " + person.isBornBeforeIndependance());
		System.out.println("Age : " + person.getAge());
		System.out.println("Age above 100 : " + person.isAgeAbove100() );
	}
}
