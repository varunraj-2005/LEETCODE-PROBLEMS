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
    public TreeNode sortedArrayToBST(int[] nums) {
        return merge(nums,0,nums.length-1);
    }
    public TreeNode merge(int nums[],int left,int right){
        if(left>right) return null;
        int mid = (left+right)/2;
        TreeNode n = new TreeNode(nums[mid]);
        n.left=merge(nums,left,mid-1);
        n.right=merge(nums,mid+1,right);
        return n;
    }
}