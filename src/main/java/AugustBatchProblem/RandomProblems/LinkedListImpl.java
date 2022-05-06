package AugustBatchProblem.RandomProblems;

public class LinkedListImpl {

    private int data;
    private LinkedListImpl next;

    LinkedListImpl(int data){
        this.data = data;

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedListImpl getNext() {
        return next;
    }

    public void setNext(LinkedListImpl next) {
        this.next = next;
    }
}
