/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int camera = 0;
    public int minCameraCover(TreeNode root) {
        if(minCameraCover_(root) == -1) camera++;
        return camera;
    }
    // 0 -> have a camera , 1=> covered, -1 => needs a camera
    public int minCameraCover_(TreeNode node){
        if(node == null) return 1;
        int lres = minCameraCover_(node.left);
        int rres = minCameraCover_(node.right);
        if(lres == -1 || rres == -1){
            camera++;
            return 0;
        }
        if(lres == 0 || rres == 0) return 1;
        return -1;
    
    }
}
