package AugustBatchProblem.Advanced.Trees;

import java.util.HashMap;

class Node {
    int key;
    int val;
    Node next;
    Node prev;
    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}
class LRUCache {
    final int capacity;
    HashMap<Integer, Node> h;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        h = new HashMap<>();
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }
    public void delete(Node curr) {
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
    }
    public void moveToHead(Node curr) {
        curr.next = head.next;
        head.next.prev = curr;
        head.next = curr;
        curr.prev = head;
    }
    public int get(int key) {
        if(h.containsKey(key)) {
            Node curr = h.get(key);
            delete(curr);
            moveToHead(curr);
            return curr.val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if(h.containsKey(key)) {
            Node curr = h.get(key);
            delete(curr);
            curr.val = value;
            moveToHead(curr);
        } else {
            if(h.size() < capacity) {
                Node curr = new Node(key, value);
                h.put(key, curr);
                moveToHead(curr);
            } else {
                Node curr = new Node(key, value);
                h.put(key, curr);
                moveToHead(curr);
                h.remove(tail.prev.key);
                delete(tail.prev);
            }
        }
    }
}
