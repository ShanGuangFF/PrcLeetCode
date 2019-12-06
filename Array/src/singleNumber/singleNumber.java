package singleNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/6-23:38
 */
public class singleNumber {
    public int singleNumber(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == nums[i+1] ){
                i++;
            }else {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
