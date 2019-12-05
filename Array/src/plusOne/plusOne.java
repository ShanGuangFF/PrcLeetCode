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
            //10以下的数进行对10取余还是本身，为0代表有进位
            digits[i] = digits[i]%10;
            //如果不为0那说明没有进位，不循环向上一位进行加一
            if(digits[i]!=0){
                return digits;
            }

        }
        digits = new int [digits.length+1];
        digits[0] = 1;
        return digits;
    }
}
