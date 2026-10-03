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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode temp=head;
        int size=0;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        size++;
        k=k%size;
        if (k == 0) {
            return head;
        }
        temp.next=head;
    

        ListNode newList=head;
        for(int j=1;j<size-k;j++){
            newList=newList.next;
        }
        ListNode newHead=newList.next;
        newList.next=null;

        return newHead;

        
    }
}