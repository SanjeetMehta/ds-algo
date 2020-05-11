package recursion;

public class AnagramApp2 {

	static StringBuilder word = new StringBuilder("san");

	public static void main(String args[]) {
		int wordSize = word.length();
		permute(0, wordSize - 1);
	}

	public static void permute(int left, int right) {

		if (left == right) {
			System.out.print(word + " ");
		} else {
			for (int i = left; i < word.length(); i++) {
				swap(i, left);
				permute(left + 1, right);
				swap(left, i);
			}
		}
	}

	public static void swap(int i, int j) {
		char temp = word.charAt(i);
		word.setCharAt(i, word.charAt(j));
		word.setCharAt(j, temp);
	}
}
