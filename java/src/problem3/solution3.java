/**
 * @ProjectName: ���ܽ���
 * @Copyright: 2012 HangZhou Hikvision System Technology Co., Ltd. All Right Reserved.
 * @address: http://www.hikvision.com
 * @date: 2017/2/9 14:19
 * @Description: �����ݽ����ں��ݺ����������ּ���ϵͳ��˾�ڲ�ʹ�ã���ֹת��.
 */
package problem3;

import java.util.HashMap;
import java.util.Map;

/**
 * <p></p>
 * @author kangyabo 2017/2/9 14:19
 * @version V1.0
 * @modificationHistory=========================�߼��������ش�����¼
 * @modify by user: {�޸���} 2017/2/9
 * @modify by reason:{������}:{ԭ��}
 */

/**
 *Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
  */
public class solution3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        for (int i = 0 , j = 0 ; i < s.length() ; i ++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
        map.put(s.charAt(i), i);
        max = Math.max(max,i - j + 1);
        }
        return max;
    }
}
