class INode {
  private int key;
  private INode left;
  private INode right;
  private INode parent;

  public INode(int key) {
    setKey(key);
  }
  /*
  public INode(Node n, Node parent) {
    if (parent != null) setParent(parent.toINode());
    setLeft(n.getLeft());
  }
  */

  public void setParent(INode parent) {
    this.parent = parent;
  }
  public INode getParent() {
    return this.parent;
  }

  public void setLeft(INode left) {
    this.left = left;
    left.setParent(this);
  }
  public INode getLeft() {
    return this.left;
  }

  public void setKey(int key) {
    this.key = key;
  }
  public int getKey() {
    return this.key;
  }

  public void setRight(INode right) {
    this.right = right;
    right.setParent(this);
  }
  public INode getRight() {
    return this.right;
  }
}