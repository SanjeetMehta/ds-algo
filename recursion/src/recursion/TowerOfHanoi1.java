package recursion;

public class TowerOfHanoi1 {

	public static void main(String args[]) {
		int towerSize = 3;
		moveToTower(3, 'A', 'B', 'C');
	}

	public static void moveToTower(int size, char from, char using, char to) {

		if (size > 0) {
			moveToTower(size - 1, from, to, using);
			System.out.print("Move from " + from + " to " + to + "\n");
			moveToTower(size - 1, using, from, to);
		}
	}
}
