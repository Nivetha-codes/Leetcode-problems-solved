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
    public ListNode mergeKLists(ListNode[] lists) {


        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a,b) -> Integer.compare(b,a)
        );

        for(ListNode head : lists){

            ListNode current = head;
            while(current != null){
                maxHeap.add(current.val);
                current = current.next;
            }

        }

        ListNode current = null;
        ListNode prev = current;
        while(maxHeap.size() > 0){
            int val = maxHeap.poll();
            current = new ListNode(val,prev);
            prev = current;
        }

        return current;

        
    }
}