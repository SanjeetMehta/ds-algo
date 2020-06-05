package binarytree;

public class Tree {
	private TreeNode root;

	public void find(int key) {
		TreeNode current = root;

		while (current != null) {
			if (key < current.iData) {
				current = current.leftNode;
			} else if (key > current.iData) {
				current = current.rightNode;
			} else if (key == current.iData) {
				System.out.print("Element found");
				return;
			}
		}
		System.out.print("Element not found");
		return;
	}

	public void insert(int key) {
		TreeNode node = new TreeNode();
		node.iData = key;
		if (root == null) {
			root = node;
		} else {
			TreeNode current = root;
			TreeNode parent;
			while (true) {
				parent = current;
				if (key < current.iData) {
					current = current.leftNode;
					if (current == null) {
						parent.leftNode = node;
						return;
					}
				} else {
					current = current.rightNode;
					if (current == null) {
						parent.rightNode = node;
						return;
					}
				}
			}
		}

	}

	public void delete(int key) {
		TreeNode current = root;
		TreeNode parent = root;
		boolean isLeftChild = true;

		while (current.iData != key) {
			parent = current;

			if (key < parent.iData) {
				isLeftChild = true;
				current = current.leftNode;
			} else {
				isLeftChild = false;
				current = current.rightNode;
			}

			if (current == null) {
				return;
			}
		}

		if (current.leftNode == null && current.rightNode == null) {
			if (current == root) {
				root = null;
			} else if (isLeftChild) {
				parent.leftNode = null;
			} else {
				parent.rightNode = null;
			}
		} else if (current.rightNode == null) {
			if (current == root) {
				root = current.leftNode;
			} else if (isLeftChild) {
				parent.leftNode = current.leftNode;
			} else {
				parent.rightNode = current.leftNode;
			}
		} else if (current.leftNode == null) {
			if (current == root) {
				root = current.rightNode;
			} else if (isLeftChild) {
				parent.leftNode = current.rightNode;
			} else {
				parent.rightNode = current.rightNode;
			}
		} else {
			TreeNode successorNode = getSuccessor(current);
			if (root == current) {
				root = successorNode;
			} else if (isLeftChild) {
				parent.leftNode = successorNode;
			} else {
				parent.rightNode = successorNode;
			}
			successorNode.leftNode = current.leftNode;
		}

	}

	private TreeNode getSuccessor(TreeNode delNode) {
		TreeNode sp = delNode;
		TreeNode s = delNode;
		TreeNode current = delNode.rightNode;

		while (current != null) {
			sp = s;
			s = current;
			current = current.leftNode;
		}

		if (s.rightNode != null) {
			sp.leftNode = s.rightNode;
			s.rightNode = delNode;
		}

		return s;
	}

	public void inOrder() {
		inOrderTraversal(root);
	}

	public void preOrder() {
		preOrderTraversal(root);
	}

	public void postOrder() {
		postOrderTraversal(root);
	}

	public void inOrderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		inOrderTraversal(node.leftNode);
		System.out.print(node.iData + " ");
		inOrderTraversal(node.rightNode);
	}

	public void preOrderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.iData + " ");
		inOrderTraversal(node.leftNode);
		inOrderTraversal(node.rightNode);
	}

	public void postOrderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		inOrderTraversal(node.leftNode);
		inOrderTraversal(node.rightNode);
		System.out.print(node.iData + " ");

	}
}
