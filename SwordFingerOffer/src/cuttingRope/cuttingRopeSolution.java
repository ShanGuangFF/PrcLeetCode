package cuttingRope;

/**
 * 减绳子
 * @author cc_ff
 * @creat 2021-03-2021/3/10-21:26
 */


public class cuttingRopeSolution {
    public int cuttingRope_DP(int n) {
        int[] dp = new int[n+1];
        dp[2] = 1;
        for(int i = 3;i <= n;i++){

            for(int j = 2;j < i;j++){
                dp[i] = Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));
            }


        }

        return dp[n];
    }

    public int cuttingPope_TanXin(int n){
        if(n <= 3)
            return n-1;
        int a = n / 3;
        int b = n % 3;
        if (b == 1)
            return (int)Math.pow(3,a-1)*4;
        if (b == 2)
            return (int) Math.pow(3,a)*2;
        return (int)Math.pow(3,a);
    }


}
