import java.util.Scanner;

/**
 * @author cc_ff
 * @creat 2021-03-2021/3/20-16:10
 */
public class test {
    public static void main(String[] args) {
        Maze maze = new Maze();
        int[][] m; //{{0,0,0},{1,1,0},{0,0,0},{0,1,1},{0,0,0}};
        Scanner sc = new Scanner(System.in);

        //总的字符串
        String str = null;
        if (sc.hasNext()) {
            str = sc.next();
        }

        //strings存每行元素
        String[] strings = str.split(";");
        int row = strings.length;
        //col是列的数目
        int col = strings[0].split(",").length;


        m = new int[row][col];

        //给m数组赋值
        for (int i = 0; i < m.length - 1; i++) {

            String s = strings[i];

            //j是s数组的大小,k是列元素的个数
            for (int j = 0, k = 0; j < s.length(); j++) {
                char[] chars = s.toCharArray();
                if (chars[j] != ',') {

                    //char字符转int;
                    m[i][k] = chars[j] - '0';
                    k++;
                }
            }


        }


        System.out.println(maze.shortPath(m));

    }

}
