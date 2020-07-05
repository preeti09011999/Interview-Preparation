/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int data = (l1.val+l2.val)%10;
        ListNode res = new ListNode(data);
        int oc = (l1.val + l2.val)/10;
        
        addTwoNumbersHelper(l1.next,l2.next,res,oc);
        return res;
    }
    
    public static void addTwoNumbersHelper(ListNode l11, ListNode l22, ListNode res,int oc){
        if(l11 == null && l22 == null){
            if(oc > 0){
            
            res.next = new ListNode(oc);
        }
            return;
        }

        if(l11 == null && l22 != null){
            int data = l22.val + oc;
            res.next = new ListNode(data%10);
            addTwoNumbersHelper(l11,l22.next,res.next,data/10);
        }else if(l22 == null && l11 != null){
            int data = l11.val + oc;
            res.next = new ListNode(data%10);
            addTwoNumbersHelper(l11.next,l22,res.next,data/10);
        }else{
            int data = l11.val + l22.val + oc;
            res.next = new ListNode(data%10);
            addTwoNumbersHelper(l11.next,l22.next,res.next,data/10);
        }
    }
}