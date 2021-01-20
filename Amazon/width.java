public static void width(Node node,int level,int[] minMax){
        if(node==null) return;

        minMax[0] = Math.min(minMax[0],level);
        minMax[1] = Math.max(minMax[1],level);

        width(node.left, level - 1, minMax);
        width(node.right, level + 1, minMax);
    }
