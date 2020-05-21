package IntegerInversion;

/**
 * @author cc_ff
 * @creat 2020-05-2020/5/21-18:06
 */
public class Solution {
    public int reverse(int x){
        int pop = 0;//最后一位数
        int rev = 0;
        int temp = 0;
        while (x != 0){
            pop = x % 10;
            x /= 10;
            if (rev > 214748364 || rev == 214748364 && pop > 7)
                return 0;
            if (rev <-214748364 || rev == -214748364 && pop < -8)
                return 0;
            temp = rev;
            rev = temp*10 + pop;

        }
        return rev;
    }
}
