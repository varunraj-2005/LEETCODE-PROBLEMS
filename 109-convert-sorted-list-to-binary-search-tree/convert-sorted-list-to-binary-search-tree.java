/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> l = new ArrayList<>();
        while(head!=null){
            l.add(head.val);
            head=head.next;
        }
        return merge(l,0,l.size()-1);
    }
    public TreeNode merge(List<Integer> l,int left,int right){
        if(left>right) return null;
        int mid = left+((right-left)/2);
        TreeNode n = new TreeNode(l.get(mid));
        n.left=merge(l,left,mid-1);
        n.right=merge(l,mid+1,right);
        return n;
    }
}