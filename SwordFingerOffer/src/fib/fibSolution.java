package fib;

/**
 * 斐波那契数列
 * @author cc_ff
 * @creat 2021-03-2021/3/8-17:27
 */
public class fibSolution {
    public int fib_cycle(int n) {
        int[] result = {0,1};
        if(n < 2){
            return result[n];
        }
        int fibNumOne = 0;
        int fibNumTwo = 1;
        int fib = 0;
        for(int i = 2;i <= n;++i){
            fib = (fibNumOne + fibNumTwo)%1000000007;
            fibNumOne = fibNumTwo;
            fibNumTwo = fib;
        }

        return fib;
    }

    public int fib_recursive(int n){
        if (n <= 0)
            return 0;
        if (n <= 1)
            return 1;
        return (fib_recursive(n - 1)%1000000007)+(fib_recursive(n - 2)%1000000007);
    }

    //动态规划
    public int fib_DynamicProgramming(int n){
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 0;i < n;i++){
            sum = (a + b)%1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
