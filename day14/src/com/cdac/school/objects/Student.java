package com.cdac.school.objects;

public class Student {
private int rollNo;
private String standard;
private String division;
private String name;

public Student() {
	super();
}

public Student(int rollNo, String standard, String division, String name) {
	super();
	this.rollNo = rollNo;
	this.standard = standard;
	this.division = division;
	this.name = name;
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getStandard() {
	return standard;
}

public void setStandard(String standard) {
	this.standard = standard;
}

public String getDivision() {
	return division;
}

public void setDivision(String division) {
	this.division = division;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", standard=" + standard + ", division=" + division + ", name=" + name + "]";
}


}
