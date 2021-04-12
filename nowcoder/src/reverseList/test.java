package reverseList; /**
 * @author cc_ff
 * @creat 2021-03-2021/3/16-16:11
 */
import org.testng.annotations.Test;

import java.io.IOException;

public class test {

    @Test
    public void testReverseList(){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        ReverseList list = new ReverseList();
        ListNode node = list.ReverseListSolution(l1);
        while(node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }

    @Test
    public void test(){

    }

    public static void main(String[] args) throws IOException {


    }



}
