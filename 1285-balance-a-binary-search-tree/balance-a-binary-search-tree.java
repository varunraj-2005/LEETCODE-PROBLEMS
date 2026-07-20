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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        inorder(root,l);
        Collections.sort(l);
        return build(l,0,l.size()-1);
    }
    public static void inorder(TreeNode root,List<Integer> l){
        if(root==null){
            return;
        }
        inorder(root.left,l);
        l.add(root.val);
        inorder(root.right,l);
    }
    public static TreeNode build(List<Integer> l,int i,int j){
        if(i>j){
            return null;
        }
        int mid=(i+j)/2;
        TreeNode t = new TreeNode(l.get(mid));
        t.left=build(l,i,mid-1);
        t.right=build(l,mid+1,j);
        return t;
    }
}