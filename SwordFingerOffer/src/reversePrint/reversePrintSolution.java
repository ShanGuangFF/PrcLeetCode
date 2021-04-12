package reversePrint;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author cc_ff
 * @creat 2021-03-2021/3/2-15:39
 */
public class reversePrintSolution {
    ArrayList<Integer> tmp = new ArrayList<>();
    public int[] reversePrint_Recursively(ListNode head){
        reverse(head);
        int[] res = new int[tmp.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }

    private void reverse(ListNode head) {
        if (head == null)
            return;
        reverse(head.next);
        tmp.add(head.val);
    }

    public int[] reversePrint_Stack(ListNode head){
        LinkedList<Integer> stack = new LinkedList<>();
        while (head!= null){
            stack.addLast(head.val);
            head = head.next;
        }
        int[] ints = new int[stack.size()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = stack.removeLast();
        }
        return ints;
    }
}
