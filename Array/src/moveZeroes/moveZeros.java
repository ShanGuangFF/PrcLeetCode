package moveZeroes;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/9-23:50
 */
public class moveZeros {
    public int [] moveZeros(int[] nums){
        int size = 0;
        for (int i = 0;i < nums.length ;i++){
            if (nums.length<=1){
                return nums;
            }else if (nums[i] !=0 && i == size){
                nums [size++] = nums[i];
            }else if(nums[i] != 0 ){
                nums[size++] = nums[i];
                nums[i] = 0;
            }
        }
        return nums;
    }
}
