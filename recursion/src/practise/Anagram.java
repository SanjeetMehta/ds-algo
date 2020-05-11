package practise;

public class Anagram {

	public static StringBuilder word;
	public static int counter;
	public static void main(String args[]) {
		word=new StringBuilder("SANJ");
		doAnagram(0);
	}

	public static void doAnagram(int indexToBeSwappedWith) {

		if (indexToBeSwappedWith == word.length()) {
			System.out.print(++counter+" "+word+":: ");
		}

		for (int i = indexToBeSwappedWith; i < word.length(); i++) {
			swap(i, indexToBeSwappedWith);
			doAnagram(indexToBeSwappedWith + 1);
			swap(i, indexToBeSwappedWith);
		}
	}

	public static void swap(int i, int j) {
		char temp = word.charAt(i);
		word.setCharAt(i, word.charAt(j));
		word.setCharAt(j, temp);
	}
}
