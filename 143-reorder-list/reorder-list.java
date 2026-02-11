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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null)return;
        ListNode s=head,f=head;
        while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode p=null,c=s;
        while(c!=null){
            ListNode nn=c.next;
            c.next=p;
            p=c;
            c=nn;
        }
        ListNode ft=head,sd=p;
        while(sd.next!=null){
            ListNode t1=ft.next,t2=sd.next;
            ft.next=sd;
            sd.next=t1;
            ft=t1;
            sd=t2;
        }
        
    }
}