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
        List<Integer> m = new ArrayList<>();
        while(list1 != null && list2 != null) {
            m.add(list1.val);
            m.add(list2.val);
            list1 = list1.next;
            list2 = list2.next;
        }
        while(list2 != null) {
            m.add(list2.val);
            list2 = list2.next;
        }
        while(list1 != null) {
            m.add(list1.val);
            list1 = list1.next;
        }
        Collections.sort(m);
        ListNode node1 = null;
        ListNode node = null;
        for(int i = 0; i < m.size(); i++) {
            Integer val = m.get(i);
            if(node1 == null) {
                node1 =new ListNode();
                node = node1;
            }
            node.val = val;
            if(i  != m.size() - 1) {
                node.next = new ListNode();   
                node = node.next;
            }
        }
        return node1;
    }
}