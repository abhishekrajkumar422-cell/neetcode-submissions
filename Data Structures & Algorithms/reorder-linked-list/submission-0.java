
class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next== null ) return;

        // Find Middle
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }

        // Reverse
        ListNode curr = slow.next;
        slow.next = null; // cut the list
        ListNode prev = null;
        ListNode next = null;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
        } 

        // merg it
        ListNode left = head;
        ListNode right = prev;

        while(right != null){
            ListNode lNext = left.next;
            ListNode rNext = right.next;

            left.next = right;
            right.next = lNext;

            left = lNext;
            right = rNext;

        }


    }
}
