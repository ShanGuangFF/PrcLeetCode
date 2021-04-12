package myPow;

/**
 * @author cc_ff
 * @creat 2021-03-2021/3/12-20:58
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。
 */
public class myPowSolution {
    boolean InvalidInput = false;
    public double myPow(double x, int n) {
        if(x == 0.0 && n < 0){
            InvalidInput = true;
            return 0.0;
        }

        if(x == 1.0)
            return 1;

        double result;
        long b = n;//在执行n = -n时,越界会导致赋值出错
        if(n < 0){
            result = 1.0 / PowerWithUnsignedExponent_DP(x,b);

        }else if(n > 0){
            result = PowerWithUnsignedExponent_DP(x,b);
        }else{

            return 1;
        }

        return result;

    }

    private double PowerWithUnsignedExponent(double x, long n){
        double result = 1.0;
        while(n > 0){
            result *= x;
            n--;
        }

        return result;
    }

    private double PowerWithUnsignedExponent_DP(double x,long n){
        double result = 1.0;

        if(n == 0)
            return 1;
        if(n == 1)
            return x;

        result = PowerWithUnsignedExponent_DP(x,n >> 1);
        result *= result;
        if((n &(0x1)) == 1)
            result *= x;

        return result;
    }
}
