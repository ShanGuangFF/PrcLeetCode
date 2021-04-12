package LRUCache;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author cc_ff
 * @creat 2021-04-2021/4/12-0:47
 */
public class LruCache {
    static class Node{
        int key;
        int value;
        Node next;
        Node pre;
        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }


    /**lru缓存大小*/
    int lruSize;
    /**lruMap,只是为了存取快一点*/
    HashMap<Integer,Node> lruMap = new HashMap<>();
    /**双向链表头尾节点*/
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);


    /**
     * lru design
     * @param operators int整型二维数组 the ops
     * @param k int整型 the k
     * @return int整型一维数组
     */
    public int[] LRU (int[][] operators, int k) {
        //初始化
        lruSize = k;
        head.next = tail;
        tail.pre = head;
        //得出操作2的数组长度
        int len =(int) Arrays.stream(operators).filter(x -> x[0] == 2).count();
        int[] res = new int[len];
        for(int i = 0,j = 0;i < operators.length;i++ ){
            if(operators[i][0] == 1){
                lruSet(operators[i][1],operators[i][2]);
            }else{
                res[j++] = lruGet(operators[i][1]);
            }
        }

        return res;
    }

    /**若存在则更新其值,若不存在则插入*/
    private void lruSet(int key,int value){
        if(lruGet(key) > -1){
            lruMap.get(key).value = value;
        }else {
            if(lruMap.size() == lruSize){
                int currentKey = tail.pre.key;
                queueRemove(tail.pre);
                lruMap.remove(currentKey);
            }
            Node node = new Node(key,value);
            lruMap.put(key,node);
            queueAdd(node);
        }
    }


    /**返回key对应的value,不存在或移除返回-1*/
    private int lruGet(int key){
        if(lruMap.containsKey(key)){
            Node node = lruMap.get(key);
            queueRemove(node);
            queueAdd(node);
            return node.value;
        }
        return -1;
    }


    private void queueRemove(Node node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private void queueAdd(Node node){
        node.pre = head;
        node.next = head.next;
        head.next = node;
        node.next.pre = node;
    }

    @Test
    public void test(){
        int[][] nums = new int[][]{{1,1,1},{1,2,2},{1,3,2},{2,1},{1,4,4},{2,2}};

        LruCache lru = new LruCache();
        int[] ints = lru.LRU(nums, 3);
        for (int anInt : ints) {
            System.out.print(anInt+"\t");
        }

    }
}
