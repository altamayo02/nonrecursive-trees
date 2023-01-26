class Node {
  protected int key;
  protected Node left;
  protected Node right;
  protected Node parent;

  public Node() {}
  public Node(int key) {
    setKey(key);
  }
  public Node(Node n) {
    setKey(n.getKey());
    setLeft(n.getLeft());
    setRight(n.getRight());
    setParent(n.getParent());
  }

  public void setKey(int key) {
    this.key = key;
  }
  public int getKey() {
    return this.key;
  }
  
  public void setLeft(Node left) {
    this.left = left;
    if (left != null) this.left.setParent(this);
  }
  public Node getLeft() {
    return this.left;
  }

  public void setRight(Node right) {
    this.right = right;
    if (right != null) this.right.setParent(this);
  }
  public Node getRight() {
    return this.right;
  }

  public void setParent(Node parent) {
    this.parent = parent;
  }
  public Node getParent() {
    return this.parent;
  }

  /*
  public INode toINode(Node parent) {
    INode iNode = new INode(this, parent);
    if (getLeft() != null) getLeft().toINode(this);
    
    
    while (getLeft() != null) branch = branch.getLeft();
    
  }
  */
}