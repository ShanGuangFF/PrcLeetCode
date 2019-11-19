package RemoveRepeatNum;

import RemoveRepeatNum.removeDuplicates;
import org.junit.Test;

/**
 * @author cc_ff
 * @create 2019-11-19 下午11:06
 * @action
 */
public class removeDuplicatesTest {

    @Test
    public void test(){
        int [] nums = {0,0,1,1,2,2,3,4};
        removeDuplicates removeDuplicates = new removeDuplicates();
        int i = removeDuplicates.solution(nums);
        for (int i1 = 0; i1 < i; i1++) {
            System.out.println(nums[i1]);
        }
    }
}
