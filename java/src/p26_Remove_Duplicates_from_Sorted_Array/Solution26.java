package p26_Remove_Duplicates_from_Sorted_Array;

import java.util.ArrayList;
import java.util.List;

public class Solution26 {
     public static int removeDuplicates(int[] nums) {
         int length = nums.length;
         int move = 0 ;
         for (int i = 0 ; i < nums.length ; i ++) {
             if (i != 0) {
                 nums[i - move] = nums[i];
                 if (nums[i - move] == nums[i - move - 1]) {
                     move ++;
                     length --;
                 }
             }
         }
         return length;
    }

    public static void main(String[] args) {
         System.out.print(removeDuplicates(new int[]{1,1,2}));
    }
}
