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
        if(list1 == null && list2 == null) return null;
        List<Integer> m = collect(list1, list2);
        ListNode res = new ListNode();
        ListNode temp = res;
        merge(temp, m);
        return res;
    }

    List<Integer> collect(ListNode list1, ListNode list2) {
        List<Integer> m = new ArrayList<>();
        while(list1 != null && list2 != null) {
            m.add(list1.val);
            m.add(list2.val);

            list1 = list1.next;
            list2 = list2.next;
        }
        while(list1 != null) {
            m.add(list1.val);
            list1 = list1.next;
        }
        while(list2 != null) {
            m.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(m);
        return m;
    }

    void merge(ListNode res, List<Integer> m) {
        for(int i = 0; i < m.size(); i++) {
            res.val = m.get(i);
            if(i != m.size() - 1) {
                res.next = new ListNode();
            }
            res = res.next;
        }   
    }

}