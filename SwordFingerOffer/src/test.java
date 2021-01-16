import findRepeatNumber03.Solution;
import org.junit.Test;

/**
 * @author cc_ff
 * @creat 2021-01-2021/1/17-1:36
 */
public class test {
    Solution solution = new Solution();
    @Test
    public void test(){
        int []nums = new int []{3,1,0,2,3};
        int i = solution.findRepeatNumber_sort(nums);
        System.out.println(i);
    }
}
