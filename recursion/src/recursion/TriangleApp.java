package recursion;

public class TriangleApp {

	public static int triangle(int n) {
		if (n == 1)
			return 1;
		else
			return (n + triangle(n - 1));
	}

	public static void main(String[] args) {
		System.out.print(triangle(5));
	}
}
