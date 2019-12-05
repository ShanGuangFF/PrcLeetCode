package plusOne;

import java.util.ArrayList;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/5-23:33
 */
public class test {
    public static void main(String[] args) {

        plusOne plusOne = new plusOne();
        int [] digits = {9,9,9,9,9,9};
        int[] ints = plusOne.plusOne(digits);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }
}
