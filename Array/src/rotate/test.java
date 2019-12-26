package rotate;

import org.junit.Test;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/26-20:03
 */
public class test {
    @Test
    public void test(){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{5, 1, 9,11}, {2, 4, 8,10}, {13, 3, 6, 7}, {15,14,12,16}};
        Solution solution = new Solution();
        int[][] rotate = solution.rotate(matrix2);
        for (int[] ints : rotate) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
    }
}
