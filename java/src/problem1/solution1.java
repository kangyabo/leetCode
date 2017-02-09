/**
 * author: kangyabo
 * time:17/2/8 00:28
 */
package problem1;

/**
 * Created by wochen on 17/2/8.
 */

import java.util.HashMap;
import java.util.Map;

/**
 Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        Integer temp;
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            temp = target - nums[i];
            if (numMap.containsKey(temp) && numMap.get(temp) != i) {
                return new int[]{i, numMap.get(temp)};
            }
        }
        return new int[2];
    }
}
