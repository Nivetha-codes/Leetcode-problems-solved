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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode list3 = new ListNode(); //empty node
        ListNode node3 = list3; //empty node

       //list3 starts with a empty node
        while(null != list1 &&  null != list2 ){

            if(list1.val < list2.val){
                node3.next = list1;
                list1 = list1.next;
            }else{
                node3.next = list2;
                list2 = list2.next;
            }
            node3 = node3.next;
        }
        
        node3.next = (list1 != null) ? list1 : list2;

        return list3.next;

        
        
    }
}