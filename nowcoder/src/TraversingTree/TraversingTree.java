package TraversingTree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author cc_ff
 * @creat 2021-04-2021/4/12-20:51
 */
public class TraversingTree {

    public int[][] Traversing(TreeNode root){
        int[][] res = new int[3][];
        res[0] = preOrder(root);
        res[1] = inOrder(root);
        res[2] = postOrder(root);
        return res;
    }

    private int[] postOrder(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        //后序遍历需要一个标志来判断右子树是否访问过
        TreeNode leastVisit = null;

        while(!stack.isEmpty() || node != null){

            //左子树进栈
            if(node != null){
                stack.push(node);
                node = node.left;
            }else {
                node = stack.peek();

                //此时左子树为空,右子树必须存在且没有访问过,才能进栈
                if(node.right != null && node.right != leastVisit){
                    node = node.right;
                    stack.push(node);
                    //继续向左子树遍历
                    node = node.left;
                }else {
                    //表示入栈完成,要访问节点
                    stack.pop();
                    arr.add(node.val);
                    leastVisit = node;
                    node = null;
                }
            }
        }

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }

    private int[] inOrder(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;

        while (!stack.isEmpty() || node != null){
            if(node != null) {
                stack.push(node);
                node = node.left;
            }else {
                node = stack.pop();
                arr.add(node.val);
                node = node.right;
            }
        }

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }

    private int[] preOrder(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;

        while (!stack.isEmpty() || node != null){
            if(node != null){
                arr.add(node.val);
                stack.push(node);
                node = node.left;
            }else {
                node = stack.pop();
                node = node.right;
            }

        }

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}
