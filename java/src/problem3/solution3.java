package problem3;

import java.util.HashMap;
import java.util.Map;


public class Solution {
    public static int lengthOfLongestSubstring(String s) {
       char[] sc = s.toCharArray();
       Map<Integer,Integer> sizeMap = new HashMap<Integer,Integer>();
       StringBuffer temp;
       for (int i = 0 ; i < sc.length ; i ++) {
           for (int j = i ; j < sc.length ; j ++ ) {
               if (temp.indexOf("" + sc[j] + "") != -1) {
                   temp.append(sc[j]);
               } else {
                   sizeMap.put(i, j - i);
                   break;
               }
           }
       }
       int size = 0;
       for (int i = 0 ; i < sc.length ; i ++) {
           if (sizeMap.get(i) > size) {
               size = sizeMap.get(i);
           }
       }
       return size;
    }

    public static void main(String[] args) {
        String s = "abcabcd";
        System.out.print(lengthOfLongestSubstring(s));
    }
}   