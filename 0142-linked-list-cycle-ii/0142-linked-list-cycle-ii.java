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



// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         //Microsoft,Google,Apple,Adobe,Amazon,etc.
//         if(head==null){
//             return null;
//         }
//         ListNode slow=head;
//         ListNode fast=head.next;
//         while(slow!=fast){
//             if(fast==null || fast.next==null){
//                 return null;
//             }
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return fast;
        
  
//     }
// }


public class Solution {
    public ListNode detectCycle(ListNode head) {
        //Microsoft,Google,Apple,Adobe,Amazon,etc.
        Set<ListNode> set=new HashSet<>();
        ListNode curr=head;
        while(curr!=null){
            if(set.contains(curr)){
                return curr;
            }
            set.add(curr);
            curr=curr.next;
        }
        return null;
  
    }
}