package practise;

public class Combination {

	public static void main(String args[]) {
		String team = "";
		char firstPerson = 'A';
		int sizeOfGroup = 5;
		int sizeOfTeam = 4;
		findPermutation(team, firstPerson, sizeOfGroup, sizeOfTeam);
	}

	public static void findPermutation(String team, char firstPerson, int n, int k) {
		if (n == 0 || k == 0 || k > n) {
			if (k == 0)
				System.out.println(team);
			return;
		}

		findPermutation(team + firstPerson, (char) (firstPerson + 1), n - 1, k - 1);
		findPermutation(team, (char) (firstPerson + 1), n - 1, k);

	}
}
