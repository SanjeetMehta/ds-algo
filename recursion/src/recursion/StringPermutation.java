package recursion;

public class StringPermutation {
	static StringBuilder word = new StringBuilder("abc");
	static int count = 0;

	public static void main(String args[]) {
		int wordSize = word.length();
		permute(0, wordSize - 1);
	}

	public static void permute(int l, int r) {

		int i;
		if (l == r) {
			System.out.print(++count + " " + word + "\n ");
			if (count % 6 == 0) {
				System.out.print("\n");
			}
		} else {
			for (i = l; i <= r; i++) {
				swap(l, i);
				System.out.print(
						" After swap " + word + " ;Value of l:" + l + ";value of i:" + i + ";value of r:" + r + "\n");
				permute(l + 1, r);
//				swap(l, i);
			}
		}
	}

	public static void swap(int i, int j) {
		char temp = word.charAt(i);
		word.setCharAt(i, word.charAt(j));
		word.setCharAt(j, temp);
	}
}
