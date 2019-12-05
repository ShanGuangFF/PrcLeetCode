package plusOne;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/5-23:31
 */
public class plusOne {
    public int[] plusOne(int[] digits){


        for (int i = digits.length-1; i >= 0; i--) {

            //数字从末尾开始加一
            digits[i]++;
            digits[i] = digits[i]%10;

        }
        return digits;
    }
}
