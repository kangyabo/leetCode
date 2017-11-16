package p27_Remove_Element;

public class Solution27 {
     public int removeElement(int[] nums, int val) {
        int index = 0;
        int length = nums.length;
        for (int i = 0 ; i < nums.length ; i ++) {
            if (nums[i] != val) {
                nums[index ++] = nums[i];
            } else {
                length --;
            }
        }
        return length;
    }
}
