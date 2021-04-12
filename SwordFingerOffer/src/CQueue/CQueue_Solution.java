package CQueue;


import java.util.Stack;

/**
 * 两个栈实现队列
 * @author cc_ff
 * @creat 2021-03-2021/3/4-15:28
 */
public class CQueue_Solution {
//    LinkedList<Integer> stackA,stackB;
//    public CQueue_Solution(){
//        stackA = new LinkedList<>();
//        stackB = new LinkedList<>();
//    }
//    public void appendTail(int value){
//        stackA.addLast(value);
//    }
//
//    public int deleteHead(){
//        if(!stackB.isEmpty())
//            return stackB.removeLast();
//        if (stackA.isEmpty())
//            return -1;
//        while (!stackA.isEmpty())
//            stackB.addLast(stackA.removeLast());
//        return stackB.removeLast();
//    }

    Stack<Integer> stackA,stackB;
    public CQueue_Solution(){
        stackA = new Stack<>();
        stackB = new Stack<>();
    }

    public void appendTail(int value){
        stackA.push(value);
    }

    public int deleteHead(){
        if(!stackB.empty())
            return stackB.pop();
        if (stackA.empty())
            return -1;
        while (!stackA.empty())
            stackB.push(stackA.pop());
        return stackB.pop();
    }
}
