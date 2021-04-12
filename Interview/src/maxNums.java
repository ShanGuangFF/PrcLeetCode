import org.junit.Test;

/**
 * @author cc_ff
 * @creat 2021-03-2021/3/20-21:06
 */
public class maxNums {
    public int majorityElement(int[] nums) {
        int tem=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(count==0)
            {
                tem=nums[i];
                count=1;
            }
            else if(tem==nums[i])
            {
                count++;
            }
            else {
                count--;
            }
        }
        return tem;
    }


    public void test(){
       // int[] nums = {2,5,5,5,5,7};
       // System.out.println(majorityElement(nums));

    }
}
