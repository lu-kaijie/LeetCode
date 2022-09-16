package com.linked.NO203;

/**
 * Created with IntelliJ IDEA.
 * Author: lukaijie
 * Date: 2022/8/7
 * Time: 20:33
 * Description:
 */
public class No203 {

    public static void main(String[] args) {
        Solution solution=new Solution();
        int val=1;
        ListNode head=new ListNode(1,new ListNode(2,new ListNode(1,
                new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(1)))))));
        System.out.println(solution.removeElements(head,val));
    }

}
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }

        ListNode dummy =new ListNode(-1,head);
        ListNode pre=dummy;
        ListNode cur=head;
        while(cur!=null){
            if(cur.val==val){
                pre.next=cur.next;
            }else{
                pre=cur;
            }
            cur=cur.next;
        }
        return dummy.next;
    }

}
class ListNode {
    int val;
    ListNode next=null;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}
