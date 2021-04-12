import java.util.LinkedList;
import java.util.Queue;

/**
 * @author cc_ff
 * @creat 2021-03-2021/3/20-15:17
 */
public class Maze {
    public int shortPath(int[][] maze){
        int row = maze.length;
        int col = maze[0].length;

        //访问数组,已访问即为1,未访问置0
        int[][] visited = new int[row][col];

        //最小步数
        int minStep = 0;
        visited[0][0] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0});


        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,-1,1};
        while (!queue.isEmpty()){
            minStep++;
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int rowNew = cur[0] + dx[j];
                    int colNew = cur[1] + dy[j];

                    if(rowNew < 0 || rowNew >= row || colNew < 0 || colNew >= col){
                        continue;
                    }

                    if (maze[rowNew][colNew] == 1){
                        continue;
                    }

                    if (rowNew == row -1 && colNew == col - 1){
                        return minStep;
                    }

                    if (visited[rowNew][colNew] == 1){
                        continue;
                    }else {
                        visited[rowNew][colNew] = 1;
                    }

                    queue.offer(new int[]{rowNew,colNew});
                }
            }
        }

        return -1;
    }


}
