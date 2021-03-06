/**
 * @author KiyonamiYu
 * @date 2019/4/20 13:47
 * 7min
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode dummyHead = new ListNode(0);
        ListNode prev = dummyHead;

        ListNode cur = head;
        while(cur != null) {
            while(prev.next != null && prev.next.val < cur.val) {
                prev = prev.next;
            }

            ListNode next = cur.next;
            cur.next = prev.next;
            prev.next = cur;

            prev = dummyHead;
            cur = next;
        }
        return dummyHead.next;
    }
}
