package JAVA_BASICS;

public class MyCircularQueue {
    public static void main(String[] args) {
        MyCircularQueue queue = new MyCircularQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);

        queue.display();
    }
}

class MyCircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    public MyCircularQueue(){
        this(DEFAULT_SIZE);
    }
    public MyCircularQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end%data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int remove = data[front++];

        front = front % data.length;
        size--;
        return remove;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty Queue");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i]+" ");
            i++;
            i%=data.length;
        }while(i!=end);
        System.out.println("END");
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}