public int LeafToLeafAns = -(int)1e8;
    public int leafToLeafSum_(Node node){
        if(node == null) return -(int)1e8;
        if(node.left == null && node.right == null) return node.data;

        int lMax = leafToLeafSum_(node.left); 
        int rMax = leafToLeafSum_(node.right);
        
        if(node.left != null && node.right != null){
            LeafToLeafAns = Math.max(LeafToLeafAns, lMax + node.data +rMax);
        }

        return Math.max(lMax,rMax) + node.data;
    }

    int maxPathSum(Node root)
    { 
        leafToLeafSum_(root);
        return LeafToLeafAns;
    } 
