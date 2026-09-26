/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //Amazon,Google,Adobe,Microsoft,Apple,etc.
        Set<ListNode> num = new HashSet<>();
        ListNode curr=head;
        while(curr!=null){
            if(num.contains(curr)){
               return true;
            }
            num.add(curr);
            curr=curr.next;
        }
        return false;

    }
}