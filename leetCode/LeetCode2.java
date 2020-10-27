package leetCode;

public class LeetCode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode temp = result;
        int addition = 0;
        while (t1 != null || t2 != null || addition != 0) {
            if (t1 == null && t2 != null) {
                temp.val = (t2.val + addition) % 10;
                addition = (t2.val + addition) / 10;
                t2 = t2.next;
            }
            else if (t2 == null && t1 != null) {
                temp.val = (t1.val + addition) % 10;
                addition = (t1.val + addition) / 10;
                t1 = t1.next;
            }
            else if (t1 == null && t2 == null){
                temp.val = addition % 10;
                addition = addition / 10;
            }
            else {
                temp.val = (t1.val + t2.val + addition) % 10;
                addition = (t1.val + t2.val + addition) / 10;
                t1 = t1.next;
                t2 = t2.next;
            }

            if (t1 != null || t2 != null || addition != 0) {
                temp.next = new ListNode();
                temp = temp.next;
            }
        }
        return result;
    }
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
