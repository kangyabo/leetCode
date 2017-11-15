/**
 * @ProjectName: 智能建筑
 * @Copyright: 2012 HangZhou Hikvision System Technology Co., Ltd. All Right Reserved.
 * @address: http://www.hikvision.com
 * @date: 2017/11/15 21:43
 * @Description: 本内容仅限于杭州海康威视数字技术系统公司内部使用，禁止转发.
 */
package p35_Search_Insert_Position;

/**
 * <p></p>
 * @author kangyabo 2017/11/15 21:43
 * @version V1.0
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2017/11/15
 * @modify by reason:{方法名}:{原因}
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
