import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author cc_ff
 * @creat 2021-03-2021/3/18-20:34
 */
public class IntegerSort {

    private static int[] target;
    private static int[] temp;
    private static int res;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        res = sc.nextInt();
        temp = new int[res + 1];
        target = new  int[res + 1];
        int[] times = new int[res + 1];
        for (int i = 0; i < temp.length - 1; i++) {
            target[i] = sc.nextInt();
        }
        temp[0] = 1;
        for (int i = 0; i < times.length - 1; i++) {
            dfs(0,0,i);
            times[i] = res;
            res = target[i];
        }

        for (int i = 0; i < times.length - 1; i++) {
            System.out.println(times[i]);
        }
    }

    public static void dfs(int step, int index,int i){

        if(total() >=target[i]){
            res = step < res ? step : res;
            return;
        }

        //当前末尾元素+1
        temp[index]++;
        dfs(step+1,index,i);

        //返回
        temp[index]--;

        //向右复制末尾元素
        temp[index+1] = temp[index];
        dfs(step+1, index+1,i);

        //返回
        temp[index+1] = 0;
    }


    private static int total() {
        int total = 0;
        for (int i : temp) {
            total += i;
        }
        return total;
    }
}
