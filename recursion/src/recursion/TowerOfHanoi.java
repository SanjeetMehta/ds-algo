package recursion;

public class TowerOfHanoi {

	public static void main(String args[]) {
		int numberOfDisks = 3;
		moveDisk(numberOfDisks, 'A', 'B', 'C');
	}

	public static void moveDisk(int disk, char from, char using, char to) {
		if (disk > 0) {
			moveDisk(disk - 1, from, to, using);
			System.out.print("Move " + disk + " from " + from + " to " + to + "\n");
			moveDisk(disk - 1, using, from, to);
		}
	}
}
