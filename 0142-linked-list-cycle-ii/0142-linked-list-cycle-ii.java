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
    public ListNode detectCycle(ListNode head) {
        //Microsoft,Google,Apple,Adobe,Amazon,etc.
        if(head==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;

            if(fast==slow){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return null;
        }
        ListNode curr=head;
        while(curr!=slow){
            curr=curr.next;
            slow=slow.next;
        }
        return curr;
  
    }
}


// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         //Microsoft,Google,Apple,Adobe,Amazon,etc.
//         Set<ListNode> set=new HashSet<>();
//         ListNode curr=head;
//         while(curr!=null){
//             if(set.contains(curr)){
//                 return curr;
//             }
//             set.add(curr);
//             curr=curr.next;
//         }
//         return null;
//   //Space Complexity:O(n)
//   //Time Complexity:O(n)
//     }
// }