class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode result = new ListNode(0);
        ListNode current = result;
        boolean jinwei = false;

        while(l1 != null || l2 !=null || jinwei){
            int digitResult = 0;

            if(l1 != null){
                digitResult += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                digitResult += l2.val;
                l2 = l2.next;
            }

            if(jinwei){
                digitResult += 1;
            }

            if(digitResult >= 10){
                digitResult -= 10;
                jinwei = true;
            } else{
                jinwei = false;
            }

            current.val = digitResult;

            if(!(l1 == null && l2== null && !(jinwei))){
                current.next = new ListNode(0);
                current = current.next;
            }
        }

        return result;
    }
}