public class Main {
    public static void main(String[] args) throws Exception {
        MyQueue queue = new MyQueue(5);
        queue.insert(23);
        queue.insert(21);
        queue.insert(33);
        queue.insert(43);

        queue.display();
    }
}
class MyQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public MyQueue(){
        this(DEFAULT_SIZE);
    }
    public MyQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int remove = data[0];

        for(int i  = 1 ;i < end;i++){
            data[i-1] = data[i];
        }
        end--;
        return remove;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty Queue");
        }
        return data[0];
    }

    public void display(){
        for(int i = 0;i<end;i++){
            System.out.print(data[i]+" ");
        }
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }
}
