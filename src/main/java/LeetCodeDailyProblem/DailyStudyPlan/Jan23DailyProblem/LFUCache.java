package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

import java.util.HashMap;

public class LFUCache {
    public static void main(String[] args) {
        LFUCache cache = new LFUCache(2);
        cache.put(1,1);
        cache.put(2,2);
        System.out.println(cache.get(1));
        cache.put(3,3);
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));
        cache.put(4,4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }

    private int capacity;
    private int size;
    private Node head;
    private Node tail;
    private HashMap<Integer,Node> map;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.head = new Node();
        this.tail = new Node();
        this.map = new HashMap<>();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.freq++;
            update(node);
            return node.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(capacity == 0) return;
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.val = value;
            node.freq++;
            update(node);
        }else{
            if(size == capacity){
                map.remove(tail.prev.key);
                remove(tail.prev);
                size--;
            }
            Node node = new Node(key,value);
            map.put(key,node);
            add(node);
            size++;
        }
    }

    private void update(Node node){
        Node cur = node.next;
        while(cur != tail && cur.freq <= node.freq){
            cur = cur.next;
        }
        remove(node);
        addBefore(cur,node);
    }

    private void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void add(Node node){
        addBefore(head.next,node);
    }

    private void addBefore(Node next,Node node){
        node.next = next;
        node.prev = next.prev;
        next.prev.next = node;
        next.prev = node;
    }

    class Node {
        int key;
        int val;
        int freq;
        Node prev;
        Node next;

        public Node() {
        }

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.freq = 1;
        }
    }
}
