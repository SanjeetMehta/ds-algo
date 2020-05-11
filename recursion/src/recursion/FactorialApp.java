package recursion;

public class FactorialApp {

	public static int calculateFactorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * calculateFactorial(n - 1));
	}

	public static void main(String args[]) {
		System.out.print(calculateFactorial(5));
	}
}