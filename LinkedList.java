
class LL {
    private Node head;
    private Node tail;
    private int size;

    LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size = size+1;
    }

    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.val+" -> ");
            node = node.next;
        }
        System.out.println("null");

    }

    public void insertIndex(int val, int index){
        if(index>size){
            System.out.println("Index is bigger than size");
            return;
        }
        if(index<0){
            System.out.println("index is less than 0");
            return;
        }
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;

        }
        Node temp = head;
        for(int i = 1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;

    }

    public int deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return -1;
        }
        int val = head.val;
        head = head.next;
        size--;
        if(head == null){
            tail = null;
        }
        return val;
    }

    public int deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return -1;
        }
        if(head.next == null){
            return deleteFirst();
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        int val = tail.val;
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }
    public int deleteIndex(int index){
        if(index <0){
            System.out.println("Index is less than 0");
            return -1;
        }
        if(index >= size){
            System.out.println("Index is greater than the size");
            return -1;
        }
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        Node temp = head;
        for(int i = 1;i<index;i++){
            temp = temp.next;
        }
        int val = temp.next.val;
        temp.next = temp.next.next;
        size--;
        return val;

    }

    public Node find(int value){
        Node temp = head;
        while(temp!=null){
            if(temp.val == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(tail == null){
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }
    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(6);
        list.insertIndex(100,2);
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());
//        System.out.println(list.deleteIndex(2));
        System.out.println(list.find(5));

        list.display();

    }
}
