/**
 * @ProjectName: 智能建筑
 * @Copyright: 2012 HangZhou Hikvision System Technology Co., Ltd. All Right Reserved.
 * @address: http://www.hikvision.com
 * @date: 2017/11/7 20:07
 * @Description: 本内容仅限于杭州海康威视数字技术系统公司内部使用，禁止转发.
 */
package p9_Palindrome_Number;

/**
 * <p></p>
 * @author kangyabo 2017/11/7 20:07
 * @version V1.0
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2017/11/7
 * @modify by reason:{方法名}:{原因}
 */
public class Solution9 {


     public static boolean isPalindrome(int x) {
         String s = String.valueOf(x);
         for (int i = 0 ; i <= s.length() / 2 ; i ++){
             if (s.charAt(i) != s.charAt(s.length() - 1 - i )) {
                 return false;
             }
         }
         return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(321));
    }
}
