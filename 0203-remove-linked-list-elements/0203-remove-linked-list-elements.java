class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pHead = new ListNode(0);
        pHead.next = head;

        ListNode curr = head;
        ListNode prev = pHead;

        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return pHead.next;
    }
}

// Time Complexity: O(n) - Traverses the linked list once.
// Space Complexity: O(1) - Uses only a constant amount of extra space.
