class Solution{
  public boolean subTree(Node n1, Node n2){
    return traverse(n1, n2);
  }
  
  public boolean equals(Node n1, Node n2){
    if(n1 == null && n2 == null) return true;
    if(n1 == null || n2 == null) return false;
    return n1.data == n2.data && equals(n1.left, n2.left) && equals(n1.right, n2.right);
  }
  
  public boolean traverse(Node n1, Node n2){
    return n1 != null && (equals(n1, n2) || traverse(n1.left, n2) || traverse(n1.right, n2));
  }
}
