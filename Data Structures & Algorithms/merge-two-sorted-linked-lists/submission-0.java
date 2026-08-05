
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode head = null;
        ListNode curr = null;
        
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                if(curr == null){
                    head = list1;
                    curr = list1;
                }else{
                    curr.next = list1;
                    curr = curr.next;

                }
                list1= list1.next;
            }
            else{
                if(curr == null){
                    head = list2;
                    curr = list2;
                }else{
                    curr.next = list2;
                    curr = curr.next;

                }
                list2= list2.next;
            }
        }
        // attach remaining nodes
        if (list1 != null) curr.next = list1;
        else curr.next = list2;

        return head;
        
    }
}  