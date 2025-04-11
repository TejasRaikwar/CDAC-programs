package day6;

public class FormatNumber {
	public static void main(String[] args) {
		String[] numbers = { "+91-988-162-8598", "+919881628598", "9881628598", "988162859" };

		for (String num : numbers) {
			try {
				System.out.println("Input: " + num);
				System.out.println("Formatted: " + formatNumber(num));
			} catch (IllegalArgumentException e) {
				System.out.println("Error: " + e.getMessage());
			}
			System.out.println();
		}
	}

	public static String formatNumber(String number) {
		// Remove all non-digit characters
		String digits = number.replaceAll("[^0-9]", "");

		if (digits.length() != 10 && digits.length() != 12) {
			throw new IllegalArgumentException("Number must be 10 or 12 digits");
		}

		if (digits.length() == 10) {
			return "+91-" + digits.substring(0, 3) + "-" + digits.substring(3, 6) + "-" + digits.substring(6);
		} else {
			return "+" + digits.substring(0, 2) + "-" + digits.substring(2, 5) + "-" + digits.substring(5, 8) + "-"
					+ digits.substring(8);
		}
	}
}
