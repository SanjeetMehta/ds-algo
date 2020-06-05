package binarytree;

public class TreeApp {

	public static void main(String args[]) {
		Tree node = new Tree();
		node.insert(5);
		node.insert(10);
		node.insert(15);
		node.insert(11);
		node.insert(2);
		node.insert(1);
		node.insert(3);
		System.out.println();
//		node.find(11);

		node.inOrder();
		System.out.println();
		node.preOrder();
		System.out.println();
		node.postOrder();

		node.delete(15);

	}
}
