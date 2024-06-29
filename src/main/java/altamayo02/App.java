package altamayo02;

import altamayo02.model.Node;

/**
 * Challenge:
 * Traverse a tree using the inorder algorithm with and without recursion.
 * 
 * Restrictions:
 * You are not allowed to import any library.
 */
public class App 
{
	public static void main( String[] args )
	{
		Node<Integer> rootN = new Node<>(0);
    rootN.setLeft(new Node<>(1));
		rootN.setRight(new Node<>(2));
		rootN.getLeft().setLeft(new Node<>(3));
		rootN.getLeft().setRight(new Node<>(4));
		rootN.getRight().setLeft(new Node<>(5));
		rootN.getRight().setRight(new Node<>(6));
		rootN.getLeft().getLeft().setLeft(new Node<>(7));
		rootN.getLeft().getLeft().setRight(new Node<>(8));
		rootN.getRight().getRight().setLeft(new Node<>(9));
		rootN.getRight().getRight().setRight(new Node<>(10));

    System.out.print("Recursive InOrder:");
    recursiveInOrder(rootN);
    System.out.println();
    
    System.out.print("Iterative InOrder:");
    iterativeInOrder(rootN);
	}

	public static void recursiveInOrder(Node<Integer> n) {
		if (n.getLeft() != null) recursiveInOrder(n.getLeft());
		System.out.printf(" %d;", n.getKey());
		if (n.getRight() != null) recursiveInOrder(n.getRight());
	}
	
	public static void iterativeInOrder(Node<Integer> m) {
		Node<Integer> n = new Node<>(m);
		
		while (n.getParent() != n.getRight()) {
		// Find the leftmost node
		while (n.getLeft() != null) {
			n = n.getLeft();
		}
		
		// Print it
		System.out.printf(" %d;", n.getKey());
		
		// Check for a node on the right
		if (n.getRight() != null) {
			n = n.getRight();
		// When node has no children
		} else if (n.getParent() != null) {
			Node<Integer> parent = n.getParent();
			
			// If node is a left node, delete it
			if (parent.getLeft() != null) {
			parent.setLeft(null);
			// If node is a right node
			} else {
			// Delete the right nodes upward until a left node is found
			while (parent.getRight().getKey() == n.getKey()) {
				parent.setRight(null);
				if (parent.getParent() == null) break;
				n = parent;
				parent = parent.getParent();
			}
			parent.setLeft(null);
			}
			n = parent; 
		}
		}
		System.out.println();
	}
}