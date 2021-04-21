package L146_LRUCache;

import java.util.HashMap;

class LruCache {
    class QueNode{
        int key;
        int val;
        QueNode pre;
        QueNode next;
        public QueNode(){

        }
        public QueNode(int key,int val){
            this.key = key;
            this.val = val;
        }
    }


    private HashMap<Integer,QueNode> map = new HashMap<>();
    private int size;
    private int capacity;
    private QueNode head,tail;

    public LruCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new QueNode();
        tail = new QueNode();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            QueNode node = map.get(key);
            moveBehindHead(node);
            return node.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        QueNode node;
        if(map.containsKey(key)){
            node = map.get(key);
            node.val = value;
            moveBehindHead(node);
        }else{
            if(this.size == capacity){
                QueNode preNode = tail.pre;
                removeFromQue(preNode);
                map.remove(preNode.key);
                size--;
            }
            node = new QueNode(key,value);
            addToQue(node);
            map.put(key,node);
            size++;
        }
    }

    private void addToQue(QueNode node){
        node.pre = head;
        node.next = head.next;
        head.next = node;
        node.next.pre = node;
    }

    private void removeFromQue(QueNode node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private void moveBehindHead(QueNode node){
        removeFromQue(node);
        addToQue(node);
    }
}