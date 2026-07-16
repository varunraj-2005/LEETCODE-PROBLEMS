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
     static  int c=0;
    public int averageOfSubtree(TreeNode root) {
        c=0;
       inorder(root);
       return c;
    }
    public static void inorder(TreeNode r){
        if(r==null){
            return;
        }
        inorder(r.left);
        if(find(r.val,r)) c++;
        inorder(r.right);
    }
    public static boolean find(int a,TreeNode r){
        int sum=0;
        int count=0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(r);
        while(!q.isEmpty()){
            TreeNode t = q.poll();
            sum+=t.val;
            count++;
            if(t.left!=null){
                q.add(t.left);
            }
            if(t.right!=null){
                q.add(t.right);
            }
        }
        return (int)(sum/count)==a;
    }
}