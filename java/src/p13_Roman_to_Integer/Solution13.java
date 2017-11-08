/**
 * @ProjectName: 智能建筑
 * @Copyright: 2012 HangZhou Hikvision System Technology Co., Ltd. All Right Reserved.
 * @address: http://www.hikvision.com
 * @date: 2017/11/8 11:17
 * @Description: 本内容仅限于杭州海康威视数字技术系统公司内部使用，禁止转发.
 */
package p13_Roman_to_Integer;

import java.util.HashMap;
import java.util.Map;

/**
 * <p></p>
 * @author kangyabo 2017/11/8 11:17
 * @version V1.0
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2017/11/8
 * @modify by reason:{方法名}:{原因}
 */
public class Solution13 {

    public static int romanToInt(String s) {
        final Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result = 0 ;
        int index = 0;
        int right;
        for (int i = 0 ; i <= s.length() - 1 ; i ++) {
            if (index == 0) {
                index = romanMap.get(s.charAt(i));
            }
            if (i == s.length() - 1 ) {
                result = result + index;
            } else {
                right = romanMap.get(s.charAt(i + 1));
                if (index > right) {
                    result = result + index;
                    index = right;
                } else if(index < right)  {
                    result = result - index + right;
                    i ++;
                    index = 0;
                } else {
                    result = result + index + right;
                    i ++;
                    index =  0;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print(romanToInt("MCMXCVI"));
    }

}
