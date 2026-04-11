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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev=null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        if (n==1) {
            prev =prev.next; 
        } else {
            ListNode temp = prev;
            for (int i=1; i<n-1;i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        ListNode a=prev;
        prev=null;
        while(a!=null){
            ListNode next = a.next;
            a.next=prev;
            prev=a;
            a=next;
        }
        return prev;
    }
}