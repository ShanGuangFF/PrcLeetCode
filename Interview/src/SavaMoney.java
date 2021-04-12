import org.junit.Test;

/**小王每天都开始存钱,第一周周一,存1元,从周二到周日,每天都比前一天多存入1元钱
 * 然后,接下来每个周一,都会比前一个周一多存一元钱
 * 请问第N天,小王的账户里有多少钱
 * @author cc_ff
 * @creat 2021-04-2021/4/12-16:54
 */
public class SavaMoney {


    public int sava(int n){
        int sumMoney = 0;
        int week = n / 7;
        int day = n % 7;
        int[] weekMoney = new int[]{0,1,2,3,4,5,6};

        for (int i = 1; i <= week; i++) {
            sumMoney += i*7 + 21;
        }

        //新的一周
        week++;

        for (int i = 0; i < day; i++) {
            sumMoney += week + weekMoney[i];
        }

        return sumMoney;
    }

    @Test
    public void test(){


        int day = 1000;
        for (int i = 1; i <= day; i++) {
            System.out.print((sava(i)) + " ");
            if (i % 7 == 0) {
                System.out.println();
            }
        }
    }

}
