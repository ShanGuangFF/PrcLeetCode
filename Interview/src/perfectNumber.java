import org.junit.Test;

/**
 *
 * 小明有10000元,1岁取6块,每10年取一次,每次取得数必须时完美数
 * @author cc_ff
 * @creat 2021-04-2021/4/6-22:51
 */
public class perfectNumber {



    public void drawMoney(){
        int sumMoney = 10000;//总数10000
        int money = 6;//取钱数
        int age = 1;//几岁
        int saveMoney = money;//取了多少钱
        sumMoney -= money;//一岁取6块

        for (int i = money+1; sumMoney > money && i < sumMoney ; i++) {

            if (isPerfectNumber(i)){
                money = i;
                saveMoney += money;
                sumMoney -= money;
                age += 10;
                System.out.println(age+"\t"+sumMoney+"\t"+money);
            }
        }
        System.out.println(age+"\t"+sumMoney+"\t"+saveMoney);
    }


    private boolean isPerfectNumber(int num) {
        int sum = 1;
        for (int i = 2; i < num; i++) {

            if (num % i == 0){
                sum += i;
            }

        }

        if(sum == num)
            return true;

        return false;
    }

    @Test
    public void test(){
        drawMoney();
    }
}
