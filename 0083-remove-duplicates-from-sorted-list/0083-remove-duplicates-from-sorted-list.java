class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode temp = head;

        while (temp != null && temp.next != null) {

            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}

// Time Complexity: O(n) - Traverses the linked list once.
// Space Complexity: O(1) - Uses only one extra pointer (temp).