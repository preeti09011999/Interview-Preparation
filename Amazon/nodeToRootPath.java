public static boolean rootToNodePath(Node node,int data,ArrayList<Node> path){

        if(node==null) return false;

        if(node.data == data){
            path.add(node);
            return true;
        }

        boolean res = false;
        res = res || rootToNodePath(node.left,data,path);
        res = res || rootToNodePath(node.right,data,path);

        if(res) {
            path.add(node);
            return true;
        }

        return false;
    }
