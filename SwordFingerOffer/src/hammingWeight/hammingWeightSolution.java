package hammingWeight;

/**
 * @author cc_ff
 * @creat 2021-03-2021/3/12-19:35
 * 请实现一个函数，输入一个整数（以二进制串形式），输出该数二进制表示中 1 的个数。例如，把 9
 * 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。
 *
 */
public class hammingWeightSolution {
    public int hammingWeight(int n){
        int count = 0;
        while( n != 0){
            count += n&1;
            n >>= 1;
        }
        return count;
    }

    //n&n-1消除n最右边的1
    // n:1100 n-1:1011 (n&n-1) = 1000
    public int hammingWeight_Math(int n){
        int count = 0;
        while (n != 0){
            count++;
            n &= n-1;
        }


        return count;
    }
}
