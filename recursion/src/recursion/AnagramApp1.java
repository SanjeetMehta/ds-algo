package recursion;

public class AnagramApp1 {

	static int wordCount;
	static int count = 0;
	static char[] wordArray = new char[100];

	public static void main(String args[]) {
		String word = "sanj";

		wordCount = word.length();

		for (int i = 0; i < wordCount; i++) {
			wordArray[i] = word.charAt(i);
		}

		doAnagram(wordCount);
	}

	public static void doAnagram(int newSize) {
		if (newSize == 1)
			return;

		for (int i = 0; i < newSize; i++) {
			doAnagram(newSize - 1);
			if (newSize == 2)
				display();
			rotate(newSize);
		}
	}

	public static void rotate(int newSize) {
		int i = 0;
		int rotateFrom = wordCount - newSize;
		char temp = wordArray[rotateFrom];
		for (i = rotateFrom + 1; i < wordCount; i++) {
			wordArray[i - 1] = wordArray[i];
		}
		wordArray[i - 1] = temp;
	}

	public static void display() {
		if (count < 99)
			System.out.print(" ");
		if (count < 9)
			System.out.print(" ");
		System.out.print(++count + " ");
		for (int j = 0; j < wordCount; j++)
			System.out.print(wordArray[j]);
		System.out.print(" ");
		System.out.flush();
		if (count % 6 == 0)
			System.out.println("");
	}
}
