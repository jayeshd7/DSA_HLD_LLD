package Revision


class LinkedList {
    private static class Node {
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
    private Node head;
    private int size = 0;
}

