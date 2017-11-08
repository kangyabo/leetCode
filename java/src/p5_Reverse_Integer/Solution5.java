/**
 * @ProjectName: 智能建筑
 * @Copyright: 2012 HangZhou Hikvision System Technology Co., Ltd. All Right Reserved.
 * @address: http://www.hikvision.com
 * @date: 2017/11/7 11:39
 * @Description: 本内容仅限于杭州海康威视数字技术系统公司内部使用，禁止转发.
 */
package p5_Reverse_Integer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p></p>
 * @author kangyabo 2017/11/7 11:39
 * @version V1.0
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2017/11/7
 * @modify by reason:{方法名}:{原因}
 */
public class Solution5 {



    public  static int reverse(int x) {
        if (!validate(x)) {
            return Integer.parseInt(null);
        }
       String numString = String.valueOf(x);
        StringBuffer sb = new StringBuffer();
        for (int i = numString.length() - 1 ; i >= 0 ; i --) {
            if (numString.charAt(i) == '-') {
                if (validate(Integer.valueOf(sb.toString()))) {
                    return Integer.valueOf("-" + sb.toString());
                }
            }
            if (numString.charAt(i) != '0') {
                sb.append(numString.charAt(i));
            }
        }
        if (sb.length() > 0 && validate(Integer.valueOf(sb.toString()))) {
            return Integer.valueOf(sb.toString());
        } else {
            return Integer.parseInt(null);
        }
    }

    private static boolean validate(int x) {
        int t = (int)Math.pow(2.0, 31.0);
        return x <= t && x >= t * -1;
    }

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);

            int ret = reverse(x);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}
