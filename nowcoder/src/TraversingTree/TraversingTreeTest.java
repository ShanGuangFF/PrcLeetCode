package TraversingTree;

import org.testng.annotations.Test;
import util.TreeNode;

/**
 * @author cc_ff
 * @creat 2021-04-2021/4/12-21:11
 */
public class TraversingTreeTest {

    @Test
    public void testTraversing(){
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        root.left = node1;
        root.right = node2;

        TraversingTree tree = new TraversingTree();
        int[][] traversing = tree.Traversing(root);

        for (int[] ints : traversing) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
    }
}
