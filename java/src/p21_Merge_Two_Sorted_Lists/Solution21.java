/**
 * @ProjectName: ���ܽ���
 * @Copyright: 2012 HangZhou Hikvision System Technology Co., Ltd. All Right Reserved.
 * @address: http://www.hikvision.com
 * @date: 2017/11/8 16:47
 * @Description: �����ݽ����ں��ݺ����������ּ���ϵͳ��˾�ڲ�ʹ�ã���ֹת��.
 */
package p21_Merge_Two_Sorted_Lists;

import java.security.interfaces.RSAKey;
import java.util.List;

/**
 * <p></p>
 * @author kangyabo 2017/11/8 16:47
 * @version V1.0
 * @modificationHistory=========================�߼��������ش�����¼
 * @modify by user: {�޸���} 2017/11/8
 * @modify by reason:{������}:{ԭ��}
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
