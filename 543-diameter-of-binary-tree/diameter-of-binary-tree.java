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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int arr[] = new int[3];
        height (root,arr);
        return arr[0];
    }
    public int height(TreeNode root,int arr[]){
        if (root == null) return 0;
        int left = height(root.left,arr);
        int right = height(root.right,arr);
        arr[0]=Math.max(arr[0],left+right);
        return 1+Math.max(left,right);
    }
}