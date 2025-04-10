package day6;

public class reverseString {
	public static void main(String[] args) {
		String str = "Hello, World!";

		char[] cArr = str.toCharArray();
		int left = 0, right = cArr.length - 1;
		while (left < right) {
			char temp = cArr[left];
			cArr[left] = cArr[right];
			cArr[right] = temp;
			left++;
			right--;
		}
		String strRev = new String(cArr);
		System.out.println(strRev);
	}
}
