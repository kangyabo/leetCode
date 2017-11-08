/**
 * @ProjectName: 智能建筑
 * @Copyright: 2012 HangZhou Hikvision System Technology Co., Ltd. All Right Reserved.
 * @address: http://www.hikvision.com
 * @date: 2017/11/8 14:45
 * @Description: 本内容仅限于杭州海康威视数字技术系统公司内部使用，禁止转发.
 */
package p20_Valid_Parentheses;

import java.util.Stack;

/**
 * <p></p>
 * @author kangyabo 2017/11/8 14:45
 * @version V1.0
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2017/11/8
 * @modify by reason:{方法名}:{原因}
 */
public class Solution20 {
    public static boolean isValid(String s) {
        Stack<Character> cStack = new Stack<Character>();
        if (s.length() == 0) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        String left = "({[";
        String right = ")}]";
        char c;
        char match;
        for (int i = 0 ; i < s.length() ; i ++) {
            c = s.charAt(i);
            if (left.contains(String.valueOf(c))) {
                cStack.push(c);
            } else if (right.contains(String.valueOf(c)) && cStack.size() != 0){
                match = cStack.pop();
                if (left.charAt(right.indexOf(c)) != match) {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (cStack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.print(isValid("(("));
    }
}
