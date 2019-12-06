package ContainsDuplicate;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/6-22:57
 */
public class ContainsDuplicate {
    //1.双重for循环遍历
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0;i < nums.length;i++){
            for (int j = i+1;j < nums.length;j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }


    //利用set自带的元素不能重复属性判断
    public boolean containsDuplicate1(int[] nums){
        Set set = new HashSet();
        for (int i : nums) {
            set.add(i);
        }

        return set.size() == nums.length ? false : true;
    }

    //排序
    public boolean containsDuplicate2(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
