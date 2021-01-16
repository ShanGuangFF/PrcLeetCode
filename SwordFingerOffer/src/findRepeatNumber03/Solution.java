package findRepeatNumber03;


import org.junit.Test;

import java.util.Arrays;

/**
 * @author cc_ff
 * @creat 2021-01-2021/1/17-1:03
 */
public class Solution {
    //sort
    //Time complexity: O(nlogn)
    //Space complexity: O(1)
    public int findRepeatNumber_sort(int[] nums) {
       //先判断数组是否符合条件
        if (nums == null && nums.length == 0) {
            return -1;
        }
        Arrays.sort(nums);
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev){
                return nums[i];
            }else {
                prev = nums[i];
            }
        }
        return -1;
    }

}
