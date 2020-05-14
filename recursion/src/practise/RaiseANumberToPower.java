package practise;

public class RaiseANumberToPower {

	public static void main(String args[]) {
		System.out.println(calculatePower(2, 18));
	}

	public static int calculatePower(int x, int y) {
		if (y == 1) {
			return x * y;
		}

		int ans = calculatePower(x * x, y / 2);
		if (y % 2 != 0) {
			return ans * x;
		}
		return ans;

	}
}
