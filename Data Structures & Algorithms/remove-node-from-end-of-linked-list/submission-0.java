class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Step 1: Find length
        int length = 0;
        ListNode curr = head;

        while (curr != null) {
            length++;
            curr = curr.next;
        }

        // Agar head hi remove karna hai
        if (n == length) {
            return head.next;
        }

        // Step 2: Previous node tak jao
        curr = head;

        for (int i = 0; i < length - n - 1; i++) {
            curr = curr.next;
        }

        // Step 3: Node remove karo
        curr.next = curr.next.next;

        return head;
    }
}
