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
    public int minDepth(TreeNode root) {
        return min(root);
    }
    public int min(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = min(root.left);
        int right = min(root.right);
        return (Math.min(left,right)+1 == 1)?Math.max(left,right)+1 : Math.min(left,right)+1;
    }
}