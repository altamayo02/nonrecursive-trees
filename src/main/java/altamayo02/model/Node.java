package altamayo02.model;

public class Node<T> {
  protected T key;
  protected Node<T> left;
  protected Node<T> right;
  protected Node<T> parent;

  public Node() {}

  public Node(T key) {
    this.key = key;
  }

  public Node(Node<T> n) {
    this.key = n.getKey();
		this.left = n.getLeft();
		try {
			this.right = n.getRight();
			this.parent = n.getParent();
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
  }


	public T getKey() {
    return this.key;
  }

  public void setKey(T key) {
    this.key = key;
  }
  
	public Node<T> getLeft() {
    return this.left;
  }

  public void setLeft(Node<T> left) {
    this.left = left;
    if (left != null) this.left.setParent(this);
  }

	public Node<T> getRight() {
    return this.right;
  }

  public void setRight(Node<T> right) {
    this.right = right;
    if (right != null) this.right.setParent(this);
  }
  
	public Node<T> getParent() {
    return this.parent;
  }

  public void setParent(Node<T> parent) {
    this.parent = parent;
  }
}