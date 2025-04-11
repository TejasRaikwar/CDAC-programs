package day6;

public class findWordInString {

	public static void main(String[] args) {
		String text = "thequickbrownfoxjumpsoverthelazydog";
		String word = "jumps";

		boolean found = new findWordInString().containsWord(text, word);
		System.out.println("Word '" + word + "' found : " + found);
	}

	boolean containsWord(String text, String word) {
		if (word.length() > text.length()) {
			return false;
		}

		int windowSize = word.length();

		for (int i = 0; i <= text.length() - windowSize; i++) {
			String window = text.substring(i, i + windowSize);
			if (window.equals(word)) {
				return true;
			}
		}

		return false;
	}
}
