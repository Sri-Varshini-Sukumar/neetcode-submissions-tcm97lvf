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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> lst = new ArrayList<>();
        ListNode dummy = new ListNode(-1);
        ListNode temp = head;
        ListNode curr = head;

        while(temp != null){
            int value = temp.val;
            lst.add(value);
            temp = temp.next;
        }

        Collections.sort(lst);

        for(int i=0; i<lst.size(); i++){
            int num = lst.get(i);
            curr.val = num;
            curr = curr.next;
        }

        return head;
    }
}