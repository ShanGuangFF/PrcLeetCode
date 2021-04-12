package hasPath;

/**
 * @author cc_ff
 * @creat 2021-03-2021/3/9-18:53
 */
public class hasPathSolution {
    //回溯剪枝
    public boolean exist(char[][] board, String word) {

        char[] words = word.toCharArray();
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visted = new boolean[rows][cols];//访问数组
        int pathLength = 0;

        for(int i = 0; i < rows;i++){
            for(int j = 0; j < cols;j++){
                if(dfs(board,i,rows,j,cols,words,pathLength,visted))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board,int row,int rows,int col,int cols,char[] words,int pathLength,boolean[][] visted){
        if(pathLength == words.length)
            return true;
        boolean flag = false;
        if(row >= 0 && row < rows && col < cols && col >= 0 && words[pathLength] == board[row][col] && !visted[row][col]){
            visted[row][col] = true;
            flag = dfs(board,row,rows,col+1,cols,words,pathLength+1,visted)//右
                    || dfs(board,row+1,rows,col,cols,words,pathLength+1,visted)//下
                    || dfs(board,row,rows,col-1,cols,words,pathLength+1,visted)//左
                    || dfs(board,row-1,rows,col,cols,words,pathLength+1,visted);//上

            if(!flag){

                visted[row][col] = false;
            }
        }
        return flag;
    }

    public boolean exist_Math(char[][] board,String word){
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(dfs_New(board,words,i,j,0))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs_New(char[][] board, char[] words, int i, int j, int pathLength) {
        if(i > board.length-1 ||  i < 0 || j > board[0].length-1 || j < 0 || board[i][j] != words[pathLength])
            return false;
        if(pathLength == words.length - 1)
            return true;
        board[i][j] = '\0';

        boolean res =   dfs_New(board,words,i,j+1,pathLength+1)
                    ||  dfs_New(board,words,i+1,j,pathLength+1)
                    ||  dfs_New(board,words,i,j-1,pathLength+1)
                    ||  dfs_New(board,words,i-1,j,pathLength+1);
        board[i][j] = words[pathLength];

        return res;
    }
}
