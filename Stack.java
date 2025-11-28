public class Main {
    public static void main(String[] args) throws Exception {
        Practice stack = new Practice(5);

        stack.push(10);
        stack.push(11);
        stack.push(12);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
class Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public Stack(){
        this(DEFAULT_SIZE);
    }
    public Stack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from Empty Stack");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from Empty Stack");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr == data.length-1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
}
