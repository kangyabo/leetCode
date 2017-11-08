/**
 * @ProjectName: ���ܽ���
 * @Copyright: 2012 HangZhou Hikvision System Technology Co., Ltd. All Right Reserved.
 * @address: http://www.hikvision.com
 * @date: 2017/11/7 20:07
 * @Description: �����ݽ����ں��ݺ����������ּ���ϵͳ��˾�ڲ�ʹ�ã���ֹת��.
 */
package p9_Palindrome_Number;

/**
 * <p></p>
 * @author kangyabo 2017/11/7 20:07
 * @version V1.0
 * @modificationHistory=========================�߼��������ش�����¼
 * @modify by user: {�޸���} 2017/11/7
 * @modify by reason:{������}:{ԭ��}
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
