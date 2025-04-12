package devJava;


public class Main {
	public static void main(String[] args) {
		nestedClasses nc = new nestedClasses();
		nestedClasses.innerClass ni = new nestedClasses().new innerClass();
		ni.greet();
		new nestedClasses().new innerClass().greet();
	}
}

//