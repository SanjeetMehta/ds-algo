package practise;

public class Knapsack {
	public static int found = 0;

	public static void main(String args[]) {
		int weight = 20;
		int[] array = { 11, 8, 7, 6, 5 };

		calculate(0, array, weight);
	}

	public static void calculate(int index, int[] array, int weight) {

		if (weight < 0) {
			return;
		}
		if (weight == 0) {
			found = 1;
			return;
		}
		for (int i = index; i < array.length; i++) {
			calculate(i + 1, array, weight - array[i]);
			if (found == 1) {
				System.out.print(array[i] + " ");
				break;
			}
		}
	}
}
