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

    // good example of java references concept
    //here initially list3 and node3 points to the same node
    //next we assign node.next to whichever node from list1 or list2 is smaller. in memory this means, the node that list3 and node3 were pointing initially is now pointing to a first smaller value node. and like wise after loopwe assign rest of nodes from list1 or list2  to list3, this way every node from two lists is now chained in list3 in sorted order. therefore when we return list.next we omit the first empty node and return head of the merged list.
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode list3 = new ListNode(); //empty node
        ListNode node3 = list3; //empty node

       //list3 starts with a empty node that's why we return list3.next
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