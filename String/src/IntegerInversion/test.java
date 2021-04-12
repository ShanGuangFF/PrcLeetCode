package IntegerInversion;

import org.junit.Test;

import java.util.*;


/**
 * @author cc_ff
 * @creat 2020-05-2020/5/21-18:47
 */

public class test {

    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i : nums2) {
            if(set.contains(i)){
                list.add(i);
            }
        }

        int[] array = list.stream().mapToInt(Integer::valueOf).toArray();
        return  array;
    }

    @Test
    public void test(){
        int[] nums1 = {1,2,3,9,10};
        int[] nums2 = {3,9};

        int[] ints = intersection(nums1, nums2);

        for (int anInt : ints) {
            System.out.println(anInt);
        }


    }
}
