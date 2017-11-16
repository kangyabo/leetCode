/**
 * @ProjectName: 智能建筑
 * @Copyright: 2012 HangZhou Hikvision System Technology Co., Ltd. All Right Reserved.
 * @address: http://www.hikvision.com
 * @date: 2017/11/16 20:57
 * @Description: 本内容仅限于杭州海康威视数字技术系统公司内部使用，禁止转发.
 */
package p38_Count_and_Say;

/**
 * <p></p>
 * @author kangyabo 2017/11/16 20:57
 * @version V1.0
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2017/11/16
 * @modify by reason:{方法名}:{原因}
 */
public class Solution38 {
     public String countAndSay(int n) {
         if (n == 1) {
             return "1";
         }
         String ex = countAndSay(n - 1);
         StringBuffer result = new StringBuffer();
         char temp = ex.charAt(0);
         int times = 0;
         for (int i  = 0 ; i < ex.length() ; i ++) {
             if (ex.charAt(i) == temp) {
                 times ++;
             } else {
                 result.append(times).append(temp);
                 times = 1 ;
                 temp = ex.charAt(i);
             }
         }
         result.append(times).append(temp);
         return result.toString();
    }
}
