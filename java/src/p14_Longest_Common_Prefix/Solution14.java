/**
 * @ProjectName: 智能建筑
 * @Copyright: 2012 HangZhou Hikvision System Technology Co., Ltd. All Right Reserved.
 * @address: http://www.hikvision.com
 * @date: 2017/11/8 14:24
 * @Description: 本内容仅限于杭州海康威视数字技术系统公司内部使用，禁止转发.
 */
package p14_Longest_Common_Prefix;

import java.util.Arrays;

/**
 * <p></p>
 * @author kangyabo 2017/11/8 14:24
 * @version V1.0
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2017/11/8
 * @modify by reason:{方法名}:{原因}
 */
public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        StringBuffer sb = new StringBuffer();
        char index;
        for (int i = 0 ; i < strs[0].length() ; i ++){
            index = strs[0].charAt(i);
            for (int j = 1 ; j < strs.length ; j ++) {
                if (i >= strs[j].length() || index != strs[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(index);
        }
        return  sb.toString();
    }
}
