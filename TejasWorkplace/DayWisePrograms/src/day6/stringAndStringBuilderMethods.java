package day6;

import java.util.Arrays;

public class stringAndStringBuilderMethods {
	public static void main(String[] args) {
		
		// String
		 String str = "Hello World";
	        System.out.println("String Methods:");
	        System.out.println("1. length(): " + str.length());
	        System.out.println("2. charAt(4): " + str.charAt(4));
	        System.out.println("3. substring(6): " + str.substring(6));
	        System.out.println("4. substring(0,5): " + str.substring(0,5));
	        System.out.println("5. toUpperCase(): " + str.toUpperCase());
	        System.out.println("6. toLowerCase(): " + str.toLowerCase());
	        System.out.println("7. contains(\"World\"): " + str.contains("World"));
	        System.out.println("8. replace('l','L'): " + str.replace('l','L'));
	        System.out.println("9. indexOf('o'): " + str.indexOf('o'));
	        System.out.println("10. split(\" \"): " + Arrays.toString(str.split(" ")));
		
		// StringBuilder
	        StringBuilder sb = new StringBuilder("Java");
	        System.out.println("\nStringBuilder Methods:");
	        System.out.println("1. append(\" Programming\"): " + sb.append(" Programming"));
	        System.out.println("2. insert(4,\" is\"): " + sb.insert(4," is"));
	        System.out.println("3. delete(4,7): " + sb.delete(4,7));
	        System.out.println("4. reverse(): " + sb.reverse());
	        sb.reverse(); // reverse back
	        System.out.println("5. replace(5,16,\"Code\"): " + sb.replace(5,16,"Code"));
	        System.out.println("6. capacity(): " + sb.capacity());
	        System.out.println("7. length(): " + sb.length());
	        System.out.println("8. charAt(2): " + sb.charAt(2));
	        System.out.println("9. substring(5): " + sb.substring(5));
	        System.out.println("10. setCharAt(0,'j'): ");
	        sb.setCharAt(0,'j');
	        System.out.println("    Modified: " + sb);
		
	}

}
