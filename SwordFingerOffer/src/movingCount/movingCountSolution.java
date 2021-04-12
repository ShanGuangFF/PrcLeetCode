package movingCount;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author cc_ff
 * @creat 2021-03-2021/3/10-19:13
 * 机器人运动的范围:地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动,
 * 它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子
 *
 * 数组元素默认值:String和引用类型为 NULL
 *              int,short,byte,long为0
 *              char为空格
 *              boolean为false
 */
public class movingCountSolution {
    int m,n,k;
    boolean[][] visited;
    //m为行,n为列,k为数位之和最大值
    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        this.visited = new boolean[m][n];
        return moving(0,0);
    }

    private int moving(int i,int j){
        int count = 0;
        if(check(i,j)){
            visited[i][j] = true;
            count = 1 + moving(i+1,j)
                    + moving(i-1,j)
                    + moving(i,j+1)
                    + moving(i,j-1);
        }
        return count;
    }

    //递归终止的条件:1.行列索引越界 2.数位之和小于索引 3.已访问
    private boolean check(int i,int j){
        if(i >= 0 && j >=0 && i < m && j< n && !visited[i][j] && digitSum(i) + digitSum(j) <= k)
            return true;
        return false;
    }

    //计算数位之和
    private int digitSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }


    public int movingCount_DFS(int m,int n,int k){
        this.m = m;
        this.n = n;
        this.k = k;
        this.visited = new boolean[m][n];
        return moving_DFS(0,0,0,0);
    }

    /**
     * 递归参数： 当前元素在矩阵中的行列索引 i 和 j ，两者的数位和 si, sj
     * @param i
     * @param j
     * @param si
     * @param sj
     * @return 终止条件： 当 ① 行列索引越界 或 ② 数位和超出目标值 k 或 ③ 当前元素已访问过 时，返回 0 ，代表不计入可达解。
     */
    private int moving_DFS(int i, int j, int si, int sj) {
        if(i >= m || j >= n || k < si + sj || visited[i][j])
            return 0;
        visited[i][j] = true;
        return  1 + moving_DFS(i+1,j,(i + 1) % 10 == 0 ? si - 8 :si+1,sj) + moving_DFS(i,j+1,si,(j + 1) % 10 == 0 ? sj - 8 :sj+1);

    }

    /**
     * BFS/DFS ： 两者目标都是遍历整个矩阵，不同点在于搜索顺序不同。DFS 是朝一个方向走到底，再回退，以此类推；BFS 则是按照“平推”的方式向前搜索。
     * BFS 实现： 通常利用队列实现广度优先遍历。
     */
    public int movingCount_BFS(int m,int n,int k){
        this.m = m;
        this.n = n;
        this.k = k;
        this.visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0,0,0});
        int count = 0;
        while (queue.size() > 0){
            int[] ints = queue.poll();
            int i = ints[0],j = ints[1],si = ints[2],sj = ints[3];
            if(i >= m || j >= n || si + sj > k || visited[i][j])
                continue;
            visited[i][j] = true;
            count++;
            queue.offer(new int[]{i+1,j,(i+1) % 10 != 0 ? si+1 : si - 8,sj});
            queue.offer(new int[]{i,j+1,si,(j+1) % 10 != 0 ? sj+1 : sj-8});
        }
        return count;
    }


}
