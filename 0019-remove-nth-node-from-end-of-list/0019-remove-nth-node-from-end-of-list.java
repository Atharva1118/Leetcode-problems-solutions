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
        //approach 1
        ListNode pHead=new ListNode(0);
        pHead.next=head;
        ListNode curr=head;
        int len=0;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int diff=len-n;
        int i=0;
        ListNode temp=pHead;
        while(i<diff){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;

    return pHead.next;
    }
    
}