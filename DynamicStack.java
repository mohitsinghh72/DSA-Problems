public class DynamicStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public DynamicStack(){
        this(DEFAULT_SIZE);
    }

    public DynamicStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            int[] temp = new int[(data.length)*2];
            for(int i = 0;i<data.length;i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        return data[ptr];
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        return data[ptr--];
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
}
