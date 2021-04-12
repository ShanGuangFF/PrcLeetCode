package stringNumber;

/**
 * 以字符串的形式读入两个数字，编写一个函数计算它们的和，以字符串形式返回。
 * （字符串长度不大于100000，保证字符串仅由'0'~'9'这10种字符组成）
 * @author cc_ff
 * @creat 2021-04-2021/4/7-19:18
 */
public class StringNumber {


    public String add(String t,String s){

        //空串或者空直接返回
        if(t == null || "".equals(s)) {
            return s;
        }
        if(s == null || "".equals(s)) {
            return t;
        }

        //双指针
        int sIndex = s.length() - 1;
        int tIndex = t.length() - 1;

        //当前位数字
        int sNum = 0,tNum = 0;
        //进位
        int carry = 0;


        //存放加完的数字
        StringBuilder builder = new StringBuilder();

        //两个都达到最高位停止计算,一个到达最高位则其开始补0
        while(sIndex >= 0 || tIndex >= 0){

            //最高位的下标为0
            sNum = sIndex >= 0 ? s.charAt(sIndex) - '0' : 0;
            tNum = tIndex >= 0 ? t.charAt(tIndex) - '0' : 0;

            int sum = sNum + tNum + carry;
            carry = sum / 10;
            builder.append((sum % 10));

            //低位向高位走
            sIndex--;
            tIndex--;
        }

        //得到的最低位在开头,需要反转
        builder.reverse();

        return builder.toString();
    }

}
