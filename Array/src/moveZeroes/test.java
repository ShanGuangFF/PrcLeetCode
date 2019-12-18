package moveZeroes;

import org.junit.Test;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/9-23:52
 */
public class test {

    @Test
    public void test(){
        int [] nums = {0,1,0,3,12};
        int [] nums1 = {0,0,1};
        int [] nums2 = {1,0};
        int [] nums3 = {2,1};
        moveZeros moveZeros = new moveZeros();
        int[] ints = moveZeros.moveZeros(nums3);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
