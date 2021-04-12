package reverseList;

import java.util.LinkedList;

/**
 * 反转链接
 * @author cc_ff
 * @creat 2021-03-2021/3/16-16:09
 */
public class ReverseList {
    public ListNode ReverseListSolution(ListNode head){
        LinkedList<ListNode> stack = new LinkedList<>();
        while(head != null){
            stack.addLast(head);
            head = head.next;
        }
        head = stack.removeLast();
        while(!stack.isEmpty()){
            head.next = stack.removeLast();
            head = head.next;
        }

        return head;
    }
}
