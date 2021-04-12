package TowSum;

/**
 * @author cc_ff
 * @create 2019-11-20 下午11:19
 * @action
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        int i = 0 ,j = 1;
        while(i < nums.length){
            if(nums[i] + nums[j] == target){

                result[0] = i + 1;
                result[1] = j + 1;

                return result;
            }else if(j == nums.length - 1){

                ++i;
                j = i+1;

            }else {
                ++j;
            }
        }

        return result;
    }


    /**
     *
     * @param
     * @return
     */
    public static int[] solution(int[] nums){
        int[] result = new int[nums.length];

              int sum = 1;
              for (int num : nums) {
                  sum *= num;
              }

              for (int i = 0; i < nums.length; i++) {
                  result[i] = sum / nums[i];
              }

              return result;
    }
}
