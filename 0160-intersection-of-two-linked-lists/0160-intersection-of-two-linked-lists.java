/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */


// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         if(headA==null && headB==null){
//             return null;
//         }
//         ListNode currA=headA;
//         ListNode currB=headB;
//         Set<ListNode> set=new HashSet<>();
//         while(currA!=null){
//             set.add(currA);
//             currA=currA.next;
//         }
//         while(currB!=null){
//             if(set.contains(currB)){
//                 return currB;
//             }
//             currB=currB.next;
//         }
//         return null;
//     }
// }

// Time Complexity: O(m + n)
// Space Complexity: O(m)

// Where:
// m = Number of nodes in List A
// n = Number of nodes in List B

// We store all nodes of List A in a HashSet and traverse List B
// to find the first common node. The HashSet requires O(m)
// additional space in the worst case.

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode currA = headA;
        ListNode currB = headB;

        while (currA != currB) {

            currA = (currA == null) ? headB : currA.next;
            currB = (currB == null) ? headA : currB.next;
        }

        return currA;
    }
}