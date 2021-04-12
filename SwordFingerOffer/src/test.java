import CQueue.CQueue_Solution;
import buildTree.TreeNode;
import buildTree.buildTreeSolution;
import cuttingRope.cuttingRopeSolution;
import fib.fibSolution;
import hammingWeight.hammingWeightSolution;
import hasPath.hasPathSolution;
import minArray.minArraySolution;
import movingCount.movingCountSolution;
import myPow.myPowSolution;
import org.junit.Test;
import reversePrint.ListNode;
import reversePrint.reversePrintSolution;

/**
 * @author cc_ff
 * @creat 2021-03-2021/3/2-15:46
 */

public class test {
    @Test
    public void test_reversePrint(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        node1.setNext(node2);
        node2.setNext(node3);
        reversePrintSolution rp = new reversePrintSolution();
        //int[] ints = rp.reversePrint_Recursively(node1);
        int[] ints = rp.reversePrint_Stack(node1);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    //前中建立二叉树
    @Test
    public void test_buildTree(){
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        buildTreeSolution buildTreeSolution = new buildTreeSolution();
        TreeNode treeNode = buildTreeSolution.buildTree_Recursive(preorder, inorder);
        prePrint(treeNode);


    }

    //双栈创建队列
    @Test
    public void test_CQueue(){
        CQueue_Solution cQueue_solution = new CQueue_Solution();
        cQueue_solution.appendTail(1);
        cQueue_solution.appendTail(2);
        System.out.println(cQueue_solution.deleteHead());
        System.out.println(cQueue_solution.deleteHead());
        System.out.println(cQueue_solution.deleteHead());
    }


    //斐波那契数列
    @Test
    public void test_fib(){
        fibSolution fibSolution = new fibSolution();
        System.out.println(fibSolution.fib_cycle(48));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(fibSolution.fib_DynamicProgramming(0));
    }

    //反转数组中最小值
    @Test
    public void test_minArray(){
        minArraySolution minArraySolution = new minArraySolution();
        int[] ints = {0,0,1,1,2,0};
        System.out.println(minArraySolution.minArray(ints));
        System.out.println(minArraySolution.minArray_Math(ints));
    }

    //矩阵中的路径
    @Test
    public void test_hasPath(){
        hasPathSolution hasPathSolution = new hasPathSolution();
        char[][] board = new char [1][2];
        board[0][0] = 'a';
        board[0][1] = 'b';
        String word = "ba";
        System.out.println(hasPathSolution.exist(board,word));
        System.out.println(hasPathSolution.exist_Math(board,word));
    }

    @Test
    public void test_MovingCount(){
        movingCountSolution movingCountSolution = new movingCountSolution();
        System.out.println(movingCountSolution.movingCount(41,29,16));
        System.out.println(movingCountSolution.movingCount_DFS(41,29,16));
        System.out.println(movingCountSolution.movingCount_BFS(41,29,16));
    }

    //减绳子\分解整数
    @Test
    public void test_CuttingRope(){
        cuttingRopeSolution crs = new cuttingRopeSolution();
        System.out.println(crs.cuttingRope_DP(10));
        System.out.println(crs.cuttingPope_TanXin(998));
    }


    //找出二进制数中的1
    @Test
    public void test_HammingWeight(){
        hammingWeightSolution hwS = new hammingWeightSolution();
        System.out.println(hwS.hammingWeight_Math(00000000000000000000000000001011));
    }


    //Pow函数
    @Test
    public void test_myPow(){
        myPowSolution solution = new myPowSolution();
        System.out.println(solution.myPow(2.00000,4));

    }


    //二叉树前序遍历
    private void prePrint(TreeNode node){
        if(node != null){
            System.out.println(node.getVal());
            prePrint(node.getLeft());
            prePrint(node.getRight());
        }
    }
}
