/**
 * @ProjectName: 智能建筑
 * @Copyright: 2012 HangZhou Hikvision System Technology Co., Ltd. All Right Reserved.
 * @address: http://www.hikvision.com
 * @date: 2017/2/9 14:19
 * @Description: 本内容仅限于杭州海康威视数字技术系统公司内部使用，禁止转发.
 */
package problem2;

/**
 * <p></p>
 * @author kangyabo 2017/2/9 14:19
 * @version V1.0
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2017/2/9
 * @modify by reason:{方法名}:{原因}
 */

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 */

public class Solution2 {

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
