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
    public int pairSum(ListNode head) {
        List<Integer> l = new ArrayList<>();
        while(head!=null){
            l.add(head.val);
            head=head.next;
        }
        int i=0,j=l.size()-1;
        int max=0;
        while(i<j){
            if((l.get(i)+l.get(j))>max){
                max=l.get(i)+l.get(j);
            }
            i++;
            j--;
        }
        return max;
    }
}