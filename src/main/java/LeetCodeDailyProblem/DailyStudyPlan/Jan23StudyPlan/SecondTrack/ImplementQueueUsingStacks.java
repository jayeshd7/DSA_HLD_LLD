package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.SecondTrack;

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }

    static class MyQueue {
        int [] arr;
        int front;
        int rear;
        int size;
        int capacity;

        public MyQueue() {
            arr = new int[1000];
            front = 0;
            rear = 0;
            size = 0;
            capacity = 1000;
        }

        public void push(int x) {
            if(size==capacity){
                return;
            }
            arr[rear] = x;
            rear = (rear+1)%capacity;
            size++;
        }

        public int pop() {
            if(size==0){
                return -1;
            }
            int temp = arr[front];
            front = (front+1)%capacity;
            size--;
            return temp;
        }

        public int peek() {
            if(size==0){
                return -1;
            }
            return arr[front];
        }

        public boolean empty() {
            return size==0;
        }
    }
}
