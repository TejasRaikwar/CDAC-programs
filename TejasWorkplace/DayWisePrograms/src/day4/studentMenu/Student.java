package day4.studentMenu;

public class Student {
	private static int count = 0;
	private long baseRoll = 1;
	private final long rollNo;
	private String name;
	private String course;
	private float marks;

	public Student() {
		count++;
		rollNo = baseRoll++;
		name = "";
		course = "";
		marks = 0.0f;

	}

	public Student(String name, String course, float marks) {
		count++;
		this.rollNo = baseRoll++;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	public static int getCount() {
		return count;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public long getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [ " + "Roll No. : " + rollNo + ", Name : " + name + ", Course : " + course + ", Marks : "
				+ marks + " ]";
	}

}
