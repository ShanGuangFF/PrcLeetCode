package TowSum;

import org.junit.Test;

/**
 * @author cc_ff
 * @create 2019-11-20 下午11:24
 * @action
 */
public class test {
    @Test
    public void test(){
        int nums [] = {0,2,7,8,5};
        int target = 9;
        Solution solution = new Solution();
        int[] ints = solution.twoSum(nums, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
