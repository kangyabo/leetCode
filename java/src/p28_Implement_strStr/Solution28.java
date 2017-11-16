package p28_Implement_strStr;

public class Solution28 {
     public static int strStr(String haystack, String needle) {
         if (haystack.length() < needle.length()) {
             return -1;
         }
         if (haystack.length() == needle.length() && needle.length() == 0)
             return 0;
         boolean isRight;
         for (int i = 0 ; i < haystack.length() ; i ++) {
             isRight = true;
             for (int j = 0 ; j < needle.length() ; j ++) {
                 if (i + j >= haystack.length() || haystack.charAt(i + j) != needle.charAt(j)) {
                     isRight = false;
                     break;
                 }
             }
             if (isRight) {
                 return i;
             }
       }
       return -1;
    }

    public static void main(String[] args) {
         System.out.print(strStr("mississippi"
,"issipi"));
    }
}
