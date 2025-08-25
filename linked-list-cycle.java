// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//      ListNode j=head;
//      for(int i=0;i<n;i++)   
//      {
//         j=j.next;
//      }
     
//      ListNode r=head;
//      for(int i=0;i<n-3;i++)   
//      {
//         r=r.next;
//      }
//      while(j!=null && j.next!=null){
//      j=j.next;
//      r=r.next;
//      }
//      r.next=j;
//      return head;
//     }
// }

// above passed 19 testcase

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
     ListNode dummy=new ListNode(0);
     ListNode j=dummy;
     dummy.next=head;
     for(int i=0;i<n;i++)   
     {
        j=j.next;
     }
     
     ListNode r=dummy;
     while(j!=null && j.next!=null){
     j=j.next;
     r=r.next;
     }
     r.next=r.next.next;
     return dummy.next;
    }
}