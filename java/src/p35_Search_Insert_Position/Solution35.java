/**
 * @ProjectName: ���ܽ���
 * @Copyright: 2012 HangZhou Hikvision System Technology Co., Ltd. All Right Reserved.
 * @address: http://www.hikvision.com
 * @date: 2017/11/15 21:43
 * @Description: �����ݽ����ں��ݺ����������ּ���ϵͳ��˾�ڲ�ʹ�ã���ֹת��.
 */
package p35_Search_Insert_Position;

/**
 * <p></p>
 * @author kangyabo 2017/11/15 21:43
 * @version V1.0
 * @modificationHistory=========================�߼��������ش�����¼
 * @modify by user: {�޸���} 2017/11/15
 * @modify by reason:{������}:{ԭ��}
 */
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
         for (int i = 0 ; i < nums.length ; i ++) {
             if (nums[i] >= target) {
                 return i;
             }
         }
        return nums.length ;
    }
}
