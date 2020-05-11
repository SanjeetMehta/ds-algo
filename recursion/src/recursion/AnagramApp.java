package recursion;

public class AnagramApp {
	static int size;
	static int count;
	static char[] arrChar = new char[100];
	static int anaCount = 0;

	public static void main(String args[]) {
		String word = "sanjet";
		size = word.length();
		count = 0;
		for (int i = 0; i < size; i++) {
			arrChar[i] = word.charAt(i);
		}
		doAnagram(size);
		System.out.print("wait here" + anaCount);
	}

	public static void doAnagram(int newSize) {

		if (newSize == 1)
			return;
		for (int j = 0; j < newSize; j++) {
//			System.out.print("Received Size: " + newSize + "\n");
//			System.out.print(" value of j: " + j + "\n");
			doAnagram(newSize - 1);
			if (newSize == 2)
				displayWord();
			rotate(newSize);

		}
	}

	public static void rotate(int newSize) {
		int j;
		int position = size - newSize;
		char temp = arrChar[position];
		for (j = position + 1; j < size; j++) {
			arrChar[j - 1] = arrChar[j];
		}
		arrChar[j - 1] = temp;
	}

	public static void displayWord() {
		if (count < 99)
			System.out.print(" ");
		if (count < 9)
			System.out.print(" ");
		System.out.print(++count + " ");
		for (int j = 0; j < size; j++)
			System.out.print(arrChar[j]);
		System.out.print(" ");
		System.out.flush();
		if (count % 6 == 0)
			System.out.println("");
	}
}
