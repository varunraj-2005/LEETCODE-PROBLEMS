// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public TreeNode bstToGst(TreeNode root) {
//         TreeNode n = root;
//         inorder(n,root);
//         return n;
//     }
//     public static void inorder(TreeNode n , TreeNode r){
//         if(n==null){
//             return;
//         }
//         inorder(n.left,r);
//         n.val=find(n.val,r);
//         inorder(n.right,r);
//     }
//     public static int find(int val, TreeNode r){
//         int sum=0;
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(r);
//         while(!q.isEmpty()){
//             TreeNode t = q.poll();
//             if(t.val>val){
//                 sum+=t.val;
//             }
//             if(t.left!=null){
//                 q.offer(t.left);
//             }
//             if(t.right!=null){
//                 q.offer(t.right);
//             }
//         }
//         return sum;
//     }
// }

class Solution {

    public TreeNode bstToGst(TreeNode root) {

        TreeNode copy = clone(root);

        inorder(root, copy);

        return root;
    }

    public static void inorder(TreeNode n, TreeNode r) {

        if (n == null)
            return;

        inorder(n.left, r);

        n.val = find(n.val, r);

        inorder(n.right, r);
    }

    public static int find(int val, TreeNode r) {

        int sum = 0;

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(r);

        while (!q.isEmpty()) {

            TreeNode t = q.poll();

            if (t.val > val)
                sum += t.val;

            if (t.left != null)
                q.offer(t.left);

            if (t.right != null)
                q.offer(t.right);
        }

        return sum + val;
    }

    public static TreeNode clone(TreeNode root) {

        if (root == null)
            return null;

        TreeNode node = new TreeNode(root.val);

        node.left = clone(root.left);

        node.right = clone(root.right);

        return node;
    }
}