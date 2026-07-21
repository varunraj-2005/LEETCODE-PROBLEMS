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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        inorder(root,l);
        return create(l);
    }
    public static void inorder(TreeNode root,List<Integer> l){
        if(root==null) return;
        inorder(root.left,l);
        l.add(root.val);
        inorder(root.right,l);
    }
    public static TreeNode create(List<Integer> l ){
        TreeNode root = new TreeNode(l.get(0));
        for(int i=1;i<l.size();i++){
            TreeNode n = new TreeNode(l.get(i));
            TreeNode curr=root;
            while(true){
                if(curr.right==null){
                    curr.right=n;
                    break;
                }
                curr=curr.right;
            }
        }
        return root;
    }
}