package TowSum;

/**
 * @author cc_ff
 * @create 2019-11-20 下午11:19
 * @action
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0 ,j = 1;
        while(i < nums.length){
            if(nums[i] + nums[j] == target){
                return new int[] {i,j};
            }else if(j == nums.length - 1){

                ++i;
                j = i+1;

            }else {
                ++j;
            }
        }
        throw new RuntimeException();
    }
}
