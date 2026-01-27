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
    private void rev(ListNode start , ListNode end){
        ListNode prev = null;
        ListNode head = start;
        while(prev != end){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 1){
            return head;
        }
        ListNode start = head , end = head;
        int i = k-1;
        while(i-- != 0){
            end = end.next;
            if(end == null) return head;
        }
        ListNode temp  = reverseKGroup(end.next , k);
        rev(start , end);
        start.next = temp;
        return end;
    }
}