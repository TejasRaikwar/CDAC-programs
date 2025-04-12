package day6;

public class wordCount {
	public static void main(String[] args) {
		String text = "fox is quick and fox is brown";
		String word = "is";

		String[] words = text.split(" ");
		int count = 0;
		for(String w : words) {
			if(w.equals(word))
				count++;
		}
		System.out.println("Occurance of '"+word+"' is "+count);
	}
}
