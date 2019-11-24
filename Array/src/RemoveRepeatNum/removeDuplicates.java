package RemoveRepeatNum;

/**
 * @author cc_ff
 * @create 2019-11-19 下午11:02
 * @action123
 */
public class removeDuplicates {
    public int solution(int [] nums){
        //使用双指针
        if( nums == null || nums.length == 1){
            return nums.length;
        }
        int i = 0 ,j = 1;
        while(j < nums.length){
            if(nums[i] == nums [j]){
                ++j;
            }else{
                ++i;
                nums[i] = nums [j];
                ++j;
            }
        }
        return i + 1;
    }
}
