/**
 * author: kangyabo
 * time:17/2/8 00:01
 */
package problem2;

/**
 * Created by wochen on 17/2/8.
 */

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 */
public class solution2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp = new ListNode(0);
        ListNode result = tmp;
        int add = 0;
        int v1 = l1.val;
        int v2 = l2.val;
        while (l1 != null || l2 != null || add != 0) {
            v1 = l1 == null ? 0 : l1.val;
            v2 = l2 == null ? 0 : l2.val;
            tmp.val = v1 + v2 + add;
            add = 0;
            if (tmp.val > 9) {
                add = tmp.val / 10;
                tmp.val = tmp.val % 10;
            }
            if (l1 != null && l1.next != null) {
                l1 = l1.next;
            } else {
                l1 = null;
            }
            if (l2 != null && l2.next != null) {
                l2 = l2.next;
            } else {
                l2 = null;
            }
            if (l1 != null || l2 != null || add != 0) {
                tmp.next = new ListNode(0);
                tmp = tmp.next;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        ListNode lx = addTwoNumbers(l1, l2);
        do {
            System.out.print(lx.val);
            System.out.print("-->");
            lx = lx.next;
        } while (lx != null);
    }
}
