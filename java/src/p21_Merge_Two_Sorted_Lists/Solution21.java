/**
 * @ProjectName: 智能建筑
 * @Copyright: 2012 HangZhou Hikvision System Technology Co., Ltd. All Right Reserved.
 * @address: http://www.hikvision.com
 * @date: 2017/11/8 16:47
 * @Description: 本内容仅限于杭州海康威视数字技术系统公司内部使用，禁止转发.
 */
package p21_Merge_Two_Sorted_Lists;

import java.security.interfaces.RSAKey;
import java.util.List;

/**
 * <p></p>
 * @author kangyabo 2017/11/8 16:47
 * @version V1.0
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2017/11/8
 * @modify by reason:{方法名}:{原因}
 */
public class Solution21 {

     public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         ListNode result  ;
         if (l1 == null && l2 == null) {
             return null;
         }
         if (l1 == null) {
             return l2;
         }
         if (l2 == null) {
             return l1;
         }
         if (l1.val >= l2.val) {
             result = l2;
             l2 = l2.next;
         } else {
             result = l1;
             l1 = l1.next;
         }
         ListNode temp = result;
         while (l1 != null || l2 != null) {
             if (l1 == null) {
                 result.next = l2;
                 break;
             }
             if (l2 == null) {
                 result.next = l1;
                 break;
             }
             if ( l1.val >= l2.val) {
                    result.next = l2;
                     result = result.next;
                     l2 = l2.next;
             } else if (l2.val > l1.val){
                 result.next = l1;
                 result = result.next;
                 l1 = l1.next;
             }
         }
         return temp;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(3);
        l2.next = l3;
        mergeTwoLists(l1,l2);
    }

}
