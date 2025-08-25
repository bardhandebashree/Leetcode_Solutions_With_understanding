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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int rem=0;
        while(l1!=null || l2!=null)
        {
            int l1Val=(l1==null)?0:l1.val;
            int l2Val=(l2==null)?0:l2.val;
            int sum=l1Val+l2Val+rem;
                rem=sum/10;
                sum=sum%10;   

            ListNode nn=new ListNode(sum);
            curr.next=nn;
            curr=curr.next;
            
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        if(rem>0){
            ListNode nn=new ListNode(rem);
            curr.next=nn;
            curr=curr.next;
        }
        
        return dummy.next;
    }
}