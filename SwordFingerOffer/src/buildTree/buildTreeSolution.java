package buildTree;

import java.util.HashMap;

/**
 * @author cc_ff
 * @creat 2021-03-2021/3/2-18:08
 * 前序中序建立二叉树
 */
public class buildTreeSolution {
    int[] preorder;
    //用map寸中序获取根在中序中的序号
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree_Recursive(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        //遍历中序,时间复杂度O(N)
        for(int i = 0 ;i < inorder.length;i++){
            map.put(inorder[i],i);
        }
        return recur(0,0,inorder.length-1);

    }

    /*
        参数:
        root:为根在前序列中的序号
        left:树在中序的左边界
        right:树在中序的右边界
     */
    TreeNode recur(int root,int left,int right){
        if(left > right)
            return null;
        TreeNode node = new TreeNode(preorder[root]);
        int i = map.get(preorder[root]);
        node.left = recur(root+1,left,i-1);
        node.right = recur(i-left+root+1,i+1,right);
        return node;
    }
}
